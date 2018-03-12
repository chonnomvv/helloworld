package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dan;
		int i = 1;
		
		System.out.println("단을 입력해주세요. ");
		System.out.print("단 : ");
		dan = sc.nextInt();
		
		/*while(i<10) {
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
		}*/
		
		for(i = 1; i<10; i++) {
			System.out.println(dan + " * "+ i + " = " + dan*i);
		}
		
		sc.close();
	}

}
