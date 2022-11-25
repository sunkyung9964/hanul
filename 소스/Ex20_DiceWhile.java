package com.hanul.control;

import java.util.Random;

public class Ex20_DiceWhile {

	public static void main(String[] args) {
		
		Random r = new Random();
		// r.nextInt(6);   // 0 ~ 5 까지 6경우의 수가 나온다
		int user = 0, computer = 0;
		do {
			System.out.println("주사위를 던지세요~~");
			user = r.nextInt(6) + 1; // 1 ~ 6으로 변경
			computer = r.nextInt(6) + 1;
			System.out.printf("사용자 %d, 컴퓨터 %d \n", user, computer);
			
			if(user > computer) {
				System.out.println("user win!!!");
			}else if(user < computer) {
				System.out.println("computer win!!!");
			}		
		}while(user == computer); // 조건식 : 비길때
		
		System.out.println("Dice completed");
	}

}
