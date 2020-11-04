package quiz;
/*
 회문(palindrome)은 순서를 거꾸로 읽어도 제대로 읽은 것과 같은 단어와 문장을 뜻한다. 
 예를 들면 "level", "SOS", "rotator"와 같은 단어가 있다. 
 사용자로 부터 입력받은 단어가 회문인지 판단하는 프로그램을 작성하시오.  

 */

import java.util.Scanner;

public class QuPalindromeStr {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("회문판단: ");
		String input = scanner.next();
		char[] arr = input.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==arr[arr.length-1]) {
				System.out.println(input);
				System.out.println("회문입니다");
				break;
			}
			else if(arr[i]==arr[arr.length-1-i]) {
				System.out.println(input);
				System.out.println("회문입니다");
				break;
			}
			else {
				System.out.println("휘문이 아닙니다");
				break;
			}
		}
	}
}
