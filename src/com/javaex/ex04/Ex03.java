package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 3의 배수인지 판별하는 프로그램. 0 입력되면 종료
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
		if(num != 0) {
			if(num%3 == 0) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수 아님");
				}
			
//			continue;
			}else {
				System.out.println("프로그램을 종료합니다. ");
				break;
				}
		
		} 
	
		sc.close();

	}

}
