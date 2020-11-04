package quiz;

import java.util.Random;
import java.util.Scanner;

/*
 게임설명 : 야구게임을 메소드를 이용하여 구현한다.
1.	중복되지 않는 3개의 정수를 생성한다.(1~9)
2.	사용자는 3개의 숫자를 입력한다.
3.	생성된 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다.
4.	숫자와 숫자의 위치까지 일치하면 strike 로 판정한다.
5.	숫자는 맞지만 위치가 틀렸다면 ball 로 판정한다.
6.	숫자3개가 모두 일치하지 않으면  out 으로 판정한다.
7.	3 strike 가 되면 게임은 종 료된다.
8.	시도한 횟수를 표시한다.
9.	계속할지 종료할지 여부를 물어보고 다음 진행을 한다.

위 문제의 변수들을 배열을 이용하여 구현해본다.
   int com1, com2, com3; -> int[] com = new int[3];
   int user1, user2, user3; -> int[] user = new int[3]; 
3개의 난수를 생성하는 부분과 스트라이크, 볼을 판정하는 부분은 배열을 이용한 로직으로 변경해야 한다.

 */
public class QuBaseballGame {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int[] com = new int[3];
		int[] user = new int[3]; 
		int str = 0;
		int ball =0;
		int count=0;
		boolean base = true;
		
		
			for(int i=0; i<user.length; i++) {
				System.out.println("숫자 3개를 입력하세요(1~9)");
				int inputNum = scanner.nextInt();
				user[i]=inputNum;
			}	
			
			for(int i=0 ; i<com.length; i++) {
				com[i] = (int)((Math.random()*100 % 9 ) + 1);
				for(int j=0; j<i; j++) {
					if(com[j]==com[i]) {
						i--;
					}
				}
			}
		
		for(int j=0; j<com.length; j++) {
			for(int i=0; i<user.length ; i++) {
				if(com[j]==user[i]) {
					str++;
				}
				else {
					ball++;
				}
			}
		}
		System.out.println("스트라이크"+str);
		System.out.println("볼: "+ball);
		
		count++;
		System.out.println("시도횟수: "+ count);
		if(str<=3) {
			System.out.println("게임종료");
		}
		}
	}
