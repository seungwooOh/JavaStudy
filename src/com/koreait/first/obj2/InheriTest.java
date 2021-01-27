package com.koreait.first.obj2;

public class InheriTest {

	public static void main(String[] args) {
		
		ClassA cA = new ClassA();
		cA.setName("홍길동");
//		cA.setAge();
//		cA.print();
		
		ClassB cB = new ClassB();
		cB.setName("김남길");
		cB.setAge(10);
//		cB.print();
		
		ClassC cC = new ClassC();
		cC.setName("윤두준");
		cC.setAge(20);
		cC.print();
		
		
		
	}

}
