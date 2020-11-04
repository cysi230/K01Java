package ex03operator;

public class E05ShortCircuitEvaluation {

	/*
	 SCE(Short- Circuit Evaluation)
	 : 하나의 조건검사만으로 결과를 알수있는 경우 Java컴파일러는
	 뒤의 조건을 수행하지않고 건너뛰게 된다. 이경우 변수의값이
	 변경되는 코드가 있다면 실행되지 않으므로 주의해야한다.
	 */
	public static void main(String[] args) {

		int num1=0, num2=0;
		boolean result;
		
		/*
		 &&(논리and)의 경우 둘중 하나만 false이면 false를 반환하므로
		 첫번째 조건이 false이면 두번째 조건을 실행(검사)하지 않는다.
		 */
		result = (num1+=10)<0 && (num2+=10)>0; //(num1+=10)= [num1 = 0 + 10] < 0,  [num2 = 0 + 10] > 0 
		System.out.println("result=" + result);
		System.out.println("num1=" + num1 +", num2="+ num2);// &&(and) 경우 T F중 하나라도 F면 False 이므로 num2의 값은 출력안된다
		
		/*
		||(논리or)의 경우 둘중하나만 true이면 true를 반환하므로
		첫번째조건이 true이면 뒷문장을 실행하지 않는다
		 */
		result=(num1+=10)>0 || (num2+=10)>0;
		System.out.println("result=" + result);
		System.out.println("num1=" + num1 +", num2="+ num2);
		//num2는 초기값인 0을 유지하게 된다. 만약 num2의 값이 프로그럄에
		//영향을 미치게 된다면 이부분은 유의해야한다
		
		
		
	}

}
