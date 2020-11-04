package ex03operator;

public class E07BitOperator {

	public static void main(String[] args) {
//8 4 2 1
		int num1 = 5;//00000000 00000000 00000000 00000101
		int num2 = 3;//00000000 00000000 00000000 00000011
		//------------------------------------------------
		//                                   and       001 (하나라도 0(T)이면 0 , (1 1)똑같으면 1)
		//                                    or       111 (하나라도 1(F) 이면 1, (1 1) 똑같으면 1
		//                                   xor       110 ((1,1)(0,0)똑같으면 0 다를경우 1)
		
		int num3 =-1;//11111111 11111111 11111111 11111111
		             //00000000 00000000 00000000 00000001 => 1
		/*
		                 -1이 위와같이 되는 이유는 1을 더했을때 0이 되기 때문이다
		                 	양의정수 1을 2의 보수를 취하면 -1이된다.
		                 */
		System.out.println("비트AND:"+ (num1 & num2));//결과1 
		System.out.println("비트OR:"+ (num1 | num2));//결과7 
		System.out.println("비트XOR:"+ (num1 ^ num2));//결과6 
		System.out.println("비트not:"+ (~num3));//결과0
		
		
		
		
	}

}
