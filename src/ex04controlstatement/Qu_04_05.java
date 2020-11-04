package ex04controlstatement;

public class Qu_04_05 {

	public static void main(String[] args) {

//		{
//			int num1=50, num2=100;
//			int big, diff;
//
//			big = (50>100)? 
		//(t)50:(f)100; //조건?참:거짓;
//			System.out.println(big);
//
//			diff = (50>100)? 
		//(t)50-100: (f)100-50;
//			System.out.println(diff); 
//		}

		
		int num1 = 50, num2 = 100;
		boolean big = num1>num2;
		boolean diff = num1>num2;
		
		if(big) {
			System.out.println(num1);
		}
		else {
			System.out.println(num2);
		}
		
		if (diff) {
			System.out.println(num1-num2);
			}
		else {
			System.out.println(num2-num1);
		}
		//코드리뷰
		
	  }
	}

