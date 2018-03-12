package com.javaex.hw02;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// 5개의 숫자를 입력받아 평균을 구하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		int[] array = {0,0,0,0,0};
		double sum = 0;
		
		System.out.println("숫자 5개를 입력하세요.");
		for(int i = 0; i <array.length; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		double result = sum / 5;
		System.out.println("평균은 " + result);
		
		sc.close();
	}

}
