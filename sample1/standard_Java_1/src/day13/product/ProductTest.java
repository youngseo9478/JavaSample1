package day13.product;

public class ProductTest {
	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		buyer.buy(new Computer());
		buyer.buy(new Tv());
		buyer.buy(new Ipad());
		buyer.buy(new Iphone());
	}
}

class Product {
	int price;
	int point;
}

class Tv extends Product {}

class Computer extends Product {}

class Ipad extends Product {}

class Iphone extends Product {}

class Audio{} //애는 Product 상속안받아서 buy메소드 다형성해두어도 사용 불가

class Buyer {
	int money;
	int point;

	void buy(Product p) {
		money -= p.price;
		point += p.point;
	}

/*	void buy(Tv t) {
		money -= t.price;
		point += t.point;
	}

	void buy(Computer t) {
		money -= t.price;
		point += t.point;
	}*/
}
