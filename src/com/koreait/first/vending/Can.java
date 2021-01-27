package com.koreait.first.vending;

public class Can {
	
	private final String nm;		// final 상수, 대문자를 주는것이 좋다.
	private final int price;
	
	public Can(String nm, int price) {
		this.nm = nm;
		this.price = price;
	}

	public String getNm() {
		return nm;
	}

	public int getPrice() {
		return price;
	}
	
	
	
}
