package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] wonArray = new int[] {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		int[] divwonArray = new int[10];
		
		System.out.print("금액 : ");
		int i_m = sc.nextInt();

		int minus = i_m;
				
		for( int i = 0; i < wonArray.length; i++) {
			if (minus >= wonArray[i]) {
				divwonArray[i] = minus / wonArray[i];
				minus = minus - divwonArray[i]*wonArray[i];
			}
			System.out.println(wonArray[i] + "원 : " +divwonArray[i]);
		}
		/*
		System.out.println("50000원 : " + divwonArray[0]);
		System.out.println("10000원 : " + divwonArray[1]);
		System.out.println("5000원 : " + divwonArray[2]);
		System.out.println("1000원 : " + divwonArray[3]);
		System.out.println("500원 : " + divwonArray[4]);
		System.out.println("100원 : " + divwonArray[5]);
		System.out.println("50원 : " + divwonArray[6]);
		System.out.println("10원 : " + divwonArray[7]);
		System.out.println("5원 : " + divwonArray[8]);
		System.out.println("1원 : " + divwonArray[9]);
		*/
		sc.close();
		
	}

}
