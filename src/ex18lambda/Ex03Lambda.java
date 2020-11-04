package ex18lambda;

/*
람다식(Lambda Expression)
: 객체지향에서는 메소드를 사용하기 위해서 반드시
클래스를 정의한후 매소드를 선언해야한다 이러한
불편함때문에 최근 함수프로그램(Functional Programming)의 장점이 대두되었고
이런 단점을 보완하기위해 JDK1.8부터 지원하게 되었다
 */
interface IKosmo3{
	/* 
	
	 */
void studyLambda(String str);
}
public class Ex03Lambda {

	public static void main(String[] args) {
	
		/*
		 2번 예쩨에서의 익명클래스를 람다식으로 표현하면 아래와 같다
		 - 클래스명을 통해 익명클래스를 만드는 부분이 생략된다
		 - 함수명도 생략하낟 부모에서 오버라이딩 당하므로 유추 할수있다
		 - 매개변수와{} 사이에 ->(화살표)를 산입하여 완성한다.
		 */
		IKosmo3 kosmo1 = (String str) -> {
			System.out.println(str+"을 드디어 써보네요!!");
		};
		kosmo1.studyLambda("람다식");
		
		
		/*
		 위의 람다식을 아래와 같이 한번더 줄이는게 가능하다
		 - 매개변수의 타입을 예상할수 있다면 생략가ㅡㅇ
		 - 매개변수가 하나라면 소괄호 생략가능
		 - 실행할 문제이 하나이ㅓ고 동시에 return무니 아니라면 충괄호도 생략가능
		 */
		IKosmo3 kosmo2 = str -> System.out.println(str+"완전간단..");
		kosmo2.studyLambda("람다식");
	}
}