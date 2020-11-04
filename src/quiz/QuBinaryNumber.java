package quiz;

import java.util.Scanner;

/*
 10진수를 입력받아서 2진수로 변환해서 출력하는 프로그램을 작성하시오. 
 단, 이미 제공되는 변환함수를 사용하지말고 아래 예시에서 주어진데로 프로그램을 작성하고, 배열(Array)을 활용한다. 
10진수 12 는 2진수 1100으로 변환할 수 있다. 즉 12을 2로 나눈 나머지를 역순으로 이어붙이면 된다. 

 */
public class QuBinaryNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("2진수로 변환할 정수를 입력하세오: ");
		int input = scanner.nextInt();
		int[] arr = new int[input];
		
		int count =0;
		for(int i =0 ; i<arr.length ; i++) {
			//input이 0 or 1이 나오면 stop
			if(input<2) {
				arr[i]=input%2;
				break;
			}
			arr[i]=input%2;
			input/=2;
			count++;
		}
		//나머지들의 값을 역순 카운트
		for(int i=count; i>=0 ; i--) {
			System.out.print(arr[i]);
		}
	}
}

