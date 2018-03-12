package com.javaex.hw02;

public class Practice05 {
	
	public static void main(String[] args) {
		
		int[] array = new int[6];
		
			
		for(int i = 0; i <array.length; i++) {
		
				array[i] = (int)(Math.random()*45+1);

				for(int j = 0 ; j < i; j++) {
					if(array[i]==array[j]) {
						i--;
						System.out.print("중복");
					}
				}
		
		}
		for(int k = 0; k<array.length;k++) {
			System.out.print(array[k] + "\t" + "");
		}
		
		
		

	}
	
}
