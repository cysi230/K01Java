package ex19thread;


//공유객체로 사용할 클래스
class SumMulti{
	int num;
	public SumMulti() {
		num=0;
	}
	public void addNum(int n) {
		num+=n;
	}
	public int getNum() {
		return num;
	}
}

class MultiadderThread extends Thread{
	SumMulti sumInst;//위 객체를 멤버변수로 선언
	int start, end;
	public MultiadderThread(SumMulti sum, int s, int e) {
		sumInst = sum;
		start = s;
		end = e;
	}
	
	/*
	 쓰레드를 통해 반복해서 공유객체인 sumInst의 addNum()을
	 호출 한다.따라서 동시에 접근이 되는 경우가 발생하게된다
	 동기화가 처리되지않아 잘못된 결과가 출력된다
	 */
	public void run() {
		for(int i=start ; i<=end ; i++) {
			sumInst.addNum(i);
		}
	}
}

public class Ex05Sync1Error {

	public static void main(String[] args) {

		SumMulti s = new SumMulti();
		MultiadderThread mat1 = new MultiadderThread(s, 1, 5000);
		MultiadderThread mat2 = new MultiadderThread(s, 5001, 10000);
		
		mat1.start();
		mat2.start();
		
		try {
			mat1.join();
			mat2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		//50005000 나와야하지만 훨씬 적은 숫자가 출력된다.
		System.out.println("1~10000까지의 합: "+s.getNum());
	}
}
