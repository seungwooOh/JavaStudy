package com.koreait.first.method;

public class Method1 {
			// 1. 한메소드는 한가지 동작만 하는것이 좋다.(작은단위)
							// 선언부
							// 파라미터(Parameter)
	public static void main(String[] args) {
		sum("값", 1, 2);
		sum(10, 20, "값");
	}
	
	// 오버로딩
	// 수정할일 없을때, 일을 마무리 할 경우 사용
	public static void sum(String str, int n1, int n2) {
		System.out.printf("%s : %d + %d = %d\n",str , n1, n2, (n1+n2));
	}
	
	public static void sum(int n1, int n2, String str) {
		sum(str, n1, n2);
	}
	
	

}
