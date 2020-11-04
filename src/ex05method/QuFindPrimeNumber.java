package ex05method;
/*
 문제5-4) 파일명 : QuFindPrimeNumber.java  (난이도:상)
전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 false를 반환하는 메소드를 정의하고,
 이를 이용해서 1부터 100사이의 소수를 전부 출력하는 main메소드를 정의하자.


메소드명 : isPrimeNumber()
소수란 : 특정 정수를 나눌수 있는것이 1과 자기자신밖에 없는 수.

실행결과]
2
3
5
7
……중략……
97

for문이용(2 ~ n-1)

 */
public class QuFindPrimeNumber {
	
//	static void isPrimeNumber() {
//		int b =0;
//		for(int a=2 ; a<=100 ; a++) {
//			boolean c = true;
//			if(a%b==0) {
//				System.out.println(a);
//			}
//			else {
//			}
//		}
//	}
//	public static void main(String[] args) {

//		System.out.println("실행결과]");
//		isPrimeNumber();
//	}
	
	
	//코드리뷰
	
	
	static boolean isPrimenumber(int num) {
	
		if(num==1) {//1일때 아니다
			//1은 소수가 아니므로 false 반환
			return false;
		}
		else {
			/*
			 모든 자연수는 1과 자신으로 나눠지므로 두조건을 제외한
			 나머지수로 나눠서 떨어지는지 판단한다.
			 */
			for(int i =2; i<=num-1 ; i++) {
				/*
				 1과 자신을 제외한 숫자로 나눠서 떨어지면 소수가 아니므로
				 이후 검사할필요가없다 판단되는 즉사 false를 반환하고 함수를 종료한
				 */
				if(num%i==0)//나누어떨어지면 false
					return false;
			}
			//위조건을 통과하게되면 소수이므로 true 반환
			return true;
		}
	}
	
	public static void main(String[] args) {
		//1~100에서 사이의 정수를 소수인지 판단한다
		for(int i =1; i<=100; i++) {
			if(isPrimenumber(i)==true) {//반환한 정수가 위에 true 라면
				System.out.println("소수: " +i);
			}
		}
	}
}
