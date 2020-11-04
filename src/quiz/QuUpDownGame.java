/*
 파일명 : QuUpDownGame.java

게임설명 : 업다운게임을 메소드를 이용해 구현한다.
컴퓨터는 1~100사이의 숫자 하나를 생성한다.
총 시도횟수는 7번을 부여한다.
사용자는 7번의 시도안에 숫자를 맞춰야 한다.
사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
함수를 사용하여 구현한다.
무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 Enter키를 제거해주도록 하자.

 */
package quiz;

import java.util.Random;
import java.util.Scanner;

class QuUpDownGame {
	
	static void upDown() {
		int exit=0;
	do {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int rnd = random.nextInt(100)+1;
		for(int i=1; i<=7; i++) {
			System.out.print("숫자를 입력해주세요:  ");
			int input = scanner.nextInt();
			
			if(input>rnd) {
				System.out.println("Down 입니다");
			}
			else if(input<rnd) {
				System.out.println("Up 입니다");
			}
			
			else if(input==rnd) {
				System.out.println("정답입니다");
				System.out.print("게임을 계속 시작하겠습니까? 재시작(1)  종료(0)");
				break;
			}
			if(i==7){
				System.out.print("[실패] 정답은"+ rnd);
				System.out.println();
				System.out.print("게임을 계속 시작하겠습니까? 재시작(1)  종료(0)");
			}
		}
			exit = scanner.nextInt();
			
			if(exit==1) {
				System.out.println("===게임재시작=====");
				continue;
			}
			
			else if(exit==0) {
				System.out.println("게임이 종료되었습니다. 감사합니다.");
			}
			
			if(!(exit==1 || exit ==0)) {
				System.out.println("잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요");
				exit = scanner.nextInt();
			if(exit==0) {
					System.out.println("게임이 종료되었습니다. 감사합니다.");
				}
			}	
		}while(!(exit==0));
	}
	public static void main(String[] args) {
		upDown();
	}
}

