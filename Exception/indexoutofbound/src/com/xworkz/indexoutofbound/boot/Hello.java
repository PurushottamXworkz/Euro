package com.xworkz.indexoutofbound.boot;

public class Hello {
	public static void main(String[] args) {
		int[] arr= new int[4];
		
		
		try {
			int i=arr[4];
		System.out.println("Hi Hello welcome");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
