package ex04controlstatement;

//문제4] 구구단을 이중 for문을 이용해서 다음과 같이 출력하시오
//파일명 : Qu_04_09.java
//
//실행결과]
//2*1=2   3*1=3 ~~~~~~~~~~ 9*1=9
//2*2=4   ~~~~~~~~~~~~~~~ 9*2=18
//	~~~~~~~~~~~~~
//2*8=16~~~~~~~~~~~~~~~~9*8=72
//2*9=18~~~~~~~~~~~~~~~~9*9=81
public class Qu_04_09 {

	public static void main(String[] args) {
		
	
		for(int dan =2 ; dan <=9 ; dan ++) {
			for(int su =1 ; su <=9 ; su++) {
				System.out.printf("%d*%d=%d ", dan, su, (dan*su));
				System.out.print("");
			}
			System.out.println("");
		}
		
		System.out.println("=================");
		//코드리뷰
		
		//수가 고정된 상태에서 dan이 증가하는형태로 구성된다.
		for(int dan1=1; dan1<=9; dan1++) { 
			for(int su1=2; su1<=9; su1++) {
				System.out.printf("%-2d*%-2d=%-2d", su1,dan1,(su1*dan1));
				System.out.print(" ");
			}
			//하나의 단을 출력후 줄바꿈
			System.out.println();
		}
		
		
	}
}
