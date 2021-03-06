package com.koreait.first.obj;

public class StaticTest2 {

	public static void main(String[] args) {
		// n1 = 22, n2 = 55
		
		// 인스턴스 객체를 활용하여 계산
		InstCalc ic = new InstCalc();
		
		ic.n1 = 22;
		ic.n2 = 55;
		
		System.out.println(ic.sum());
		
		// static 메소드를 활용하여 계산
		System.out.println("sum : " + StatCalc.sum(22, 55));
		
		
		
	}

}

class StatCalc {
	static int sum(int n1, int n2) {
		return n1 + n2;
	}
}

class InstCalc {
	int n1;
	int n2;
	
	int sum() {
		return n1 + n2;
	}
	
}