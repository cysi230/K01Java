package ex03operator;

public class E03BeekyoOperator {

	/*
	 비교연산자
	 : 좌측측항의 값이 크거나, 같거나 한지비교하는 연산자
	 */
	
	public static void main(String[] args) {

		int num1= 10, num2=20;
		/*
		 num1이 클때 참을 반환하므로, 아래조건은 거짓이 된다.
		 else 블럭이 실행
		 */
		if(num1 > num2) {//if(10(num1)>20(num2))
			System.out.println("num1이 더큽니다.");
		}
		else {           //아니라면 출력
			System.out.println("num2가 더 큽니다");
		}
		/*
		 num1과 num2가 다를때 참을 반환하므로, 아래조건은 참이된다
		 if블럭이 실행된다
		 */
		if(num1 != num2) { // 10(num1)와 20(num2)가 같지않으면
			System.out.println("num1과 num2는 다르다"); // T
		}
		else {
			System.out.println("num1과 num2는 같다."); // F
		}
		
		
		
	}

}
