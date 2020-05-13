package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		
		/*
		int change_set = 1;
		for(int i=wonArray.length-1;i>=0;i = i-2) {
			wonArray[i] = change_set;
			wonArray[i-1] = change_set*5;
			change_set = change_set*10;
		}
		
		for(int i=0;i<wonArray.length;i++) {
			
			System.out.println(wonArray[i]);
		}
		*/
		
		
		int[] numArray = new int[10];
		
		int money, change;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액: ");
		money = sc.nextInt();
		
		for(int i=0;i<wonArray.length;i++) {
			numArray[i] = money/wonArray[i];
			money = money%wonArray[i];
			System.out.println(wonArray[i] + "원:" + numArray[i] + "개");
		}
		
		
		/*
		for(int i=0;i<numArray.length;i++) {
			System.out.println(wonArray[i] + "원:" + numArray[i] + "개");
		}
		*/
		
		

		
		/*
		while(flag) {
			if(money>=50000) {
				change = money/50000;
				money = money%50000;
				System.out.println("50000원:" + change + "개");
			} else if(money>=10000) {
				change = money/10000;
				money = money%10000;
				System.out.println("10000원:" + change + "개");
			} else if(money>=5000) {
				change = money/5000;
				money = money%5000;
				System.out.println("5000원:" + change + "개");
			} else if(money>=1000) {
				change = money/1000;
				money = money%1000;
				System.out.println("1000원:" + change + "개");
			} else if(money>=500) {
				change = money/500;
				money = money%500;
				System.out.println("500원:" + change + "개");
			} else if(money>=100) {
				change = money/100;
				money = money%100;
				System.out.println("100원:" + change + "개");
			} else if(money>=50) {
				change = money/50;
				money = money%50;
				System.out.println("50원:" + change + "개");
			} else if(money>=10) {
				change = money/10;
				money = money%10;
				System.out.println("10원:" + change + "개");
			} else if(money>=5) {
				change = money/5;
				money = money%5;
				System.out.println("5원:" + change + "개");
			} else {
				change = money/1;
				System.out.println("1원:" + change + "개");
				flag = false;
			}
		}
		*/
		
		
	}

}
