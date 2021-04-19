package mypackage;

public class Apple extends Fruit implements Food{

	public static void main(String[] args) {
		Fruit f=new Apple();
		f.eat(10);
	}
	public int eat1(int x) {
		return x+1;
	}
}
