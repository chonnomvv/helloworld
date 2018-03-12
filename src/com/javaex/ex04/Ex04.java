package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {
		// 1에서 20까지의 수에서 2의 배수와 3의 배수를 제외한 숫자 (for, continue 사용)
		
		for(int i = 1; i <=20; i++) {
			if(i%2 == 0 || i % 3 == 0) {
				
			} else {
				System.out.println(i);
			}
		}

	}

}
