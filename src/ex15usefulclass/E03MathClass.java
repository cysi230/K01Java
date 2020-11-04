package ex15usefulclass;

import java.lang.*;
/*
 Math클래스
 -java.lang 패키지에 포함된 클래스
 - 수학과 관련된 일련의 작업들을 처리함
 - 메소드는 static 으로 선언되어 객체생성벗이 사용가능
 */
public class E03MathClass extends Object {

	public static void main(String[] args) {

		System.out.println("원주율: "+Math.PI);
		
		float f = -3.14f;
		double d = -100.9;
		int num = -10;
		
		//절대값1
		System.out.println("### 절 대 값 ###");
		System.out.println("Math.abs: "+Math.abs(f));
		System.out.println("Math.abs: "+Math.abs(d));
		System.out.println("Math.abs: "+Math.abs(num));
		
		System.out.println("### 올 림 ###");
		System.out.println("Math.ceil: "+ Math.ceil(3.4));//4
		System.out.println("Math.ceil: "+ Math.ceil(-3.4));//-3
		System.out.println("Math.ceil: "+ Math.ceil(3.9));//4
		
		System.out.println("### 내 림 ###");
		System.out.println("Math.floor: "+ Math.floor(3.4));//3
		System.out.println("Math.floor: "+ Math.floor(-3.4));//-4
		System.out.println("Math.floor: "+ Math.floor(3.9));//3
		
		/*
		 반올림 :무조건 소수점 처ㅅ째자리에서 반올림처리한다
		 */
		System.out.println("### 반 올 림 ###");
		System.out.println("Math.round: "+ Math.round(3.499999));//버림
		System.out.println("Math.round: "+ Math.round(3.544444));//올림처리
		System.out.println("Math.round: "+ Math.round(-1.4));//-1
		System.out.println("Math.round: "+ Math.round(-1.5));//-1
		System.out.println("Math.round: "+ Math.round(-1.6));//-2
		System.out.println("Math.round: "+ Math.round(-3.51));//-4
		
		System.out.println("### 최 대 / 최 소 ###");
		System.out.println("Mah.max: "+ Math.max(100, 99));
		System.out.println("Mah.max: "+ Math.min(100, 99));
		
		System.out.println("### 난 수 ###");
		System.out.println((int)(Math.random()*45)+1);
		
		System.out.println("### 거 듭 제 곱 ###");
		System.out.println("2의 10승은?: "+ Math.pow(2, 10));	
	}
}