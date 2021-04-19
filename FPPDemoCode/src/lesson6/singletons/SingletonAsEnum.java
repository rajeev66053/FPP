package lesson6.singletons;

enum SingletonEnum {
	INSTANCE;
	SingletonEnum(){
		System.out.println("Singlton object created");
	}
	
}
public class SingletonAsEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonEnum instance = SingletonEnum.INSTANCE;
		SingletonEnum instance1 = SingletonEnum.INSTANCE;

	}

}
