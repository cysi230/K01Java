package ex06array;

public class QuTwoDimLotate {

	public static void main(String[] args) {
		int[][]arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		arRay(arr);
		loTate(arr);
		System.out.println();
		arRay(arr);
		loTated(arr);
		System.out.println();
		arRay(arr);
	}
	static void loTate(int[][]arr) {
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				int[]temp =new int[arr.length] ;
				temp[i] = arr[i][j];
				arr[i][j] = arr[i][j];
				arr[i][j] = temp[i];
			}
		}
	}
	static void loTated(int[][]arr) {
			for(int i =0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					int[] temp =new int[arr.length] ;
					temp[i] = arr[i][j];
					arr[i][j] = arr[j][1];
					arr[j][i] = temp[i];
				}
			}
		}
	static void arRay(int[][]arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length ;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	
	/*
	 절차
	 1. 배열으의 마지막행 행을 1차원 배경에 임시로 저장
	 2. 배경르ㅢ 2행을 3행으로 .1흥을,2,으로 옮긴다
	 3. 1번내에 임시로 저장한값을 1행으로 옮긴다
	 ※ 2차원 배열 에서 "배열이름[인데스]"가 하나의행(세로행)을 가리킨다는것을 활용하는 문제점
	 */
	
	/*
	 //절차1
	 inr[]lastRlow = arrRaram[arrParam.length-1];
	 //절차2: 세로크기에 상관없이 동작해야 하므로 length사용한다
	 for(int row = arrParam-1; row0> ; row--)P{
	 	arrParam[row]=arrParam[row-1];
	 }
	 //절차3
	 arrParam[0]= lastRow
	 */

}
