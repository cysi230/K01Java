package ex05method;

import java.util.Scanner;

//문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
//원의 반지름을 파라메타(매개변수)로 
//전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 이를 호출하는 main 메소드를 정의하라.
//
//메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
//-넓이공식 : 3.14 * 반지름 * 반지름
//-둘레공식 : 2 * 3.14 * 반지름
//
//실행결과]
//원의 둘레(5.5) : 34.54
//원의 넓이(5.5) : 94.985


public class QuCircleCalculator {
		static void circleRound(double r) {
			double round = 2 * 3.14 * r;
			System.out.println("원의둘레"+"("+r+") : "+round);
		}
		static void circleArea(double r) {
			double area = 3.14 * r * r;
			System.out.println("원의넓이" +"("+r+") : "+area);
		}
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("반지름값:");
			double rad = scanner.nextDouble();
			System.out.println("실행결과]");
			circleRound(rad);
			circleArea(rad);
		}
//==================코드리뷰====================
		//원의둘레(반환값이 있는형태)
//		static double circleRound(double r) {
//			double round = 2 * 3.14 * r;
//			System.out.println("원의둘레"+"("+r+") : "+round);
//			 return result;
//		}
		// 원의넓이(반환값이 없는형태)
//		static void circleArea(double r) {
//			double area = 3.14 * r * r;
//			System.out.println("원의넓이" +"("+r+") : "+area);
//		}
//		public static void main(String[] args) {
//원의 넓이를 구하는 함수는 반환값이 없어 함수내에서 즉지결과 출력
//			circleArea(10.2);
// 원의둘레를 구하는 함수는 반환값이 있으므로 값을 반환받아 출력함
//			System.out.println("원의둘레:"+circleRound(12.3));
		
//			
		
	}


