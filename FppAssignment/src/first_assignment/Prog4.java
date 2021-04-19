package first_assignment;

import java.util.Scanner;

//import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of String?");
		int numberOfString=sc.nextInt();

		String[] stringArray=new String[numberOfString];
		//String value = null;
		for(int i=0; i<stringArray.length;i++) {
			System.out.println("Enter a string value:");
			stringArray[i]=sc.next();
			System.out.printf("The length of %s is %d.",stringArray[i],stringArray[i].length());
		}
	
		sc.close();*/

		int count=0;
		int argsLength=args.length;
		
		for(int i=0;i<argsLength;i++) {
			System.out.printf("The length of %s is %d.",args[i],args[i].length());
			
			if(args[i].startsWith("A")) {
				count++;
			}
		}
		
		System.out.println("The number of String starts with A is "+ count);

	}

}
