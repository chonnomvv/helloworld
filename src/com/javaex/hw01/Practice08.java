package com.javaex.hw01;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		// 은행프로그램

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		boolean a= true;
		
		while (a) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 || 2.출금 || 3.잔고 || 4. 종료 ");
			System.out.println("--------------------------------");

			System.out.print(" 선택 : ");
			int number = sc.nextInt();

			switch (number) {
			case 1:
				System.out.print("예금액을 입력하세요 : ");
				int plus = sc.nextInt();
				sum = sum + plus;
				break;

			case 2:
				System.out.print("출금액을 입력하세요 : ");
				int minus = sc.nextInt();

				if (sum < minus) {
					System.out.println("잔액이 모자랍니다. ");
				} else {
					sum = sum - minus;
				}
				break;

			case 3:

				System.out.println("당신의 잔고는 : " + sum + "입니다. ");
				break;

			case 4:
				System.out.println("프로그램을 종료합니다. ");
				a=false;
				break;

			default:
				System.out.println("다시 입력해주세요. ");
				

				
				
			}

		}

		sc.close();
	}

}
