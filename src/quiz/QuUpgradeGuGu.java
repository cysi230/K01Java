package quiz;

public class QuUpgradeGuGu {
	
//	실행결과]
//	2 x 1 = 2
//	2 X 2 = 4
//	2 X 2 X 2 = 8
//	2 X 2 X 2 X 2 = 16
//	2 X 2 X 2 X 2 X 2 = 32
//	2 X 2 X 2 X 2 X 2 X 2 = 64
//	2 X 2 X 2 X 2 X 2 X 2 X 2 = 128
//	2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 256
//	2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 512
//	3 X 1 = 3
//	3 X 3 = 9
//	3 X 3 X 3= 27
//	………중간 생략………
//	9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 43046721
//9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 387420489
			
		
	public static void main(String[] args) {

		int sum=1;
			for(int i=2 ; i<=9 ; i++){
					System.out.print(i);
					sum *= i;
					System.out.print("X");
			}
			System.out.println("="+sum);
	}
}
	
	
	


