package com.javaex.array;

public class Ex03 {

	public static void main(String[] args) {
		// 
		
		int[] numbers = new int[6];
		
		for(int i = 0; i <numbers.length; i++) {
			numbers[i] = (int)(Math.random()*45+1);
			System.out.print(numbers[i] + " " );
			
		}

	}

}
