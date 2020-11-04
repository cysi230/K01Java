package ex10accessmodifier;

//과일 팬매자를 추상화한 클래스
class FruitSeller3{
	
	int numOfApple; // 판매자의 사과 보유갯수
	int myMoney; // 판매수익
	final int APPLE_PRICE; // 사과의 단가 
	
	/*
	 상수는 값의 변경이 불가능하고, 단한번만 초기화되기때문에
	 일반적인 멤버메소드에서는 초기화할수 없다.
	 하지만 생성자 메소드에서는 초기화가 가능하다
	 마음대로 호출할수없고, 객체생성시 단 한번만 초기화 호출되는
	 특성이 동일하기 때문에 한번이상 초기화되지 않음이 보장되기 때문이다.
	 */
	public FruitSeller3(int money, int appleNum, int price) {//생성자 반환값X voidx
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	//판매자의 현재상태를 출력하는 멤버메소드
	public void showsaleResult() {
		System.out.println("[판매자]남은 사과갯수: "+ numOfApple);
		System.out.println("[판매자]판매수익: "+ myMoney);
	}
}
//구매자를 표현한 클래스
class FruitBuyer3{
	int myMoney;//보유금액
	int numOfApple; // 구매한 사과의 갯수
	
	public FruitBuyer3(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	//구매자가 판매자에게 사과를 구매하는 행위를 표현한 멤버메소드
	public void buyApple(FruitSeller3 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	//구매자의 현재상태출력
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:" + myMoney);
		System.out.println("[구매자]사과갯수:" + numOfApple);
	}
}

public class E02FruitSalesMain5 {

	public static void main(String[] args) {

		/*
		 초기화 메소드를 정의하였으므로 , 각각 성격이 다른 객체들을
		 생성 할 수 있다.
		 */
		//판매자1: 보유갯수100개 단가1000원
		FruitSeller3 seller1 = new FruitSeller3(0, 100, 1000);
		
		//판매자2: 보유갯수180개 단가500원
		FruitSeller3 seller2 = new FruitSeller3(0, 80, 500);
		
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showsaleResult();
		seller2.showsaleResult();
		buyer.showBuyResult();
		
		/*
		 구매자가 판매자에게 5000원을 지불하고  사과를
		 구매한 행위를 코드로 표현함
		 */
		//판매자1,2 에게 각각 5000원을 지불하고 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showsaleResult();
		seller2.showsaleResult();
		buyer.showBuyResult();
		
		/*
		 아래의 코드는 문버적으로는 오류가 없으나 지불음액과 구매한 사과의
		 관계가 전혀 맞지않는 논리적 오류가 발생되었다.
		 즉,코드(메소드)로 구현한 규칙이 완전히 무너지게된다
		 객체지향 프로그램밍에서는  이런 오류를 막기 위해 멤버변수에 대한 
		 '정보은닉'을하도록 규정하고 있다
		*/
		seller1.myMoney +=1000;
		seller1.numOfApple-= 50;
		seller1.numOfApple+= 50;
		
		seller2.myMoney +=1000;
		seller2.numOfApple-=70;
		seller2.numOfApple+=78;
	
		System.out.println("구매행위가 일어난후 상태");
		seller1.showsaleResult();
		seller2.showsaleResult();
		buyer.showBuyResult();
		
		
	}
}
