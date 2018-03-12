package com.javaex.ex04;

public class Ex05 {

	public static void main(String[] args) {
		// 6의 배수이자 14의 배수인 가장 적은 정수
		
		int i = 0;
		while(true) {
			i++;
			if(i%6 == 0 && i%14 ==0) {
				System.out.println(i);
				break;
			}else {
				continue;
			}
		}

	}

}
