package com.koreait.first;

public class AndOr {

	public static void main(String[] args) {
		boolean r1 = true && true && true;	// false 가 나타날 확률이 높은걸 앞으로 적는다. 앞이 false면 뒤로는 관여 하지 않는다.
		System.out.println("r1 : " + r1);
		
		boolean r2 = true && true && false;
		System.out.println("r2 : " + r2);
		
		boolean r3 = true || false || false;	// true 가 나타날 확률이 높은걸 앞으로 적는다. 앞이 true면 뒤로는 관여 하지 않는다.
		System.out.println("r3 : " + r3);
		
		boolean r4 = false || false || false;
		System.out.println("r4 : " + r4);
		
		
		
	}

}
