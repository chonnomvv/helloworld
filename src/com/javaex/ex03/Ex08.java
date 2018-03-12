package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// 90점 이상 점수들
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert number: ");
		int score = sc.nextInt();
		
		/*if(score>=90) {
			System.out.println("grade A");
		}else if(score>=80 && score<90) {
			System.out.println("grade B");
		}else if(score>=70 && score<80) {
			System.out.println("grade C");
		}else if(score >=60 && score <70) {
			System.out.println("grade D");
		}else {
			System.out.println("Fail");
		}
*/
		
		sc.close();
	}

}
