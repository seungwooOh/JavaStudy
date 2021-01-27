package com.koreait.first.loop;

public class For7 {

	public static void main(String[] args) {
		
		int star = 6;
		String str = "_";
		
		/*
		for(int i = 0; i < star; i++) {
			for(int z = star; z > i + 1; z--) {
				System.out.print(str);
			}
			for(int z = 0; z <= i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < star; i++) {
			for(int z = 0; z < star; z++) {
				if(z < star - (i + 1)) {
					System.out.print(str);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		*/
		for(int i = 1; i <= star; i++) {
			for(int z = 0; z < star; z++) {
				if(star - i > z) {
					System.out.print("_");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for(int i = star; i > 0; i--) {
			for (int z = 1; z <= star; z++) {
				if(i > z) {
					System.out.print("_");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}

}
