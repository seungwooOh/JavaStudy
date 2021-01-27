package com.koreait.first.obj;

public class ObjTest {

	public static void main(String[] args) {
		
		int mNum = 10;
		
		NumberBox nbx = new NumberBox();
		nbx.num = 10;
		nbx.str = "hello";
		
		changeVal(mNum);
		changeVal(nbx);
		changeVal2(nbx);
		
		System.out.println("mNum : " + mNum);
		System.out.println("nbx.num : " + nbx.num);
		System.out.println("nbx.str : " + nbx.str);
		
	}
	
	public static void changeVal(int num) {
		num = 20;
	}
	
	public static void changeVal(NumberBox pNbx) {
		pNbx = new NumberBox();		// 새로운 참조변수.
		pNbx.num = 20;
	}
	
	public static void changeVal2(NumberBox pNbx) {	// 매개변수값을 : String str 로 주면 새로운 참조변수가 가르키기 때문에 값이 변경되지 않는다.
		pNbx = new NumberBox();
		pNbx.num = 100;
		pNbx.str = "ddd";
	}
	
	

}

class NumberBox {
	int num;
	String str;
}