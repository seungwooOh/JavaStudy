package com.koreait.first.exam;

import java.util.Scanner;

public class OverWatchMain {

	public static void main(String[] args) {
		
		int number = 0;
		Scanner scan = new Scanner(System.in);
		OverWatch overWatch = null;
		
		System.out.print("캐릭터 선택 (1. 리퍼 2. 메이 3. 맥크리) : ");
		number = scan.nextInt();
		
		if(number == 1) {
			overWatch = new Reapper();
		} else if(number == 2) {
			overWatch = new Mei();
		} else if(number == 3) {
			overWatch = new Maccri();
		} else {
			System.out.println("잘못입력하였습니다.");
		}
		
		if(overWatch instanceof Reapper) {
			((Reapper) overWatch).faceReapper();
		} else if(overWatch instanceof Mei ) {
			((Mei) overWatch).faceMei();
		} else if(overWatch instanceof Maccri ) {
			((Maccri) overWatch).faceMaccri();
		}
		
		
		scan.close();
		
	}

}
