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

class Audio{} //�ִ� Product ��Ӿȹ޾Ƽ� buy�޼ҵ� �������صξ ��� �Ұ�

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
