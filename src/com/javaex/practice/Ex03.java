package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intA = { 3, 6, 9 };
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i=0;i<intA.length;i++) {
			System.out.println(intA[i]);
		}
		
		//intA 배열의 주소값과 intB 배열의 주소값을 같게 해줘서 intB를 수정하면 intA도 수정되어 20 6 10 출력

	}

}
