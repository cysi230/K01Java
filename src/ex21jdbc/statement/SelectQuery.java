package ex21jdbc.statement;

import java.sql.SQLException;

public class SelectQuery extends ConnectDB {
	
	public SelectQuery() {
		super();
	}
	
/*
 ResultSet 클래스
 : select 문실행시 쿼리의 실행결과가 resultSet 객체에 저장된다
 결과로 반환된레코드의 처음부터 마지막까지 next()메소드를 통해
 확인후 반복하면서 추출하게 된다
 - get XXX()계열의 메소드
 오라클의 자료형이
 	number타입 : getInt()
 	char/varchar2타입: getString()
 		=> 오라클 자료형에 상관없이 모든타입 추출할수있다.
 	date 타입: getDate()
 	메소드로 각 컬럼의 데이터를 추출하낟
 	- 인자는 select절의 컬럼 순서대로 인덱스(1부터시작)를 사용하거나
 	컬럼명을 사용할수있다.
 */
	@Override
	public void execute() {
		try {
			stmt = con.createStatement();
			
			String query = " SELECT id, pass, name, regidate,"
					+ " to_char(regidate, 'yyyy.mm.dd hh24:mi') d1 "
					+ " FROM member ";
				
				rs= stmt.executeQuery(query);
			while(rs.next()) {
				String id = rs.getString(1);//id컬럼
				String pw = rs.getString("pass");
				String name = rs.getString("name");
				/*
				 오라클의 date타입을 detDate()로 추출하면 0000-00-00
				 형태로 출력된다 이경우 date자료가 되기 때문에
				 java.sql.Date클래스의 참조변수로 저장해야한다.
				 */
				java.sql.Date regidate = rs.getDate("regidate");
				
				/*
				 오라클의 date 타입을 getString ()으로 추출하면 
				 0000-00-00 00:00:00 형태로 시간까지 출력할수있다.
				 만약 문자열을 잘라서 출력하고 싶다면 subString()을 사용한다.
				 */
				String regidate2 = rs.getString("regidate");
				String regidate3 = rs.getString("regidate").substring(0,13);
				String reString4 = rs.getNString("d1");//별칭 그대로사용
				
				
				System.out.printf("%s %s %s %s %s %s %s\n", id, pw, name, regidate, regidate2, regidate3, reString4);
			}
		}
		catch (SQLException e) {
			System.out.println("쿼리오류발생");
			e.printStackTrace();
		}
		finally {
			close();//DB자원반납
		}
	}
	public static void main(String[] args) {
		SelectQuery selectSQL1 = new SelectQuery();
		selectSQL1.execute();
	}
}