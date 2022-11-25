package com.hanul.control;

import java.util.Scanner;

public class Ex08_If02 {

	public static void main(String[] args) {

/*	int score =63; //높은점수부터
	if(score >=90) {
		System.out.println(score + "는 90점 이상");
	}
	if(score >=80) {
		System.out.println(score + "는 80점 이상");
	}	
	if(score >=70) {
		System.out.println(score + "는 70점 이상");
	}	
	if(score >=60) {
		System.out.println(score + "는 60점 이상");
	}	
	if(score <60) {
		System.out.println(score + "는 60점 미만");
	}	
*/		
	int score = 90;//낮은 점수부터
	if(score <60) {
		System.out.println(score + "는 60점 미만");
	}else if(score <70) {
		System.out.println(score + "는 60점 이상");
	}else if(score <80) {
		System.out.println(score + "는 70점 이상");
	}else if(score <90) {
		System.out.println(score + "는 80점 이상");
	}else if(score <=100){
		System.out.println(score + "는 90점 이상");
	}	
	
	// 주민등록상 남자 1,3 여자 2,4
	System.out.println("숫자를 입력하세요(1~4) => ");
	Scanner sc = new Scanner(System.in);
	int gender = sc.nextInt();
	if (gender == 1 || gender == 3) {
		System.out.println("남자");
	}
	else if (gender == 2 || gender == 4) {
		System.out.println("여자");
	//}else if (gender == 5 || gender == 6 || gender == 7 ||gender == 8 || gender == 9) {
		//System.out.println("트렌스젠더");
	}else {
		System.out.println("입력값이 아닙니다"); 
	}
	
	}

}
