package com.koreait.first.test;

import java.util.Arrays;

public class ArrayListTest3 {

	public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(1, 500);
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println("삭제 : " + list.remove(1));
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
		
		System.out.println(list);
		System.out.println("삭제 : " + list.remove(1));
		System.out.println(list);
		
//		String result = list.toString() + "ddd";
//		System.out.println(result);
		
	}

}