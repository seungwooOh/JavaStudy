package com.koreait.first.loop;

public class While {
	public static void main(String[] args) {
		
		// 돌수 있는 수를 알때.
		for(int i = 0; i < 5; i++) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		
		// 언제 멈춰야 할지 알때, 멈추는 지점이 애매할때
		int i = 0;
		while(i < 5) {
			System.out.print(i + ", ");
			i++;
		}
		
		System.out.println();
		
		int z = 0;
		while(true) {
			if(z == 5) {
				break;
			}
			System.out.print(z + ", ");
			z++;
		}
		
		System.out.println();
		
		int y = 0;
		for( ;y < 10; y++) {	// for문 무한루프, y++ 증감식을지우면 무한루프
			System.out.print(y);
		}
		
		
		
	}
}
