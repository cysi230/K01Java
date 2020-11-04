package ex14innerclass;

/*
 내부 정적클래스 
 : 클래스 안에서 정의하는 클래스로 static을 불여준다
 - 이와같이 내부클래스를 static으로 선언하면 Nested클래스라고한다
 - 정적 멤버변수 & 멤버메소드를 가질수있다
 - 외부 클래스의 인스턴스형 멤버는 사용할수 없다
 - 외부클래스명 $내부클래스명 .class 파일이 생성된다
 
  ※ 원래는 class 앞에는  static 을 붙일수 없으나 내부클래스에는 허용된다
 */
import ex14innerclass.OuterMember.InnerMember;

class OuterClass{
	//인스턴스형 멤버변수
	InnerStaticClass innerStaticClass = new InnerStaticClass();
	int outerMemberVar;
	
	//인스턴스형 멤버 메소드
	void outerMemberMethod() {
		/*
		 외부클래스의 멤버메소드에서는 내부 정적 클래스의 멤버를 접근할 수 있다
		 (Heap영역에서는 Method 영역을 참조할수있다)
		 */
		System.out.println("외부클래스의 멤버메소드 호출됨");
		innerStaticClass.innerMemberVar = 100;//내부정적클래스의 멤버변수
		InnerStaticClass.innerStaticVar = 101;//내부정적클래스의 정저멤버변수
	}	
	//외부클래스의 정적멤버 변수&메소드
	static int outerStaticVar;
	static void outerStaticMethod() {
		System.out.println("외부클래스의 정적메소드 호출됨");
		/*
		 외부클래스의 정적멤버메소드에서는 내부클래스의 정적멤버만 접근할수있다
		 (Method영역에서는 Heap영역을 참조할수없다)
		 */
//		InnerStaticClass.innerMemberVar = 102;//에러발생
//		InnerStaticClass.innerMemberMethod();//에러발생
		
		InnerStaticClass.innerStaticVar= 103;
		InnerStaticClass.innerStaticMethod();
		
//		InnerStaticClass.innerMemberVar = 104;//에러발생
//		InnerStaticClass.innerMemberMethod();//에러발생
	}
	
	//내부정적클래스(Nested class)
	static class InnerStaticClass{
		//인스턴스형 멤버
		int innerMemberVar;
		void innerMemberMethod() {
			System.out.println("내부클래스의 멤버메소드 호출");
		}
		//정적 멤버
		static int innerStaticVar;
		static void innerStaticMethod() {
			System.out.println("내부클래스의 정적메소드 호출");
		}
	}
}

/*
 외부클래스가 아닌 다른클래스에서 접근할때 의 방법은 아래와같다.
 */
public class E02InnerStaticClass {
	public static void main(String[] args) {
	
		/*
		 내부정적클래스의 정적멤버에 접근할때는 외부클래스의 객체 생성없이
		 클래스명으로 바로 접근가능하다.
		 */
		OuterClass.InnerStaticClass.innerStaticVar =1;
		OuterClass.InnerStaticClass.innerStaticMethod();
		
		/*
		 내부정적 클래스의 인스턴스형 멤버에 접근할때는 객체를 생성하후
		 참조변수를 통해 접근해야하낟
		 */
		OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
													  //new OuterClass()/.InnerStaticClass();[에러발쌩]
		innerStaticClass.innerMemberVar = 2;
		innerStaticClass.innerMemberMethod();
		
		/*
		 그 외는 클래스 접근의 일반적인 방법을 따른다
		 외부클래스의 멤버변수(메소드)는 객체생성후 참조변주를 통해 접근한다
		 */
		OuterClass outerClass = new OuterClass();
		outerClass.outerMemberVar = 3;
		outerClass.outerMemberMethod();
		
		//외부클래스의 정적멤버는 클래스명으로 바로접근한다
		OuterClass.outerStaticVar = 4;
		OuterClass.outerStaticMethod();
		
	}
}