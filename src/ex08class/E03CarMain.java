package ex08class;

class Car{
	//[멤버상수]
	public static final String AUTO ="자동";
	public static final String MANUAL ="수동";
	
	//[멤버변수]
	String carGear = AUTO;//a미션
	String carModel;//모델병
	int carYear;//연식
	Human owner;//소유주
	//소유주: Human 클래스를 기반으로 하는 멤버변수로 초기화를 위해 이름, 나이, 에니저 세가지이 값이 필요함
	//		이와같이 클래스를 구성할때 또 다른 객체를 멤버변수로 선언할 수 있다.
	 
	 
	//[멤버메소드]
	void drive() {
		System.out.println(owner.name+"이(가)"+carModel+"을 준비를 한다");
	}
	//객체를 초기화를 담당하는 메소드로 아래는 "항상 같은 값 (정해져있는값) "으로만 초기화된다는 한계를 가지고있다
	void initialize() {
		carModel ="람보르기니";
		carYear=2017;
		
		owner = new Human();
		owner.name= "캡틴로져스";
		owner.age = 30;
		owner.energy = 10;
	}
	// 위와 동일한 이름의 함수로 오버로딩에 의해 정의된 초기화 메소드
	// 초기화를 진행하는 역할은 동일하나 매개변수를 통해 다양한 형태의 객체를 초기화할수있다
	void initialize(String model, int year, String name, int age, int energy) {
		carModel = model;
		carYear= year;
		
	// 또 다른객체가 멤버벼수로 정의 되었으므로, 객체를 생성한후 각각의 멤버변수를 초기화해야한다
		owner = new Human();//휴먼객체생성
		owner.name= name;
		owner.age = age;
		owner.energy = energy;
	}
	//해당객체의 정보를 디스플레이에 제공
	void showCarInfo() {
		System.out.println("[차량정보]");
		System.out.printf("모델명:%s\n",carModel);
		System.out.printf("연식:%s\n",carYear);
		System.out.printf("기어:%s\n",carGear);
		owner.showState();
		
	}	
}//end of car Class

public class E03CarMain {

	public static void main(String[] args) {

		
	//자동차1 객체생성
		Car car1 = new Car();
		System.out.println("[초기화메소드 호출전]");
		System.out.println("car1.owner="+ car1.owner);
		//car1.drive();
		/*
		   [에러발생]:자동차 소유주를 표현하는 Human객체가 초기화되지않은 상태에서 출력을 시도하여 런타임 에러 발생
		 */
		
		System.out.println("[초기화메소드 호출후]");
		car1.initialize();//고정된 내용으로 초기화진행
		car1.drive();
		car1.showCarInfo();
		
		//자동차2 객체생성 : 객체생성후 멤버변수에 직접 접근하여 초기화한다
		Car car2 =new Car();
		car2.carGear = Car.MANUAL;
		car2.carModel = "벤틀리";
		car2.carYear = 2018;
		
		car2.owner = new Human();
		car2.owner.name = "토니스타크";
		car2.owner.age = 52;
		car2.owner.energy = 8;
		
		System.out.println("자동차 정보와 소유자정보 같이보기");
		car2.showCarInfo();
		
		//세번쨰 자동차 객체생성: 매개변수가 있는 초기화 메소를 이용하여 초기화진행
		Car car3 = new Car();
		car3.initialize("스포츠카",2012,"성유겸",8,10);//초기화
		car3.showCarInfo();
	}

}
