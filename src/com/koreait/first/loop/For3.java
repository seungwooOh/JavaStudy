package com.koreait.first.loop;

public class For3 {

	public static void main(String[] args) {
		
		int dan = 3;
		
		for(int i = 67; i < 76; i++) {
//			System.out.println(dan + "*" + i + "=" + (dan * i));
			System.out.printf("%d * %d = %d\n", dan, (i-66), (dan * (i-66)));
		}
		
		
		
	}

}
