package ex04controlstatement;

public class E03While {

	/*
	 while문
	 : 반복의 횟수가 정해져있지 않을때 주로 사용하는 반복문.
	 반복의 수가 명확할때는 주로 for문을 사용한다
	  형식]
	   반복을 위한 변수의 초기값 선언;
	   while(반복의조건){
	   		실행문;
	   		반복을 위한 변수의 증감식; <= 반복문 탈출을위한
	   							 ++, --와 같은 연산이필요
	   }
	   반복의 조건이 false일때 while문을 탈출한다
	 */
	public static void main(String[] args) {
		
		/*
		 시나리오1] 1~10까지의 합을 구하는 프로그램을 while문으로 작성하시오
		 */
		
		//누적합을 저장하기 위한 변수선언. 증가하는i를 누적해서 더함
		int sum = 0; 
		int i = 1;
		//반복을 위한 변수선언 및 초기화
		while(i<=10) {//반복의 조건 설정 i가 11이상이면 탈출
			
			// 증가되는 i를 sum에 누적해서 더함(1+2+3...)
			sum += i; // sum = sum + i
				  //   a)sum = 0 + i(1[i++]의 의해 1증가) sum은 1된다
				 //    b)sum = 1 + i(2)               sum은 3  	
			//while 문을 탈출하기 위한 조건을 위한 증가연산
			
			i++;//i가 1증가
		}
		
		
		System.out.println("1~10까지의 합은:"+ sum);//55
		
		/*
		 시나리오2] 1부터 100까지의 정수중 3의배수 이거나 5의 배수인 수의 수의합을 구하는 프로그램을
		 			while문을 이용해 작성하시오.
		 */
		
		int total = 0;//3의배수 5의배수 걸릴시 수의 합 초기값
		
		int j = 1;//
		
		while(j<=100) {//j(1)~100까지 넣어줌
			//3의배수 혹은 5의배수
			if(j%3==0 || j%5==0) {//3 or 5 로 나누어서 0 이되면
				//total = total + j;
				total += j; // 3 or 5의 배수를 total 값에 더해줌 
			}
			
			j++;
		}
		System.out.println("1~100사이의 3 or 5의 합:" + total);

		/*
		 시나리오3]구구단을 출력하는 프로그램을 작성하시오
		 단 while문을 이용하시오
		 */
		
		int dan = 2;//단
		while(dan<=9)//단 2 ~ 9 까지 증가함
		{
			int su = 1; //수(하나의 단을 출력한후 단이 증가하면 su++을 1로 초기화 됨)
			
			while(su<=9)//수는 1 ~ 9까지 증가함
			{
//				System.out.println("dan+"*"+su+"="+(dan*su));
				//서식에 맞춰서 출력할때는 printf문이 유리함
				System.out.printf("%-2d * %-2d = %2d", dan, su,(dan*su));
//				System.out.print(dan + "*"+ su + "=" + (dan*su));
				System.out.print(" ");
				
			su++;
			}
			//하나의 단을 모두 출력한 후 다음단을 출력하기위해 줄바꿈 처리
			System.out.println();
			
			dan++;// 단 증가
			
		}
		System.out.println("\n==================\n");

		
		/*
		 시나리오4] 아래와 같은 모양을 출력하는 while문을 작성하시오
		  출력결과 
		    1 0 0 0
		    0 1 0 0
		    0 0 1 0
		    0 0 0 1
		 */
		int m=1;
		while(m<=4) {
			int n=1;
			while(n<=4) {
//				System.out.println(m+ " " + n);
				if(m==n) {//m과 n의 값이 같으면 (1,1)(2,2)(3,3)(4,4)
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				
				n++;
			}
			System.out.println(" ");
			m++;
			
		}

	}

}
