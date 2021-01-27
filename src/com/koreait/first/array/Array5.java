package com.koreait.first.array;

import java.util.Arrays;

public class Array5 {
	
	public static void main(String[] args) {
		
		int[] arr = {9, 4, 7, 5, 1, 3, 0};
		
		int temp = 0;
		/*
		for(int i = 0; i < arr.length-1; i++) {
			for(int z = i+1; z < arr.length; z++) {
				if(arr[i] > arr[z]) {
					temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		*/
		
		// 선택정렬
		for(int i = 0; i < arr.length-1; i++) {
			int least = i;
			for(int z = i+1; z < arr.length; z++) {
				if(arr[least] > arr[z]) {
					least = z;
				}
			}
			
			if(i != least) {
				temp = arr[least];
				arr[least] = arr[i];
				arr[i] = temp;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
