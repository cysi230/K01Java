package ex03operator;

public class E04LogicOperator {

	/*
	 논리 연산자
	 	&&:논리 and , 양쪽모두가 true일때만 true를 반환하고
	 		나머지는 false반환
	 	||:논리 OR , 한쪽만 true이면 true를 반환하고 양쪽모두
	 		false일때만 false를 반환
	 	!(not): 논리 not, 반대의 논리를 반환함
	 */
	public static void main(String[] args) {

		int num1= 10, num2=20;
		
		boolean result1 = (num1==100 && num2==20);//T &&(and) F = F ,하나라도 F면 F
		boolean result2 = (num1<12 || num2>=30);  //T ||(or) F = T
												  //F ||(or) F = F
		
		System.out.println("result1의결과:"+ result1);// [10(num1) = 100 = F],  [20(num2) = 20 = T] &&(and) 이므로 F
		System.out.println("result2의결과:"+ result2);// [10(num1) < 12 = T], [20(num2) > 30 = F] ||(or) 이므로 T
		
		//num1과 num2가 같지 않을때(not). true를반환한다. 따라서, if블럭이 실행된다
		if(!(num1==num2)) {//10(num1)과 20(num2)는 !(같지 않다)
			System.out.println("num과 num2는 다르다"); // True 출력
		}
		else {
			System.out.println("num1과 num2는 같다"); // False 출력
		}
		
		
		
		
	}

}
