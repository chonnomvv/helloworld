package com.javaex.ex04;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// 사용자의 숫자를 입력 받아 더하는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		
		double sum = 0;
		
		while(true) {
			System.out.print("숫자를 입력하세요(0이면 종료): ");
			double num = sc.nextDouble();
			
			
			if(num == 0) {
				System.out.println("프로그램을 종료합니다. ");
				break;
			}else {
				
				sum = sum + num;
				System.out.println("총 합은 = " + sum);
				
			}
		}
		
		sc.close();
	
	}

}
