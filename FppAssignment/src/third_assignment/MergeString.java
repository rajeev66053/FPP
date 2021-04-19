package third_assignment;

import java.util.Scanner;

public class MergeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String :");
		String str1=sc.nextLine();
		System.out.println("Enter second String :");
		String str2=sc.nextLine();
		sc.close();
		System.out.printf("Merged String of %s and %s is %s ",str1,str2,mergedString(str1,str2));
	}
	
	public static String mergedString(String str1,String str2) {
		
		if(str2.length()==0||str2==null) {
			return str1;
		}
		
		if(str1.length()==0||str1==null) {
			return str2;
		}
		
		return (str1.toLowerCase().charAt(0) < str2.toLowerCase().charAt(0))?str1.charAt(0)+mergedString(str1.substring(1),str2):str2.charAt(0)+mergedString(str1,str2.substring(1));
	}

}
