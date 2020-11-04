package quiz;

import java.util.Scanner;

public class QuSusik2K {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("출력  : ");
		int n = scan.nextInt();
	
		//변수선언과 초기화
		int k=0;//문제에서의 k값
		int result =2;//2를 거듭해서 곱할 변수
		int inc =1;
		
		
		if(n==0) {
			System.out.println("만족 k없음");
			return ;
		}
		if(n==1) {
			System.out.println("공식 만족하는 k값: 0");
			return;
		}
//		//방법1
//		while (result<=n) {
//			result *=2;
//			k++;
//			System.out.println("공식만족하는 k값: "+k);
//		}
		
		//방법2
		for(k=0; inc*2<=n; k++) {
			inc= inc *2;
		}
		System.out.println("공식 만족하는 k값:"+k);
		
	}
}