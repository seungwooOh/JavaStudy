package com.koreait.first.vending;

import java.util.Scanner;

public class VendingMachineTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		System.out.println("-- 메뉴 --");
		System.out.println("1. 콜라 - 500원");
		System.out.println("2. 사이다 - 600원");
		System.out.println("3. 환타 - 700원");
		System.out.println("4. 솔의눈 - 800원");
		
		while(true) {
			System.out.print("메뉴선택 (0: 종료) > ");
			num = sc.nextInt();
			
			if(num == 1) {
				sum += 500;
			} else if(num == 2) {
				sum += 600;
			} else if(num == 3) {
				sum += 700;
			} else if(num == 4) {
				sum += 800;
			} else if(num == 0) {
				System.out.println("총 구매 금액 : " + sum);
				break;
			}
		}
		
	}

}
