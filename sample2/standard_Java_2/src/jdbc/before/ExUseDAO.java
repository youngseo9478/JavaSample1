package jdbc.before;

import java.util.ArrayList;

public class ExUseDAO {

	public static void main(String[] args)
	{
		//���⼭ ExDAO Ŭ���� ����Ϸ��� ��ü�� �����������!
		ExDAO dao = new ExDAO();
		
		//SELECT
		ArrayList<ExDTO> list = dao.select();
		
		for(ExDTO dto : list)
		{
			int deptno = dto.getDeptno();
			String dname = dto.getDname();
			String loc = dto.getLoc();
			System.out.println(deptno+" "+dname+" "+ loc);
		}
		
		//INSERT
		dao.insert(82,"PerfumeLab","seoul");
		for(ExDTO dto : list)
		{
			int deptno = dto.getDeptno();
			String dname = dto.getDname();
			String loc = dto.getLoc();
			System.out.println(deptno+" "+dname+" "+ loc);
		}
	}
}
