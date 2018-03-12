package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요.: ");
		int month = sc.nextInt();
		
		switch(month){
			case 1:
				System.out.print("31days");
				break;
			case 2:
				System.out.print("28days");
				break;
			case 3:
				System.out.print("31days");
				break;
			case 4:
				System.out.print("30days");
				break;
			case 5:
				System.out.print("31days");
				break;
			case 6:
				System.out.print("30days");
				break;
			case 7:
				System.out.print("31days");
				break;
			case 8:
				System.out.print("31days");
				break;
			case 9:
				System.out.print("30days");
				break;
			case 10:
				System.out.print("31days");
				break;
			case 11:
				System.out.print("30days");
				break;
			case 12:
				System.out.print("31days");
				break;
				
		}
				
		sc.close();
	}

}
