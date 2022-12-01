package com.hanul.control;

import java.util.Scanner;

public class Ex22_For01 {

	public static void main(String[] args) {

		//for문
		//for(초기화식; 조건식; 조건을 증감식){//조건변경식
		//		실행명령문;
		//
		//}
		// *를 10개 출력하기
		
		/*for(int a=1; a<=10; a++) {
			System.out.print("*");	
		}
		System.out.println();
		
			// 1~10까지 출력하기
		for(int i=1; i<=10; i++) {
			System.out.print(i);
		}
		
		System.out.println();
			// 3단 출력하기
		for(int i=1; i<=9; ++i) {
			System.out.println("3X " + i + "=" + i*3);
		}
		for(int i=1; i<=9; ++i) {
			System.out.printf("%d X %d = %d\n", 3, i, 3*i);
		}
		
			//1~10까지 합
		int sum =0;
		for(int i=1; i<=10; i++) {
			//sum= sum + i; //sum += i;
			sum += i;
			System.out.println("1부터"+ i + " 까지 합은 " + sum + "입니다");
		}	System.out.println();
			System.out.println("1부터 10까지 합은" + sum + "입니다");
		
			System.out.println();
			// 1~10까지의 숫자중 짝수만 출력
		for(int i = 1; i <= 10; i++ ) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}*/
		
		// 실습 1
		// 1~10까지의 숫자중 홀수만 출력하는 프로그램을 for문으로 작성
		System.out.println("실습1");
		for(int i = 1; i <= 10; i++ ) {
			if(i%2==1) {
				System.out.println(i);
			}
			
		}
		
		// 실습 2
		// 출력하고 싶은 구구단 수를 입력받아 출력하는 프로그램을 for문으로 작성 
		Scanner sc = new Scanner(System.in);
		System.out.println("실습2 구구단 숫자를 입력하세요");
		int i=sc.nextInt();
	
		for(int j=1; j<=9; j++) {
			System.out.println(i +" X " + j + "=" + i*j);
		}
		
		
				
		// 실습 3
		// 1부터 입력받은 수까지 합을 출력하는 프로그램을 for문으로 작성 
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("실습3 숫자를 입력하세요");
		int z=sc1.nextInt();
		int sum1 =0;
		for(int a = 1; a<=z; a++){
			sum1= sum1+a;
		}
		System.out.println(sum1);
				
		
		// 실습 4
		// 1부터 입력받은 수까지 중에서 3의 배수만  출력하는 프로그램을 for문으로 작성 
		Scanner sc2 = new Scanner(System.in);
		System.out.println("실습4 숫자를 입력하세요");
		int c=sc2.nextInt();
		
		for(int f=1; f<=c; f++){
			if(f%3==0) {
				System.out.println(f);	
				
			}
		
	}
		
		
		
		
	}
}
