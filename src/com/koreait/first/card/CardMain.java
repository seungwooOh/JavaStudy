package com.koreait.first.card;

public class CardMain {

	public static void main(String[] args) {
		// 52개의 카드 객체를 담을수 있는 배열 생성
		// 52개의 서로 다른 값을 가지고 있는 카드 객체를 모두 담아주세요~
		
		Card[] card = new Card[52];
		int number = 0;
		
		String[] shapeArr = {"spade", "heart", "clover", "diamond"};
		String[] valueArr = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
//		Card c1 = new Card("spade", "2");
//		System.out.println(c1);
		
		for(int i = 0; i < shapeArr.length; i++) {
			for(int j = 0; j < valueArr.length; j++) {
				card[number] = new Card(shapeArr[i], valueArr[j]);
				number++;
			}
		}
		
		for(int i = 0; i < card.length; i++) {
			System.out.println(card[i]);			
		}
		
	}

}
