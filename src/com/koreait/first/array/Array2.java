package com.koreait.first.array;

public class Array2 {

	public static void main(String[] args) {
		
		int tot = 0;
		int[] arr = new int[20];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d : %d\n", i, arr[i]);
		}
		
		// 각 배열에 있는 값들을 모두 더한 값을 출력해주세요
		for(int i = 0; i < arr.length; i++) {
			tot += arr[i];
		}
		System.out.println("총합 : " + tot);
		
		
		
	}
}
