package com.hanul.control;

public class Ex18_While01 {

	public static void main(String[] args) {

		// 반복문  : 일정한 작업을 규칙적으로 반복 실행할때
		// 똑같은 명령문을 여러번 작성하지 않고 반복문을 사용한다
		// while, do~while, for 문이 있다
		// Hello Java를 10번 출력하는 while문
		// 초기화식
		int cnt =1;
		//조건식이 참이면 실행 거짓이면 빠져나옴
		while(cnt <=10) {
			// 실행문
			System.out.println("Hello Java");
			// 초기화 식을 변경시켜야 함
			cnt++;
			
		}
		
		// 1부터 10까지 출력하는 While문
		int no1 =1; 
		while(no1 <=10) {
			System.out.println(no1);
			no1++;
		}
		
		
		// 10부터 1까지 출력
		int no2 = 10;
		while(no2 >= 1) {
			System.out.println(no2);
			no2--;
		}
		
		
	}

}
