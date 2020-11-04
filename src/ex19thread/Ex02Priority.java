package ex19thread;

/*
 쓰레디의 우선수위
   setPriority(우선수위): 쓰레드의 우선순위를 지정할때 사용
   getPriority(): 쓰레드의 우선순위를 반환할때 사용
 */

class MesssageSendingThread extends Thread{
	
	String message;
	
	//생성자
	public MesssageSendingThread(String str) {
		message = str;
	}
	
	//생성자2: 맴버변수와 우선수위까지 초기화함
	public MesssageSendingThread(String str, int pri) {
		message = str;
		setPriority(pri);
	}
	
	public void run() {
		for(int i=1; i<=1000 ; i++) {
			System.out.println(message + i + "("+getPriority()+")");
			
			/*
			 기본적으로 우선순위가 높은 쓰레드가 먼저 실행되지만
			 sleep()메소드를 사용하게 되면 실행중 잠깐씩 블럭상태로
			 전환되어 우선순위가 낮은 쓰레드도 가끔 실행될수 있는
			 상황이 생기게된다.
			 */
			try {
				sleep(1);//0.001초 동안블럭상태로 전환됨
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Ex02Priority {

	public static void main(String[] args) {
		
		/*
		 1단계 실행
		 : 우선순위를 부여하지않은 상태로 스래드를 생성하면
		 	동일한 우선순위 5를 부여받게 된다 이때는 cpu가 알아서 작업을 분배한다.
		 */
//		MesssageSendingThread tr1 = new MesssageSendingThread("첫번쨰");
//		MesssageSendingThread tr2 = new MesssageSendingThread("두번쨰");
//		MesssageSendingThread tr3 = new MesssageSendingThread("세번쨰");

		/*
		 2단계 실행
		 : 우선순위 부여를 위해 정수를 사용한다
		 	우선순위는 1~10사이에서 부여할수 있고 높을수록 우선순위도 높아지게 된다
		 	※단, 우선순위가 높다고 무조건 먼저 실행되지는 않는다
		 	전체적인 확률이 높아지게되어 먼저 실행될 가능성이 높아진다고 생각하면된다
		 */
//		MesssageSendingThread tr1 = new MesssageSendingThread("첫번쨰", 10);
//		MesssageSendingThread tr2 = new MesssageSendingThread("두번쨰", 5);
//		MesssageSendingThread tr3 = new MesssageSendingThread("세번쨰", 1);
		
		/*
		 3단계 실행
		 : 정수대신 static(정적)상수를 사용하여 우선순위를 부여할 수 있다.
		 */
		MesssageSendingThread tr1 = new MesssageSendingThread("첫번쨰", Thread.MAX_PRIORITY);
		MesssageSendingThread tr2 = new MesssageSendingThread("두번쨰", Thread.NORM_PRIORITY);
		MesssageSendingThread tr3 = new MesssageSendingThread("세번쨰", Thread.MIN_PRIORITY);

		tr1.start();
		tr2.start();
		tr3.start();
	}
}