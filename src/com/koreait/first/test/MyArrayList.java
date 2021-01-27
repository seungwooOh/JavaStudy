package com.koreait.first.test;

public class MyArrayList {
	private int[] arr;
	
	public MyArrayList() {
		init();
	}
	
	public void init() {
		arr = new int[0];
	}
	
	
	public void add(int val) {
		int[] temp = new int[arr.length + 1];
		temp[arr.length] = val;
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];			
		}
		arr = temp;
		
	}
	
	public void add(int idx, int val) {
		int[] temp = new int[arr.length + 1];
		temp[idx] = val;
		
		for(int i = 0; i < arr.length; i++) {
			if(i < idx) {
				temp[i] = arr[i];				
			} else {
				temp[i+1] = arr[i];
			}
			
//			temp[i<idx ? i : i+1] = arr[i];
		}
		
		arr = temp;
	}
	
	
	
	public int[] getArr() {
		return arr;
	}

	public int remove(int idx) {
		int[] tmp = new int[arr.length-1];
		// arr[] = [100,200,300];
		//tmp[]  =  [0,0];
		int tmp_num = arr[idx];
		
		//tmp_num = 200;
		
		// i =0  => tmp[]  = [100,0];
		// i = 1 => tmp[]  = [100,300];
		for (int i = 0; i < tmp.length; i++) {
			if(i < idx) {
				tmp[i] = arr[i];	
			}else {
				tmp[i] = arr[i+1];
			}
			
		}
		
		// tmp[i] = arr[i < idx ? i : i+1];
		arr = tmp;
		
		
		return tmp_num;
	}
	
	
	
	public int get(int idx) {
		return arr[idx];
	}
	
	/*
	@Override
	public String toString() {
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i < arr.length-1) {
				str += ",";
			}
//			str += arr[i] + (i < arr.length - 1 ? "," : "");
		}
		str +="]";
		return str;
	}
	*/
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			if(i < arr.length - 1) {
				sb.append(",");
			}
		}
		sb.append("]");
		
		return sb.toString();
	}
	
	
	
}
