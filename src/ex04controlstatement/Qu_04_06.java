package ex04controlstatement;

//문제1) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
//파일명 : Qu_04_06.java
//
//실행결과]
//*
//* *
//* * *
//* * * *
//* * * * *


public class Qu_04_06 {

	public static void main(String[] args) {
		int a = 1;
		while(a<=5) {
			int b =1;
			while(b<=5) {
				if(a+b>=6) {
					System.out.print("* ");
				}
				else {
					System.out.print("");
				}
				b++;
			}
			System.out.println();
			a++;
		}	
	}
}

//
	
