package ex06array;

public class E02ArrayAndMethod {

	
	
	public static void main(String[] args) {
		//배열을 선언과 동시에 초기화, 요소의 갯수에 의해 크기결정됨
		int[] arr= {1,2,3,4,5};
		//배열 변수만 선언한 상태로 아직 참조하는 배열이없음
		
		int[] ref;
		System.out.println("초기화 직후출력");
		for(int i =0; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");//1,2,3,4,5 출력	
		}
		System.out.println();
		/*
		 배열명을 매게변수로 전달하는것은 배열의 참조값(주소값)을 전달하는 것이다
		 정수의 경우 해당값이 그대로 전달된다.
		 */
		ref=addAllArray(arr, 7);//호출지점 주소값만 전달
		/*
		 addAllArray() 메소드에서 반한하는 값은 처음에 전달했던 배열의
		 주소값이므로, 결과적으로 ref도 동일한 배열을 참조하게된다
		 */
		
		//동일한 참조값이 출력됨
		System.out.println("arr=" + arr); //
		System.out.println("ref=" + ref); //
		
		/*
		 arr과 ref는 동일한 참조값을 가지게 되었으므로 출력결과도 동일함
		 */
		System.out.println("메소드 호출후 출력");
		for(int i =0; i<ref.length ; i++) {
			System.out.print(ref[i]+" ");
		}
		System.out.println();
		for(int i =0; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	/*
	 매개변수로 전달된 참조값을 ar이 받게 되므로 결국 동일한 배열을 참조하게된다
	 즉, main()함수 지역은 arr과 같은 배열이 된다
	 */
	public static int[] addAllArray(int[] ar, int addVal) {//addAllArray(arr,7)
		
		for(int i=0 ; i<ar.length; i++) {
			//배열의 각요소값에 7을 더한후 결과값을 다시 저장함
			//즉, 7씩 증가시키는 연산이 수행됨
			ar[i] += addVal;
		}
		return ar;
		
	}
	
}

