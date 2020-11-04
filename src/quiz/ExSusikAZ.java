package quiz;

public class ExSusikAZ {

	public static void main(String[] args) {
		
		for(int A=0; A<=9; A++) {
			for(int Z=0; Z<=9; Z++) {
				/*
				 A와 Z는 서로다른 정수이므로 같은값이 나올때는 아래코드를
				 실행하지않고 반목의 처음으로 돌아간다
				 */
				if(A==Z) {
					//A와 Z는 서로 다른 숫자이므로 확인필요없음
					continue;
				}
				//AZ와 ZA를 코드로 표현하면 아래와 같다
				int result = (A*10+Z) + (Z*10+A);
				
				if(result==99) {
					System.out.printf("%d%d + %d%d=%d\n",A,Z,Z,A,result);
				}
			}
		}
	}
}
