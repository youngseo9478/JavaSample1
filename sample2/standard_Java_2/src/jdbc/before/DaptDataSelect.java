package jdbc.before;

import java.sql.*;
/********���κ��� �����͸� �о���� ���************/
public class DaptDataSelect {
	
	public static void main(String[] args)
	{
		/*����̹��� �̹� ������ uri�̹Ƿ� Ʋ���� �ȵ�. �ܺο��� �������� ���� ��� ���ڿ��� �ޱ⶧���� 
		 * �����Ͱ� ���� ����� �� ���� !! ***����****/
		String driver = "oracle.jdbc.driver.OracleDriver";
		/*����ȣ��Ʈ �����Ǵ� 127.0.0.1�ε� ���� �ٸ���ǻ�Ϳ� �ִ� ��� ����Ϸ��� �� �����Ǹ� �־������
		 *1521�� ��Ʈ��ȣ�ε� ��� �ܺο��� ������ ���� ��Ʈ��ȣ�� �̹� ������ ��
		 *�츮�� ����ϴ� ����Ŭ�� EXPRESS�̱⶧���� xe �̶��� ����ϴ� ���α׷��� ���� ������ ��*/
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//�츮�� ������� '����'������ ���̵�� ��й�ȣ
		String userid = "java01";
		String password = "java01";
		
		/*���� �ڹ� �����ϴ� ����
		 * 1.import java.sql.*; ���ֱ�
		 * 2.����̹� �ε�
		 * 3.JDBC�� �̿��� ���� (Connection ��ü ����)
		 * 4.�ڹٿ��� ģ �������� ��� �Ѱ��ֱ� ���� Statement ��ü ����
		 * 5.��񿡼� ���� �����͸� �ڹٿ� �����ֱ� ���� ResultSet ��ü ����
		 * 
		 * �ϴ� ��ü ���� �س��� ����*/
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			/*��ü�� �����ϴ� ����� 2���� �ϳ��� new���°��̰� �ϳ��� �Ʒ��� ���� ���(Class.forName)
			 * driver�� �־���� ��Ʈ�� ���� ����̹���ü�� �ε��Ű��*/
			Class.forName(driver);
			/*getConnection�� ���� url�� ����*/
			con = DriverManager.getConnection(url,userid,password);
			//Statement��ü�� Connetion�� ���Ե� ���̹Ƿ� con.~~�ؼ� Statement ��ü�� �����Ѵ�
			stmt = con.createStatement();
			
			//��񿡼� �����ų ������
			String query = "SELECT deptno, dname, loc FROM dept";
			
			//Statement��ü�� ���� �������� ���� �Ѱ����� ���κ��� ����� �����͸� ResultSet�� �Ѱ��־� ��ü�� ����
			rs = stmt.executeQuery(query);
			
			//next()�� ���� Ŀ�� ������ �����Ͱ� �ִ��� ������ T/F�� ����
			while(rs.next())
			{
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				System.out.println(deptno+" "+dname+" "+loc);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{//�����Ҷ��� ���������� �����ͺ��̽��� �̿��Ҷ��� �������� �� �ݾ������
			try{
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

}
