package ex02variable;

public class Qu_02_02 {

	public static void main(String[] args) {

		
		double K = 99;//국어
		double E = 80;//영어
		double M = 96;//수학
		double A = 3;//과목수
		
		double result3 = K + E + M;
		double result4 = result3/A;
		System.out.println("평균점수(실수형):"+ result4);
		
		
		int k = 99;//국어
		int e = 80;//영어
		int m = 96;//수학
		int a = 3;//과목수
		
		int result1 = k + e + m;
		int result2 = result1/a;
		System.out.println("평균점수(정수형):"+ result2);
	
		//--------------------------------------------

		//int ko=99, en=80, ma=96;
		//double avg = (ko+en+ma)/3;  //정수/정수=> 정수의결과
		//double avg2 = (ko+en+ma)/3; //정수/실수=> 실수의결과
//		System.out.println("평균점수1:"+ avg1);
//		System.out.println("평균점수2:"+ avg2);
		
		
		
	}

}
