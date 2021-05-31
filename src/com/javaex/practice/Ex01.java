package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for( int i = 0; i <= intArray.length; i++) { // intArray 배열의 요소의 개수는 5개인것에 반해 이 반복문의 종결조건을 수행하다 보면,
													 // result+=intArray[i] 식에서  intArray[5] <-- 있지도 않은 intArray배열의 6번째 요소값을 불러오려 하기때문에 오류가 발생한다.
			result = result + intArray[i];
		}

		System.out.println(result);
	}

}
