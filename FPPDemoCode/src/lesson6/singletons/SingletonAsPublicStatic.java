package lesson6.singletons;

/*
 * Sol 2
 * Thread safe
 * easy initialization
 */
public class SingletonAsPublicStatic {
	public static final SingletonAsPublicStatic INSTANCE 
		= new SingletonAsPublicStatic();
	
	private SingletonAsPublicStatic() {System.out.println("Object created");}
	
	public static void main(String[] args) {
		SingletonAsPublicStatic singleton1 = SingletonAsPublicStatic.INSTANCE;
		SingletonAsPublicStatic singleton2 = SingletonAsPublicStatic.INSTANCE;
	}
}
