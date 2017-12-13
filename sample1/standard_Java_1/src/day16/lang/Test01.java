package day16.lang;

public class Test01 {
	public static void main(String[] args) {

		Point p = new Point(1, 1); // 객체생성시 항상 호출되는 생성자함수 <-> 소멸자(finalize())
		System.out.println(p);

		p.close();
		// 연결을 끊기 전에 사용을 자원반납을 해서 더이상 사용 안한다고 알려줘야 한다...

		p = null; // gc한테 관리하라고 알려주는 것
		// 다 쓴 객체는 null을 해줘야만 메모리 정리 대상이 된다.
		// 자바는 직접 메모리 관리를 하지 않기때문에 소멸자가 호출되는 시점을 알 수 없음
		// 그래서 finalize()에게만 맡겨서는 절대 안된다. 문제가 발생할 여지 높아짐
		// 임의로 만들어서 사용해야한다.(close메소드에 맡길거다)

		// System.gc(); //gc 호출 명령
		// 이걸 수행하면 서비스 중지상태가 되므로 거의 사용안한다.

		System.out.println("main end");
	}
}

//복제를 허용하려면 implements Cloneable을 해주여야 오버라이딩한 clone()를 사용할 수 있다.
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

	// 소멸자 역할을하는 메소드로 여기서는 자원반납코드가 오게 됨 =>언제 수행되는지 알 수 없기떄문에 자바에서 잘 안씀
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(getClass().getSimpleName() + " finalize() 수행");
		System.out.println("자원반납코드");
	}

	//별도로 자원반납코드를 집어넣고 소멸자 역할을 하게끔한다.
	void close() {
		System.out.println(getClass().getSimpleName() + " finalize() 수행");
		System.out.println("자원반납코드");

	}
	
	/*Object타입으로 하면 사용할때 다운캐스팅이 필요해서 번거로움
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
	
	
	//이제 이렇게도 가능
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