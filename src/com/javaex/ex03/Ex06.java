package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요.: ");
		int month = sc.nextInt();
		
		if(month == 1||month == 3||month == 5||month == 7||month == 8||month == 10||month == 12) {
			System.out.println("31days");
		}else if(month == 2) {
			System.out.println("28days");
		}else if(month == 4||month == 6||month == 9||month == 11) {
			System.out.println("30days");
		}else {
			System.out.println("1~12");
		}
		
		sc.close();
	}

}
