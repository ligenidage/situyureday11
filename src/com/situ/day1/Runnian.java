package com.situ.day1;

import java.util.Scanner;

import org.junit.Test;

public class Runnian {
	public static void main(String[] args) {
		int year = 2030;
		if((year % 4 == 0 && year % 100 != 0) 
				|| (year % 400 == 0)){
			System.out.println(year + "年 是闰年");
		} else {
			System.out.println(year + "年 不是闰年");
		}	
	}
		
	@Test
	public void xueji() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学籍成绩：");
		int score = scanner.nextInt();
		System.out.println("score:" + score);
		if(score < 0 || score > 100){
			System.out.println("无效");
			return;
		}
		
		if(score >= 90 && score <= 100) {
			
			
			System.out.println("优秀");
		} else if(score >= 80 ) {
			System.out.println("良好");
		} else if(score >= 70 )  {
			System.out.println("一般");
		} else if(score >= 60 ) {
			System.out.println("及格");
		} else if(score < 60) {
			System.out.println("不及格");
		} 
	}
	
	@Test
	public void kiuting(){
		
	}
	
}
