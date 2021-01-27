package com.koreait.first.array;

import java.util.Arrays;

public class Array4 {
	
	// 버블정렬
	public static void main(String[] args) {
		
		int temp = 0;
		int[] arr = {7, 4, 5, 1, 3, };
		
		
		/*
		temp = arr[1];
		arr[1] = arr[0];
		arr[0] = temp;
		*/
		
		for(int i = arr.length-1; i > 0; i--) {
			for(int z = 0; z < i; z++) {
				if(arr[z] > arr[z+1]) {
					temp = arr[z+1];
					arr[z+1] = arr[z];
					arr[z] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
	}

}
