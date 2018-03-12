package com.javaex.hw02;

public class Practice03 {

	public static void main(String[] args) {
		// This,is,a,pencil ==> This is a pencil(,를 공백으로 만들기)
		char c[] = {'T','h','i','s',',','a',',','p','e','n','c','i','l'};
		System.out.println(c);
		for(int i = 0; i < c.length; i++) {
			if(c[i]==',') {
				c[i] = ' ';
			}
		}
		
		System.out.println(c);

	}

}
