package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

public class Qu_04_01 {



	public static void main(String[] args) throws IOException {
//문자하나를 입력하세요:a
//		숫자가 아닙니다.
//		문자하나를 입력하세요:3
//		2의 배수가 아닙니다.
//		문자하나를 입력하세요:8
//		2의 배수입니다.

		
		System.out.print("하나의 문자를 입력하세요:");
		int ascii = System.in.read();
		
			if(!(ascii>=48 && ascii<=57)) {
				System.out.println("숫자가 아닙니다");
			}
			else if(ascii%2==0) {
					System.out.println("2의 배수입니다");
			}
			else {
					System.out.println("2의 배수가 아닙니다");
			}	
		
//			코드리뷰
//			System.out.print("하나의 문자를 입력하세요:");
//			int ascii2 = System.in.read();
//			/*
//			 아스키코드를 모를때 구현방법
//			 입력받은 문자가 숫자형 문자인지 판단하여 boolean값 저장
//			 */
//			boolean isNumber = (ascii2>'0'&& ascii2<='9');
//			if(isNumber==true) {
//				//만약 숫자라면
//				/*
//				 수자형문자가 가지고있는 아스키코드값에서 48(0의 아스키코드)
//				 을빼면 해당문자의 정수가된다
//				 즉 '4' - '0' = 정수4
//				 */
//				if((ascii2) -'0') % 2 == 0){
//					System.out.println("2의배수입니다");
//				}
//				else {
//					System.out.println("2의배수가아닙니다");
//				}
//			}
//			else {
//				//숫자가 아니라면
//				System.out.println("숫자가 아닙니다");
//			}
			
			
	}
}

