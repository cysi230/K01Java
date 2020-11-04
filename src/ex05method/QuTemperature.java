package ex05method;

import java.util.Scanner;

//문제5-3) 파일명 : QuTemperature.java  (난이도:중)
//섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
//
//공식]
//f화씨 = 1.8 * 섭씨 + 32
//s섭씨 = (화씨 - 32) / 1.8


public class QuTemperature {

	static int fTemPer(double tem) {
		
		double fahrenheit = 1.8 * tem + 32;
		System.out.println("화씨: "+fahrenheit +" F");
		return (int) tem;
	}
	static int sTemper(double etem) {
		double celsius = (etem - 32) / 1.8;
		System.out.println("섭씨: "+ celsius +" C");
		return (int) etem;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("섭씨온도(C)를 입력해주세요: ");
		double tem = scanner.nextDouble();
		fTemPer(tem);
		System.out.print("화씨온도(F)를 입력해주세요: ");
		double etem = scanner.nextDouble();
		sTemper(etem);
	}
//=========================코드리뷰==========================
	
	/*
	 
	 //섭->화씨
	 static double celiusTo(int cel) {
		return 1.8 * cel + 32;
	}
	//화->섭씨
	static double fahrenheitTo(int fah) {
		reuturn (fah - 32) / 1.8;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("섭씨20도->화씨=");
		System.out.print(celiusTo(20));
		
		System.out.println("화씨20도->섭씨=");
		System.out.print(celiusTo(98));
		
		}
	 */
	
	
	

}
