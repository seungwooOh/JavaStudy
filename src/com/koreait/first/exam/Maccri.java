package com.koreait.first.exam;

public class Maccri implements OverWatch {
	
	public Maccri() {
		lclick();
		shift_click();
		q_button();
		e_button();
	}

	@Override
	public void lclick() {
		System.out.println("파스키퍼");
	}

	@Override
	public void shift_click() {
		System.out.println("구르기");
	}

	@Override
	public void q_button() {
		System.out.println("화야의 무법자 (궁극기)");
	}

	@Override
	public void e_button() {
		System.out.println("섬광탄");
	}
	
	public void faceMaccri() {
		System.out.println("사막에서 총쏘는 듯하게 생겼다.");
	}

}
