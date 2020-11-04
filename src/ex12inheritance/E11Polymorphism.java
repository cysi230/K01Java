package ex12inheritance;
/*
 다형성(Polymorphism)
 : 같은타입의 참ㅈ변수를통해 다양한 객체를 이용할 수있는 
 	특성을 말한다. 단, 객체간에는 상속관계가 있어야한다
 	-부모의 참조변수로 자식객체를참조
 	1. 이경우 부모타입의 참조변수는 부모로부터 상속받은 멤버까지만 접근가능하다.
 	2. 자식에서 오버라이딩한 메소드가 우선 호출된다
 	3. 자식에서 새롭게 정의한 멤버에는 접근 할 수 없다.
 	
 	-같은 타입의 클래스로 객체를 참조
 	1. 객체 전체를 접근 할 수 있다. 즉 , 클래스의 일반적인 
 	규칙이 적응된다
 */
class Parent{
	//멤버변수
	int parentMember;
	//멤버메소드
	void parentMethod() {
		System.out.println("부모의 메소드: ParentMethod");
	}
}

class Child extends Parent{
	//확장한 멤버변수
	int childMember;
	//확장한 멤버메소드
	void childMethoid() {
		System.out.println("자식의 메소드: childMethod()");
	}
	//부모에서 정의한 메소드를 오버라이딩하여 재 정의한 메소드 
	@Override
	void parentMethod() {
		System.out.println("자식에서 Overriding한 메소드"+"parentMethod");
	}
	//오버로딩된 메소드(확장한 메소드)
	void parentMethod(int childMember) {
		this.childMember=childMember;
		System.out.println("overloading: 자식에서 확장한 메소드"+ ":parentMethoid(param1)");
	}
}

public class E11Polymorphism {

	public static void main(String[] args) {
		//동질화: 자신의 참조변수로 자신의 객체를 참조함
		Child homeChild = new Child();
		//멤버변수 종류
		homeChild.childMember =10;//자식의 멤버변수
		homeChild.parentMember =100;//부모의 멤버변수
		
		//멤버 메소드 종류
		homeChild.childMethoid();//자식의멤버
		homeChild.parentMethod(1000);//자식에서 오버로딩
		homeChild.parentMethod();//자식에서 오버라이딩
		
		
		System.out.println("[부모타입에 자식타입의"+"메모리주소복사]");
		
		Parent parent1 = homeChild;//자동형변환이 일어남(up캐스팅)
		parent1.parentMember=1;
	//	parent1.childMember=1; //접근 불가능 -> 부모타입으로 자식멤버에 접근할수없음
		parent1.parentMethod();//오버라이딩 했으므로 자식쪽 호출됨
		
		/*
		 이질화: 자식에서 새롭게 정의한 멤버(변수, 메소드)에는
		 		부모타입의 참조변수로 접근 불가능함
		 		만약 접근해야한담녀 자식타입으로 형변환(강제형변환 혹은 Down캐스팅)
		 		이후 자식의멤버에 접근해야함.
		 */
		Parent parent2 = new Child();
		parent2.parentMember=1;
		parent2.parentMethod();
		
		//자식쪽 멤버에 접근한방법1: 형변환후 바로접근
		((Child)parent2).childMember=1;
		((Child)parent2).childMethoid();
		((Child)parent2).parentMethod();
		
		//자식쪽 멤버에 접근하는 방법2 : 자식타입의 인스턴스 변수에
		//						담아서 그 인스턴스변수로접근
		Child child2 = (Child)parent2;
		child2.childMember =1;
		child2.childMethoid();
		child2.parentMethod(1);
		
		/*
		Java에 생성한 모든 클래스는 직/간접적으로 Object클래스를
		상속한다 . 따라서 모든 객체(인스턴스)는 Object 참조변수로 참조가능하다.
		 */
		Object object = new Child();
		((Parent)object).parentMethod();
	}
}