package lesson5.defaultmethods;
interface FPP
{
	String id = "CS390";
  static String CourseName(){
       return " Fundamendal Programming Structure";
}
}

public class StaticMethodsDemo {
	public static void main(String args[])
	{
	//	System.out.println(id);
		System.out.println("Course title : " + FPP.id + FPP.CourseName());
	}
}
