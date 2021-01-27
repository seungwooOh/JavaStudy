package com.koreait.first.control;

import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성별을 입력해 주세요(남/여) : ");
		String gender = scan.next();
		
		System.out.print("키를 입력해 주세요 : ");
		int height = scan.nextInt();
		
		int avgHeight = 0;
		
		if(gender.equals("남")) {
			avgHeight = 165;
			
		} else if(gender.equals("여")) {
			avgHeight = 157;
			
		}
		
		if (height > avgHeight) {
			System.out.println("당신은 평균 초과 입니다.");
		} else if (height == avgHeight) {
			System.out.println("당신은 평균 입니다.");
		} else {
			System.out.println("당신은 평균 미만 입니다.");
		}
		
		scan.close();
		
	}

}
