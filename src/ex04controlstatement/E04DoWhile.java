package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

public class E04DoWhile {

	/*
	 do ~ while문
	 : 반드시 한번은 실행해야 할 경우 사용하는 반복문
	 즉 조건검사없이 무조건 한버은 실행된다
	 형식]
	 	반복을위한 초기값;
	 	do{
	 		실행문장;
	 		반복문을 탈출하기위한 증감식;
	 	}while(조건식);<= 반드시;(세미콜론)으로 마무리한다.
	 
	 */
	
	public static void main(String[] args) throws IOException {
		
		/*
		 시나리오] E03 예제의 수열문제를 do~while 문으로 변경하여
		 		구현하시오
		 */
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		}while(i<=10);
		System.out.println(" 1~10까지의 누적합"+ sum);
		
		
		/*
		 시나리오] 1부터 1000까지의 정수중 4의배수이거나 7의배수인
		 합을 구하여 출력하는 프로그램을 작성하시오.
		 단, do while문을 사용해야한다
		 */
		int total = 0;
		int j = 1;
		do {
			if(j%4==0 || j%7==0) {
				System.out.println("j=" + j); // j가 4 or 7의 배수 합이 계속 출력됨
				total +=j;
			}
			j++;
		}while(j<=1000);
		System.out.println("1~1000사이 4 or 7 배수합:" + total);
		
		
		/*
		 시나리오]국어, 영어, 수학 점수를 사용자로부터 입력받은 후
		 평균을 통해 구해 A~F학점을 판단하여 출력하는 프로그램을 작성하시오
		 단 사용자가 Xx(대소문자구분없음)를 입력하면 프로그램이
		 종료해야하며 do~while문으로 구현해야한다 
		*/
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math, avg;
		int exitCode;
		
		do {
			System.out.print("국어점수:");
			kor= scanner.nextInt();
			System.out.print("영어점수:");
			eng= scanner.nextInt();
			System.out.print("수학점수:");
			math= scanner.nextInt();
		/*
		 switch문은 if문과 같은 조건식을 사용할수없고
		 산술식만 사용할수 있으므로 점수의 구간을 구하기위해 총점을 30으로 누눠준다.
		 */
			avg = (kor+eng+math) / (3 * 10);
			switch(avg) {
			case 10: case 9:
				System.out.println("A학점");break;
			case 8: 
				System.out.println("B학점");break;
			case 7: 
				System.out.println("C학점");break;
			case 6: 
				System.out.println("D학점");break;
			default:
				System.out.println("F학점");
			}
		System.out.println(" 종료하려면 x(X)를 입력하세요.");
		System.out.println(" 계속하려면 아무키나 입력하세요.");
		exitCode=System.in.read();
			
		}while(!(exitCode=='x' || exitCode=='X'));
		
		/*
		 x를 입력한 경우
		 : (true OR false) => ! true => false 반환
		 	즉, do while문을 탎출함
		 	
		 a를 입력한경우
		 : 위 경우와는 반대이므로 Loop 반복함
		 */
	}
}
