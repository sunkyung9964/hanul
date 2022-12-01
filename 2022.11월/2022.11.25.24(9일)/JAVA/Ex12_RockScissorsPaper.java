package com.hanul.control;

import java.util.Random;

public class Ex12_RockScissorsPaper {

	public static void main(String[] args) {
		// 가위:0, 바위:1, 보:2
		Random r = new Random();
		r.nextInt(3);
		System.out.println("가위바위보를 하세요~~");
				
		int scissors = 0, rock= 1, paper= 2;
		int user = r.nextInt(3);
		int computer = r.nextInt(3);
		// 먼저 유저와 컴퓨터가 각각 랜덤수를 받는다
			System.out.println("사용자 : " + user +','+ " 컴퓨터 : " + computer );
		if ((user == scissors && computer == paper) || (user == rock && computer == scissors)
		|| (user == paper && computer == scissors)){
			System.out.println("user 승");
		}
		// 유저와 이기는 경유는유저:가위 컴퓨터:보, 유저:바위 컴퓨터:가위 유저:보 컴퓨터;바위
		 else if (user == computer){
			System.out.println("무승부");// 유저와 컴퓨터가 같은경우 비기고
			}else{
			System.out.println("computer 승");//나머지는 유저가 진다
		}
			
		
		
		
		
		
		
	}

}
