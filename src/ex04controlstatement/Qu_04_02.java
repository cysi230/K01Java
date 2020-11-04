package ex04controlstatement;

import java.io.IOException;

public class Qu_04_02 {

	public static void main(String[] args) throws IOException {
		
//		하나의 문자를 입력하세요:a
//		숫자가아닙니다
//		하나의 문자를 입력하세요:7
//		숫자입니다

		
		System.out.print("하나의 문자를 입력하세요:");
		int ascii = System.in.read();
		String result = (ascii>='0' && ascii<='9') ? "숫자입니다" : "숫자가 아닙니다";
		System.out.println(result);
		
		
//		if(!(ascii>='0' && ascii<='9')) {
//			System.out.println("숫자가 아닙니다");
//		}
//		else {
//			System.out.println("숫자입니다");
//		}	
		
		
//		코드리뷰
//		System.out.print("하나의 문자를 입력하세요:");
//		int ascii2 = System.in.read();
//		
//		String resulter = (ascii2>='0' && ascii2<='9') ? "숫자입니다" : "숫자가 아닙니다";
//		System.out.println(resulter);
//		
		
	}

}
