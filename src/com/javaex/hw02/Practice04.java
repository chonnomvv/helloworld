package com.javaex.hw02;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// 키보드에서 정수 액수 입력 받아서 50000, 10000, 5000, 1000, 500, 100, 50, 10 몇개씩인지 

		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print("금액을 입력하세요: ");
		number = sc.nextInt();
		
		
		int abc[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		int answer[] = new int[10];
		
		for(int i = 0; i<10; i++) {
			answer[i] = number/abc[i];
			number = number - answer[i]*abc[i];
		}
		
		for(int j = 0; j < 10; j ++) {
			System.out.println(abc[j] + " = " + answer[j]);
		}
		
		
		sc.close();
	}
		

		
		/*Scanner sc = new Scanner(System.in);
		
		int a,b,c,d,e,f,g,h,i = 0;
		
		System.out.print("금액을 입력하세요: ");
		int num = sc.nextInt();
		
		a = num/50000;
		b= (num - 50000*a)/10000;
		c= (num - 50000*a - 10000*b)/5000;
		d=( num - 50000*a - 10000*b - 5000*c)/1000;
		e= (num - 50000*a - 10000*b - 5000*c-1000*d)/500;
		f= (num - 50000*a - 10000*b - 5000*c-1000*d-500*e)/100;
		g= (num - 50000*a - 10000*b - 5000*c-1000*d-500*e-100*f)/50;
		h= (num - 50000*a - 10000*b - 5000*c-1000*d-500*e-100*f-50*g)/10;
		i= (num - 50000*a - 10000*b - 5000*c-1000*d-500*e-100*f-50*g-10*h);
		
		
		
		int result[] = {a,b,c,d,e,f,g,h,i};
		for(int j = 0; j < result.length; j++) {
			System.out.println(result[j]);
		}	
		sc.close();
		
		
	}*/
}
