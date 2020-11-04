package ex12inheritance;
///*
// 다음 Point클래스를 이용하여 다음 문제를 해결하시오. 해당 문제는 상속을 통해 구현
// 하는것이 아니라 구성관계를 이용하여 해결한다.
//  Point 클래스를 기반으로 원을 의미하는 Circle클래스를 정의하자.
//  그리고 Circle클래스를 기반으로 Ring클래스를 정의하자.
//
// */
//
//class Point
//{
//  int xDot, yDot;
//   	public Point(int x, int y){
//   		xDot=x;
//   		yDot=y;
//   	}
//   	public void showPointInfo(){
//   		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
//   	}
//}
//
////Point클래스를 기반으로 원(Circle) 클래스 표현하기
//class Circle{	
//	//멤버변수
//	int radian;//반지름
//	Point center;
//	
//	public Circle(int radian) {
//		this.radian=radian;
//	}
//	
//	public void showCircleInfo() {
//		System.out.println("반지름:"+radian);
//	}
//}
//
////원 2개를 겹쳐서 링을 표현하는 클래스
//class Ring{
//	//멤버변수
//	Circle innerCircle;//안쪽의 원
//	Circle outerCircle;//바깥쪽의 원
//	
//	public void showRingInfo() {
//		System.out.println("안쪽의 원정보: "+innerCircle);
//		System.out.println("바깥쪽의 원정보: "+outerCircle);
//		
//	}
//}
//class QuRingMake {
//	public static void main(String[] args) {
//		Ring c = new Ring(1,1,3,2,2,9);
//		c.showRingInfo();
//	}
//}
 
/// 코  드 리 뷰
class Point
{
   	int xDot, yDot;
   	public Point(int x, int y)
   	{
    xDot=x;
    yDot=y;
   	}
   	public void showPointInfo()
   	{
    System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	int radian;//반지름
	Point center;
	//생성자
	/*
	 반지름을 표현하는 radian 과 중심좌표를 표현한 Point 객체생성을 위해
	 3개의 인자가 필요
	 */
	public Circle(int x, int y, int rad) {//x좌표,y좌표,반지름
	 radian = rad;
	 //멤버변수가 객체이므로 new 를 이용해서 새로운 객체를 생성한다
	 center = new Point(x, y);
	}
	//정보출력용 멤버메소드
	public void showCircleInfo() {
		/*
		 반지름과 중심좌표를 출력할떄 중심좌표는 Point 클래스에
		 정의된 메소드를 호출한다.
		 */
		System.out.println("반지름: "+radian);
		center.showPointInfo();
	}
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	//생성자 
	public Ring(int inX, int inY, int inRad, int outX, int outY, int outRad) {
	/*
	 멤버변수인 Circle 객체를 각각초기화한다
	 */
	innerCircle = new Circle(inX, inY, inRad);
	outerCircle = new Circle(outX, outY, outRad);
	}
	//정보출력용 멤버메소드
	public void showRingInfo() {
		/*
		 각각의 객체가 상속관계가 아니므로 각 객체를 통해 멤버메소드를
		 호출해야한다.
		 */
		System.out.println("안쪽원 :");
		innerCircle.showCircleInfo();
		System.out.println("바깥쪽원 :");
		outerCircle.showCircleInfo();
	}
}
class QuRingMake {
	public static void main(String[] args) {
	Ring c = new Ring(1,1,3,2,2,9);
	c.showRingInfo();
	}
}

