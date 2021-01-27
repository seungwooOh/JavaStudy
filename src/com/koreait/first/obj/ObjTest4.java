package com.koreait.first.obj;

import java.util.Arrays;

import javax.swing.text.DefaultEditorKit.CopyAction;

public class ObjTest4 {

	public static void main(String[] args) {

		int[] arr = { 4, 7, 1, 9, 3 };
		
		int[] arr3 = arr;	// 얕은복사

		// 배열 복사하는 메소드 (깊은복사)
		int[] arr2 = copyArr(arr);

		orderBy(arr2);

		System.out.println(Arrays.toString(arr));	// { 4, 7, 1, 9, 3 }
		System.out.println(Arrays.toString(arr2));	// { 1, 3, 4, 7, 9 }

	}

	public static void orderBy(int[] arr) {
		Arrays.parallelSort(arr);

	}
	
	public static int[] copyArr(int[] arr) {
		int[] arr1 = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		
		return arr1;
	}
	

}
