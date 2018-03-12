package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		System.out.print("점수를 입력하세요: ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num>=60) {
			System.out.println("합격입니다.");
		} else{
			System.out.println("불합격입니다.");
		}
		
		sc.close();
		
		
		
	}

}
