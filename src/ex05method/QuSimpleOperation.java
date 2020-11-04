package ex05method;

import java.util.Scanner;

//문제5-1) 파일명 : QuSimpleOperation.java (난이도:하)
//두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
//파라메타로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
//
//메소드명 : arithmetic()
//
//실행결과]
//덧셈결과 -> 177
//뺄셈결과 -> 23
//곱셈결과 -> 7700
//나눗셈 몫 -> 1
//나눗셈 나머지 -> 23
public class QuSimpleOperation {
	
		static void arithmetic(int fNum , int sNum) {
			System.out.println("실행결과]");
			System.out.println("덧셈결과-> "+(fNum+sNum));
			System.out.println("뺄셈결과-> "+(fNum-sNum));
			System.out.println("곱셈결과-> "+(fNum*sNum));
			System.out.println("나눗셈 몫-> "+(fNum/sNum));
			System.out.println("나눗셈 나머지-> "+(fNum%sNum));	
		}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("정수1:");
			int i = scanner.nextInt();
			System.out.print("정수2:");
			int j = scanner.nextInt();
			arithmetic(i,j);
			
		//코드리뷰
			System.out.println("=========코드리뷰======");
			
			}

//		static void arithmetics(int a, int b) {
//			System.out.println("실행결과]");
//			System.out.printf("덧셈결과-> %d+%d=%d\n ",a,b,(a+b));
//			System.out.printf("뺄셈결과-> %d-%d=%d\n ",a,b,(a-b));
//			System.out.printf("곰셈결과-> %d*%d=%d\n ",a,b,(a*b));
//			System.out.printf("나눗셈 몫결과-> %d%/%d=%d\n ",a,b,(a/b));
//			//%기호를 콘솔에 출력하기위해 이스케이프 시퀀스사용함
//			System.out.printf("나눗셈 나머지결과-> %d%%%d=%d\n ",a,b,(a%b));
//		}
//		 static void main() {
//			arithmetics(10,20);
//			
//		}
}




