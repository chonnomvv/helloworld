package com.javaex.hw01;

public class Practice01 {

	public static void main(String[] args) {
		//	1에서 100까지의 수에서 5의 배수이면서 7의 배수인 수를 출력하시오.
		int i = 1;
		while(i<=100) {
			if(i%5 == 0 && i%7 == 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
