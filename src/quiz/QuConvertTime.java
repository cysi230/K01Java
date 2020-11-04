package quiz;

import java.util.Scanner;

public class QuConvertTime {

	static final int HOUR = 60*60;
	static final int MIN = 60;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("출력 초 : ");
		int inputs = scan.nextInt();
		converttSecToHMS(inputs);
	}
	
	public static void converttSecToHMS(int sec) {
		
		//시, 분, 초
		int h, m ,s;
		
		/*
		 sec = 3661이라고 가정했을때 
		 3661/3600 = 1시간 몫
		 3661/ % 3600 = 61초 나머지 
		 
		 61/60 =1분 몫
		 61 % 60= 1초 나머지
		 */
		
		//시간구하기
		h = sec/HOUR;
		sec = sec%HOUR;//시간구하고 남은초를 다시저장
		
		//분구하기
		m=sec/MIN;
		sec=sec%MIN;//분을 구하고 남은 초를 다시저장
		
		//초구하기
		s=sec;
		
		System.out.printf("%d시간 %d분 %d초", h , m , s);
	
		//경매 역카운트에 사용
		}
}
