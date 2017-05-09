package com.situ.day2;

import org.junit.Test;

public class Shuzu {
	public static void main(String[] args) {
		int[] array = new int[7];
		array[6] = 3;
		array[5] = 6;
		array[4] = 8;
		array[3] = 10;
		array[2] = 4;
		array[1] = 2;
		array[0] = 1;
		for(int i = 0; i < array.length; i++ ){
			System.out.print(array[i] + "\t" );
		}
		int sum = sum(array);
		System.out.println(sum);
	}
	public static int sum(int[] array){
		int sum = 0;
	    for (int i = 0;i < array.length; i++){
			sum = sum + array[i];
		}
	    return sum;
	}
	
	@Test
	public void Max(){
		int[] array = new int[4];
		array[0] = 23;
		array[1] = 46;
		array[2] = 8;
		array[3] = 32;
		int max = max(array);
		System.out.println(max);
	}
	public int max(int[] array){
		int max = array[0];
		for(int i =1; i < array.length; i++){
			if(max < array[i]){
				max = array[i];
			}
		}
		return max;
	}
}
