package day16.lang;

public class Test01 {
	public static void main(String[] args) {

		Point p = new Point(1, 1); // ��ü������ �׻� ȣ��Ǵ� �������Լ� <-> �Ҹ���(finalize())
		System.out.println(p);

		p.close();
		// ������ ���� ���� ����� �ڿ��ݳ��� �ؼ� ���̻� ��� ���Ѵٰ� �˷���� �Ѵ�...

		p = null; // gc���� �����϶�� �˷��ִ� ��
		// �� �� ��ü�� null�� ����߸� �޸� ���� ����� �ȴ�.
		// �ڹٴ� ���� �޸� ������ ���� �ʱ⶧���� �Ҹ��ڰ� ȣ��Ǵ� ������ �� �� ����
		// �׷��� finalize()���Ը� �ðܼ��� ���� �ȵȴ�. ������ �߻��� ���� ������
		// ���Ƿ� ���� ����ؾ��Ѵ�.(close�޼ҵ忡 �ñ�Ŵ�)

		// System.gc(); //gc ȣ�� ���
		// �̰� �����ϸ� ���� �������°� �ǹǷ� ���� �����Ѵ�.

		System.out.println("main end");
	}
}

//������ ����Ϸ��� implements Cloneable�� ���ֿ��� �������̵��� clone()�� ����� �� �ִ�.
class Point implements Cloneable{
	private int x;
	private int y;

	public Point() {
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	// �Ҹ��� �������ϴ� �޼ҵ�� ���⼭�� �ڿ��ݳ��ڵ尡 ���� �� =>���� ����Ǵ��� �� �� ���⋚���� �ڹٿ��� �� �Ⱦ�
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(getClass().getSimpleName() + " finalize() ����");
		System.out.println("�ڿ��ݳ��ڵ�");
	}

	//������ �ڿ��ݳ��ڵ带 ����ְ� �Ҹ��� ������ �ϰԲ��Ѵ�.
	void close() {
		System.out.println(getClass().getSimpleName() + " finalize() ����");
		System.out.println("�ڿ��ݳ��ڵ�");

	}
	
	/*ObjectŸ������ �ϸ� ����Ҷ� �ٿ�ĳ������ �ʿ��ؼ� ���ŷο�
	 * @Override
	protected Object clone() {
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return obj;
	}*/
	
	
	//���� �̷��Ե� ����
	@Override
	protected Point clone() {
		Point obj = null;
		try{
			obj = (Point)super.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
}