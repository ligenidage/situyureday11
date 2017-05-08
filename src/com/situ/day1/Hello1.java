package com.situ.day1;

import org.junit.Test;

public class Hello1 {
	public static void main(String[] args) {
		System.out.println("Helloworld");
	}
	
	@Test
	public void Xunhuan() {
		int i = 1;
		int sum = 0;
		while(i <= 100) {
			sum = sum + i;
			i++;
		}
		System.out.println("1到100想加等于：" + sum);
	}

	@Test
	public void for1() {
		for(int i = 1; i <= 3; i++) {
			System.out.println("hello!");
		}
	}
	
	@Test
	public void for2() {
		int sum = 0;
		for(int num = 1;  num <= 100;  num ++){
			sum = sum + num;
		}
		System.out.println("sum:" + sum);
	}
	
	@Test
	public void for3() {
		for(int b = 1; b <= 3; b++) {
		    for(int a = 1; a <= 4; a++) {
			System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
