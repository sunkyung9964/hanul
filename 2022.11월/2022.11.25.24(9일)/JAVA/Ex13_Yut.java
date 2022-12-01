package com.hanul.control;

import java.util.Random;

public class Ex13_Yut {

	public static void main(String[] args) {

		// 윷을 던저 결과를 출력
		// 앞 : 1, 뒤 : 0
		// 도:앞뒤뒤뒤 -1, 개:앞앞뒤뒤-2, 걸;앞앞앞뒤-3, 윷;앞앞앞앞-4, 모:뒤뒤뒤뒤-0
		// 4개의 윷 숫자를 받는다
		Random r = new Random();
		
		int a = r.nextInt(2);
		int b = r.nextInt(2);
		int c = r.nextInt(2);
		int d = r.nextInt(2);
				
		char result;
		int sum = a+b+c+d;
		if(sum == 1 ) {
			result ='도';
		}else if(sum == 2 ) {
			result ='개';
		}else if(sum == 3 ) {
			result ='걸';
		}else if(sum == 4 ) {
			result ='윷';
		}else  {                 // 값이 변하지 않을때 else만 사용 혹 값이 변할시 else if사용
			result ='모';
		}
		System.out.println("" + a + b + c + d);
		System.out.println(sum); // 각 윷의 숫자를 더해서 1이면:도 2이면:개 3이면:걸 4이면:윷 0이면:모
		System.out.println("윷 결과는 : " + result);	
		
		
				
		
		
		
	}

}
