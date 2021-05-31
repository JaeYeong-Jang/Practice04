package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		
		int[] minilotto = new int[6];
		
		for(int i = 0 ; i < minilotto.length; i++ ) {
			
			int lotto_num = (int)(Math.random() * 45)+ 1;
			
			minilotto[i] = lotto_num;
		
			System.out.print(minilotto[i] + "  ");
		}
		
	}

}
