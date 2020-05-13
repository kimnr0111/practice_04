package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr_num = new int[5];
		int sum_num = 0;
		double avg_num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5개의 숫자를 입력해주세요");
		for(int i=0;i<arr_num.length;i++) {
			arr_num[i] = sc.nextInt();
			sum_num = sum_num + arr_num[i];
		}
		avg_num = sum_num/5;
		
		System.out.println("평균은" + avg_num + "입니다.");
		
		

	}

}
