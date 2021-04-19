package lesson12.systemexception;

public class CheckedExpDemo {
  
	public static void main(String[] args) throws CloneNotSupportedException  {
		Course c1 = new Course("CS390","FPP");
		Course copy = (Course) c1.clone();
		System.out.println("Original : " + c1);
		System.out.println("Cloned  : " + copy);
	}
}
