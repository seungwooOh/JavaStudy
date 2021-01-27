package com.koreait.first.vending;

import java.util.Scanner;

public class VendingMachineTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		String[] nmArr = {"콜라", "사이다", "환타", "솔의눈" };
		int[]	priceArr = {500, 600, 700, 800};
		
		System.out.println("-- 메뉴 --");
		for(int i = 0; i<nmArr.length; i++) {
			System.out.printf("%d. %s - %d원\n", i + 1, nmArr[i], priceArr[i]);
		}
				
		while(true) {
			System.out.print("메뉴선택 (0: 종료) > ");
			num = sc.nextInt();
			
			if(num == 0) {
				System.out.println("총 구매 금액 : " + sum);
				break;
			}
			
			if(num <= priceArr.length) {
				sum += priceArr[num-1];
			}
			
		}
		
	}

}
