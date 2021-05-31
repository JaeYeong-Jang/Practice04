package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		
		int[] minilotto = new int[6];
		
		for(int i = 0 ; i < minilotto.length; i++ ) {
			
			int lotto_num = (int)(Math.random() * 45)+ 1;
			minilotto[i] = lotto_num;
			
			for (int j = 0; j < i; j++) {
				if(minilotto[i] == minilotto[j]) {
					i--;
					break;
				}
			}		
		}
		for(int arraynum = 0; arraynum < minilotto.length; arraynum++) {
			System.out.print(minilotto[arraynum] + "  ");
		}
	}

}
