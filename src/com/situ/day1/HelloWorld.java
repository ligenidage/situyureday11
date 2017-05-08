package com.situ.day1;

import org.junit.Test;

public class HelloWorld {
	public static void main(String[] args){
		System.out.println("helloworld!");
        //num1是为变量标识符  字母，数字，下划线   但不能为关键字和数字开头
		int num_1 = 80;
		num_1 = 90;
		int num_2 = 100;
		int result = num_1 + num_2;
		System.out.println(result);
	}
	
	@Test
	public void change() {
		int num1 = 5;
		int num2 = 3;
		System.out.println("before: " + num1);
		System.out.println("before: " + num2);
		// 交换两个变量的值
		int temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("after: " + num1);
		System.out.println("after: " + num2);
	}
	
	@Test
	public void test1(){
		//+-*/%
		int num1 = 4;
		int num2 = 10;
		int result0 = num1 + num2;
		int result = 10 / 4;
		int result1 = 10 % 4;
		System.out.println("result0" + result0);
		System.out.println("result:" + result);
		System.out.println("result1:" + result1 );
	}
	
	@Test
	public void test2(){
		int year = 2017;
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			System.out.println(year + "年 是闰年");
		} else{ 
			System.out.println(year + "年 不是闰年");
			}
	}
	
	@Test
	public void year(){
		int year = 1900;
		for(;year < 2017 ;year++){
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
				System.out.println(year + "年是闰年");
			}
		}
	}
	public void yun(){
		
	}
}


