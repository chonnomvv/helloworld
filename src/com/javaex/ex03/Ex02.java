package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
	
		
		if(num>0) {
			if(num%2 == 0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
			
		}else if(num<0) {
			System.out.println("음수");
		}else {
			System.out.println("0입니다.");
		}
		
		sc.close();
	}

}
