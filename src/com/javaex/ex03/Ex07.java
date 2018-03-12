package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 3의 배수인지 확인하는
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert number: ");
		int num = sc.nextInt()%3;
		
		/*if(num%3 == 0) {
			System.out.println(num + "는 3의 배수입니다.");
		}else {
			System.out.println(num + "는 3의 배수가 아닙니다.");
		}*/
	
		switch(num) {
		case 0:
			System.out.println("3의 배수");
			break;
		case 1:
		case 2:
			System.out.println("3의 배수 아님");
			break;
		}
		
		sc.close();

	}

}
