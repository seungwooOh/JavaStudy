package com.koreait.first.control;

public class Switch {

	public static void main(String[] args) {
		
		int num = 4;
		
		switch(num) {	// 문자열 비교에 주로 쓰임
			case 1:
				System.out.println("1입니다.");
				break;
			case 2:
				System.out.println("2입니다.");
				break;
			case 3:
				System.out.println("3입니다.");
				break;
			case 4:
				System.out.println("4입니다.");
				break;
			default:
				System.out.println("1~4가 아닙니다.");
		}
		
		System.out.println("---------------");
		
		String season = "가을";
		
		switch(season) {
			case "봄":
				System.out.println("꽃이 피었읍니다.");
				break;
			case "여름":
				System.out.println("물놀이 가요");
				break;
			case "가을":
				System.out.println("단풍구경 갑니다.");
				break;
			case "겨울":
				System.out.println("눈싸움 해요~~");
				break;
			default:
				
		}
		
	}

}
