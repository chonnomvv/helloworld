package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요.");
		System.out.println("1.자바 2.C 3.C++ 4.파이썬");
		System.out.print("과목 번호: ");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.print("101호");
			break;
			
		case 2:
			System.out.print("202");
			break;
			
		case 3:
			System.out.print("303");
			break;
			
		case 4:
			System.out.print("404");
			break;
			
		default:
			System.out.print("wrong number");
			break;
		}
		
		sc.close();
	}

}
