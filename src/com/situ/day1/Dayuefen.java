package com.situ.day1;

import java.util.Scanner;

import org.junit.Test;

public class Dayuefen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		System.out.println(year + "年" + month + "月");
		if(month < 1 || month >12){
			System.out.println("非法输入");
			return;
		}
		if(month == 1 || month == 3 || month == 5 || month == 7
				|| month == 8 || month == 10 || month == 12){
			System.out.println("有31天");
		} else if(month == 4 || month == 6 || month == 9 || month == 11 ){
			System.out.println("有30天");
		} else {
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
				System.out.println("有28天");
			} else {
				System.out.println("有29天");
			}
		}
	}
	
//	@Test
//	public void Yuefen1(){
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("输入");
//		int year = scanner.nextInt();
//		System.out.println("输入");
//		int month = scanner.nextInt();
//		System.out.println(year + "年" + month + "月");
//		//if(month < 1 || month >12){
//		//	System.out.println("非法输入");
//		//	return;
//		//}
//		switch (month){
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			System.out.println("有31天");
//			break;
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			System.out.println("有30天");
//			break;
//		case 2:
//			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
//				System.out.println("有28天");
//			} else {
//				System.out.println("有29天");
//			}
//			break;
//		default:
//			System.out.println("非法");
//			break;
//		}
//	}
	
	@Test
	public void Shu(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入");
		int num1 = scanner.nextInt();
//		System.out.println("输入");
		int num2 = scanner.nextInt();
		int max = max(num1,num2);
		System.out.println("最大值" + max);
	}
	public int max(int num1,int num2){
		if(num1 > num2){
			return num1;
		} else {
			return num2;
		}
	}
}
