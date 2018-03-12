package com.javaex.hw01;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// 숫자 피라미드
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int i = sc.nextInt();

		for(int j = 1; j <= i; j++) {
			for(int k = 1; k <=j; k++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		sc.close();
	}

}
