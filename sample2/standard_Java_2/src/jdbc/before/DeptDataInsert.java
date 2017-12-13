package jdbc.before;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptDataInsert {

	public static void main(String[] args){
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "java01";
		String password = "java01";
		
		Connection con = null;
		Statement stmt = null;
		//ResultSet rs = null; ���⼱ ���о���°Ծƴ϶� ���ذŶ� ..
		
		try{
			Class.forName(driver);
			con = DriverManager.getConnection(url,userid,password);
			stmt = con.createStatement();
					
			/*�Ѵ� ���׸��� ���°� �ƴ�! �־��ִ� ���� ��� �ٸ��ٵ� ������ �ļ� ������ �־��ֱ�� ���ŷο�*/
			String sql = "INSERT INTO dept (deptno,dname,loc)"+"VALUES (50,'����','����')";
			
			/*Ȥ�� 
			
			String deptStr = "60";
			String dnameStr = "�ؾ��";
			String locStr = "�λ�";
			String sql = "INSERT INTO dept (deptno,dname,loc)"+"VALUES ("+deptStr+",'"+dnameStr+"','"+locStr+"')";*/
			
			//executeUpdate�� ��� ���� �߰����ִ� ���̱⶧���� �߰��� ���ڵ� ������ ��������
			int n = stmt.executeUpdate(sql);
			System.out.println(n+" ���� ���ڵ尡 ����Ǿ����ϴ�");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
