package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		//i<=intArray.length --> i<intArray.length
		//배열에 6번째 방이 존재하지 않으므로 오류가 발생
		for(int i=0;i<intArray.length;i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
	}

}
