package com.javaex.hw01;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		// 정수 5개를 입력받아 가장 큰 수 출력

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int maxNumber = 0;
		for(int i=0; i<=4; i++) {
			
			System.out.print("숫자 : " );
			
			int number = sc.nextInt();

			if(number >= maxNumber) {
				maxNumber = number;
				
			}	
		}
		sc.close();
		System.out.println("최대값은 : " + maxNumber + "입니다.");
		}	

}