package com.javaex.ex05;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		int sum = 0;
//		int count = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		do {
			num = sc.nextInt();
			sum += num;
			System.out.println("합계: " + sum);
//			count ++ ;
			if(num == 0) {
				System.out.println("프로그램을 종료합니다.");
			}
			
		}while(num !=0);
		
		sc.close();

	}

}
