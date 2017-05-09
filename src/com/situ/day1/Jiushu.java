package com.situ.day1;

import org.junit.Test;

public class Jiushu {
	public static void main(String[] args) {
		int sum = 1;
		for(;sum <= 9; sum++) { 
			int result = sum * 9;
			System.out.print(sum + "*9=" + result + " ");
		}
	}
	
	@Test
	public void Shucheng(){
		for(int num1 = 1 ;num1 <= 9 ;num1++){
			for(int num2 = 1 ;num2 <= 9 ; num2++){
				if(num2 <= num1){
				//	int result = num1 * num2;
					System.out.print(num1 + "*" + num2 +"=" + (num1 * num2) + "\t");
				}
			}
			System.out.println();
		}
	}
}