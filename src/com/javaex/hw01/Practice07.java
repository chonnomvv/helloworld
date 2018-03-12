package com.javaex.hw01;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String inputString;

		System.out.println("================");
		System.out.println("[숫자 맞추기 게임]");
		System.out.println("================");
		boolean yesno = true;
		while (yesno) {

			int answer = (int) (Math.random() * 45) + 1;
			System.out.println(answer);
			System.out.print("숫자를 입력하세요: ");

			int number = sc.nextInt();

			if (number > answer) {
				System.out.println("더 낮게!");

			} else if (number < answer) {
				System.out.println("더 높게!");
			} else {
				System.out.println("정답입니다.");
				sc.nextLine();
				System.out.println("게임을 종료하시겠습니까? [y/n]");

				inputString = sc.nextLine();

				if (inputString.equals("y")) {
					yesno = false;
				} else {
				}
			}

		}
		sc.close();

	}

}
