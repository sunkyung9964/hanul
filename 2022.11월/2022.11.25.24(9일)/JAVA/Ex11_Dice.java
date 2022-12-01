package com.hanul.control;

import java.util.Random;

public class Ex11_Dice {

	public static void main(String[] args) {

		// 랜덤한 수를 발생시키는 클래스 : Random - 주사위게임
		/*Random r = new Random();
		int num = r.nextInt(100); // 0 ~ 99 까지 랜덤한 수를 생성
		System.out.println("랜덤수 : " + num);
		*/
		
		Random r = new Random();
		r.nextInt(6);  // 0~5까지 6경우의 수가 나온다
		System.out.println("주사위를 던지세요 ~~~~");
		
		int user = r.nextInt(6) + 1;
		int computer = r.nextInt(6) + 1;
		System.out.printf("사용자 %d, 컴퓨터 %d \n", user, computer);
		
		if(user > computer) {
		System.out.println("user 승");
		}else if(user < computer) {
		System.out.println("computer 승");	
		}else {
			System.out.println("무승부");	
		}
		
		
	}

}
