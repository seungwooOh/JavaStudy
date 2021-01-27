package com.koreait.first.card;

public class CardMain2 {

	public static void main(String[] args) {
		
		String[] shapes = {"spade", "heart", "clover", "diamond"};
		
		Card[] cardList = new Card[52];
		int idx = 0;
		for(String shape : shapes) {
			for(int z = 1; z <= 13; z++) {
				String val;
				switch(z) {
				case 1:
					val = "A";
					break;
				case 11:
					val = "J";
					break;
				case 12:
					val = "Q";
					break;
				case 13:
					val = "K";
					break;
				default :
					val = String.valueOf(z);
					break;
				}
				cardList[idx++] = new Card(shape, val);
			}
		}
		
		for(Card card : cardList) {
			System.out.println(card);
		}
		
	}

}
