package ex04controlstatement;



//문제3) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
//파일명 : Qu_04_08.java
//
//실행결과]
//* * * * *
//* * * *
//* * *
//* *
//*


public class Qu_04_08 {

	public static void main(String[] args) {

		for(int a =1 ; a <=5 ; a++) {
			for(int b= 5 ; b>=1 ; b--) {
//				System.out.printf("%2d",(a-b));
				if(a-b<=0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("===============");
		
// 코드리뷰
		//*를 출력한 츨수를 표현하는 상수
		final int FLOOR = 5;
		/*
		 FLOOR-x+1
		 : 변수 x가 증가함에 따라 점점감소하는 Y를 표현하기
		 위한 일반식 정의
		 */
		//세로(층) 반복
		for(int x=1 ; x<=FLOOR ; x++) {
			//가로반복
			for(int y =1 ; y<=(FLOOR-x+1); y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}

}
