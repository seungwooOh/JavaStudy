package com.koreait.first.obj2;

public class InheriTest3 {

	public static void main(String[] args) {
		
		ClassD cD = new ClassD("조용필", 30);
		cD.print();
		
		ClassA cA = new ClassB();
		
//		ClassB cB = new ClassA();
		
		ClassC cA_1 = new ClassD("김남정", 20);	
		cA_1.print();	
		
		ClassD cD_1 = (ClassD) cA_1;
		cD_1.ddd();
	}

}
