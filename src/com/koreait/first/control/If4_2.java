package com.koreait.first.control;

import java.util.Scanner;

public class If4_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성별을 입력해 주세요(남/여) : ");
		String gender = scan.next();	// null 값을 넣으면 주소값이 없다.
		
		System.out.print("키를 입력해 주세요 : ");
		int height = scan.nextInt();
		
		
		if(gender.equals("남") || "남자".equals(gender) || "man".equals(gender)) {	// 오류 발생을 감소하기 위햐여 "남자".equals(gender) 이렇게 쓰는걸 권장
			int avgHeight = 165;
			if (height > avgHeight) {
				System.out.println("당신은 평균 초과 입니다.");
			} else if (height == avgHeight) {
				System.out.println("당신은 평균 입니다.");
			} else {
				System.out.println("당신은 평균 미만 입니다.");
			}
		} else if(gender.equals("여") || "여자".equals(gender) || "woman".equals(gender) ) {
			int avgHeight = 157;
			if (height > avgHeight) {
				System.out.println("당신은 평균 초과 입니다.");
			} else if(height == avgHeight) {
				System.out.println("당신은 평균 입니다.");
			} else {
				System.out.println("당신은 평균 미만 입니다.");
			}
		}
		
		
	}

}
