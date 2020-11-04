package ex17collection;

import java.util.LinkedList;
import java.util.Scanner;

/*
사용자로부터 이름을 입력받아 그 이름으로 검색해서 인덱스 위치(indexOf사용)를 
알아내서 해당 인덱스로 그 객체를 삭제하고 삭제된 객체의 정보(이름,나이,학번)를 출력하여라.

실행결과]
검색할 이름을 입력하세요:가길동
오버라이딩 한 equals() 호출됨:가길동
[검색되었습니다]
[삭제후 정보출력]
이름:나길동, 나이:20, 학번:2017
이름:다길동, 나이:30, 학번:2016
이름:마길동, 나이:40, 학번:2015

 */

class Student {
	private String name;
	private int age;
	private String year;

	public Student(String name, int age, String year) {
		super();
		this.name = name;
		this.age = age;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public void showInfo() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("학번:"+year);
	}
	/*
	 toString()은  Object클래스에서 제공하는 메소드로 
	 print()문을 통해 객체를 출력하면 자동으로 호출되는 메소드이다
	 */
	@Override
	public String toString(){
		return String.format("이름:%s, 나이:%s, 학번:%s", name, age, year);
	}
}


public class QuArrayList {
	
	public static void main(String[] args) {
		
//		ArrayList<Student> list = new ArrayList<Student>();
		LinkedList<Student> list = new LinkedList<Student>();
		
		//저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		//객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		
	
			
		//1.검색할 이름을 입력받음
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요:");
		String searchName = scanner.nextLine();
		System.out.println("[검색되었습니다]");	
		
		//2.확장for문으로 컬렉션 전체를 접근
		int index= -1;//배열(컬렉션)의 인덱스는 0부터 시작이므로 초기값 -1 설정
		for(Student st : list) {
			if(searchName.equals(st.getName())){
				//객체의  참조값을 통해 list내의 index값을 찾음
				index =list.indexOf(st);
				//해당 객체를 찾았으면 즉시 루프탈출
				break;
			}
		}
		
	
		//3.검색결과 유/무에 따라 
		//검색결과 있을때…검색된 데이터 삭제
		//검색결과 없을때...검색결과가 없다고 출력
		if(index==-1) {
			System.out.println("검색 결과가 없습니다");
		}
		else {
			System.err.println("검색결과 있음");
			System.err.println("객체 삭제후 정보 출력");
			/*
			 컬렉션에 저장된 객체를 인덱스를 통해 삭제하면
			 삭제된 객체자체를 반환하게 되므로 멤버 메소드를
			 바로 호출 할  수 있다
			 */
			list.remove(index).showInfo();
		}
	
		
		//4.전체정보 출력
		System.out.println("[검색후 전체정보출력]");
		for(Student st : list) {
			System.out.println(st);
		}
	}
}