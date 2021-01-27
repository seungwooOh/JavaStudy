package com.koreait.first.exam;

public class Reapper implements OverWatch {
	
	public Reapper() {
		lclick();
		shift_click();
		q_button();
		e_button();
	}

	@Override
	public void lclick() {
		System.out.println("헬파이어 샷건");
	}

	@Override
	public void shift_click() {
		System.out.println("망령화");
	}

	@Override
	public void q_button() {
		System.out.println("죽음의 꽃(궁극기)");
	}

	@Override
	public void e_button() {
		System.out.println("그림자 밝기");
	}
	
	public void faceReapper() {
		System.out.println("나는 유령이다.");
	}

}
