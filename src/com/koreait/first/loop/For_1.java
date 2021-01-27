package com.koreait.first.loop;

public class For_1 {
	public static void main(String[] args) {
		
		int star = 4;
		String result = "";
		
		/*
		result = result + "*";
		result = result + "*";
		result = result + "*";
		
		result += "*";
		result += "\n";
		result += "*";
		*/
		
//		System.out.println(result);
		
		for(int i = 0; i < star; i++) {
			for(int z = 0; z < star; z++) {
				result = result + "*";
			}
			result = result + "\n";
		}
		
		System.out.println(result);
		
	}
}
