package com.situ.day1;

public class Qi {
	public static void main(String[] args) {
        int num = 0;
        int i= 1;
        for( ;i <= 100; i++) {
        	if(i % 7 == 0){
        		num++;
        	}
        }
        System.out.println(num);
	}
}
