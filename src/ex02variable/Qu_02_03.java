package ex02variable;

public class Qu_02_03 {

	public static void main(String[] args) {

		
		int a = 10;//반지름
		int area_int = (int)(a * a * 3.14);
		System.out.println("int형의 넓이:"+ area_int);
		
		float b = 10;//반지름
		float pii = 3.14F;//3.14
		float area_float = b * b * pii;//원의넓이
		System.out.println("float형의 넓이:"+ area_float);
		
		double c = 10;//반지름
		double piii = 3.14;//3.14
		double area_double = c * c * piii;//원의넓이
		System.out.println("double형의 넓이:"+ area_double);
		
		//--------------------------------------------
		
		int rad = 10; //반지름
		final double PI =3.14;
		
		int area__int;
		float area__float;
		double area__double;
		
		/*
		큰 자료형을 작은 자료형에 대입할때는 자료의 손실이 있을수 있으므로
		반드시 강제형변환(명시적형변환)을 통해 형변환후 대입해야한다
		 */
		area__int = (int)(rad * rad * PI);
		area__float = (float)(rad * rad * PI);
		area__double = (rad * rad * PI);
		System.out.println("int형;" + area__int );
		System.out.println("float형;" + area__float );
		System.out.println("double형;" + area__double );

		
		
		
	}	
}

