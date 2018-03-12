package com.javaex.hw01;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int number = sc.nextInt();
		int sum = 0;
		switch(number%2){
		case 0:
			
			for(int i = 2; i<=number; i++) {
				if(i%2 == 0) {
					sum = sum + i;
				}
				
			}
			System.out.println("총합은 " + sum + "입니다.");
			break;
			
		case 1:
			
			for(int i = 1; i <=number; i++) {
				if(i%2 !=0) {
					sum = sum + i;
				}
				
			}
			System.out.println("총합은 " + sum + "입니다.");
			break;
		}
		sc.close();
	}

}
