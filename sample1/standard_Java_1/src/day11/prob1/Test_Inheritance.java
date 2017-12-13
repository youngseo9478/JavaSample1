package day11.prob1;

public class Test_Inheritance {
	public static void main(String[] args) {

		Object s = new Student("홍길동", 20, 1);
		if (s instanceof Student)
			((Student) s).print();
		s = "Hello"; // 오브젝트 타입은 모든 타입을 받을 수 있음. String객체를 받은것
		if (s instanceof Student)
			((Student) s).print();
		// s는 이제 문자열객체의 주소를 가지고 있으므로 위에처럼 캐스팅할 수 없으므로 출력X

		String name = "OOO";
		Student s1 = new Student("길동", 20, 1);
		Teacher t1 = new Teacher("홍샘", 40, "java");
		Employee e1 = new Employee("홍길동", 44, "교무장");
		// Person 객체(주소)를 여러개 담을 수 있는 배열. name은 String타입이니까 Person타입 X =>ERROR!
		// Person[] p {name, s1, t1, e1};
		Person[] p = { s1, t1, e1, new Student("고길동", 28, 3) };
		// 현재 p 에는 타입이 다른 객체들이 들어있다. 각각의 객체들의 정보를 찍고 싶은데
		// 객체마다 정의하고 있는 print()메소드가 다르다.
		// 어떻게 하면 해당하는 print()를 호출할 수 있을까?

		// 1. instanceof 사용해서 문제해결
		// if문안에서 현재 인덱스에 어떤 타입의 객체를 갖고있는지 조건식을 통해 판별한 다음
		// 해당하는 객체의 print()메소드를 사용하도록 설계
		System.out.println("***********************************************");
		for (int i = 0; i < p.length; i++) {
			if (p[i] instanceof Student)
				((Student) p[i]).print();
			if (p[i] instanceof Teacher)
				((Teacher) p[i]).print();
			if (p[i] instanceof Employee)
				((Employee) p[i]).print();
		}
		// 2. Overriding 통해서 문제해결
		// Person타입에 print()메소드를 만들어 놓고 자식클래스에서 오버라이딩해서 사용하면
		// 1과 같이 동작하는 것을 알 수 있다. (더 간편하고 효율적)
		System.out.println("***********************************************");
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}
		System.out.println("***********************************************");
		Person pp = s1;
		pp.print();

		System.out.println("***********************************************");
		// Object는 주소를 담는 배열이므로 어떤 것이든 담을 수 있음
		Object[] obj = { name, s1, t1, e1 };
		// obj중에 person타입인 것만 print() 하려면?
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof Person)
				((Person) obj[i]).print();
			// 오버라이딩되어있어서 person으로 캐스팅하면 됨
		}

	}
}
