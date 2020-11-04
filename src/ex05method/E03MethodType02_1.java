package ex05method;

/*
 메소드형태2] 매개변수는 없고 반환값은 있는 경우
         : 사용자로부터 입력한값을 받은후 연산을 진행하고 결과를
         	반환하거나 난수를 생성하는 경우 사용된다.
 */
public class E03MethodType02_1 {

	//1~10까지의 합을 구하는 수열 함수
	static int noParamTesReturn() {//static-static 호출해야한다
		
		
		int sum = 0;
		for(int i=1 ; i<=10 ; i++) {
			sum +=i;
		}
		return sum;
	}
	// static으로 선언된 main함수에서는 static 함수만 호출할수있다.
	public static void main(String[] args) {//main에서는 public이 있어야한다

		System.out.println("1~10까지의합:"+ noParamTesReturn());
		
		int sum10 = noParamTesReturn();
		System.out.printf("1에서 10까지의 합은 %d입니다", sum10);
		
	}

}
