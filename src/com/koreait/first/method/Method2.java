package com.koreait.first.method;

public class Method2 {

	public static void main(String[] args) {
		
		int r = sum(sum(sum(2,3),3), 2);
		
		System.out.println("r : " + r);
		
	}
	
	// 2차 가공 하기 편하다.
	// 재활용성 좋음
	public static int sum(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}

}
