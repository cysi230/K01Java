package quiz;

import java.util.Scanner;

public class QuBuyObject {

	static final int BREAD = 500;
	static final int SNACK = 700;
	static final int DRINK = 400;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("출력  : ");
		int buyMoney = scan.nextInt();
	
		buyObject(buyMoney);
	}
	
	public static void buyObject(int bMoney) {
		
		int buyCount =0;//구매가능여부 판단하기위한 변수
		
		//빵구매
		for(int i=1; i<bMoney/BREAD ; i++) {
			//과자구매
			for(int j=1; j<bMoney/SNACK ; j++) {
				//음료구매
				for(int k=1; k<bMoney/DRINK ; k++) {
					//거스름돈을 남기지 않아야 하므로 주어진 금액과 구매금액이 같으면된다
					if((BREAD*i +SNACK*j + DRINK*k)==bMoney) {
						System.out.printf("빵 %d개 ",i);
						System.out.printf("과자 %d개 ",j);
						System.out.printf("음료 %d개\n ",k);
						
						//구매가 가능하다면 하나씩 증가시킨다.
						buyCount++;
					}
				}	
			}		
		}
		if(buyCount==0) {
			System.out.println("해당금액으로는 구매불가합니다.");
		}
		else {
			System.out.println("출력된 방법중 하나를 선택하세요");
		}
	}
}