package first_assignment;

import java.util.Arrays;
//import java.util.Scanner;

public class RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] animalDups= {"horse", "dog", "cat", "horse","dog"};
		

		System.out.println(Arrays.toString(animalDups));
		

//		Arrays.sort(animalDups);
		//By sorting
//		for(int i=0;i<animalDups.length-1;i++) {
//			for(int j=i+1;j<animalDups.length;j++) {
//				if(animalDups[i].compareTo(animalDups[j])>0) {
//					String temp =animalDups[i];
//					animalDups[i]=animalDups[j];
//					animalDups[j]= temp;
//				}
//				
//			}
//			
//		}
//		
//		int arrayLength=animalDups.length;
//		
//		String[] removedDups=removeDups(animalDups, arrayLength);
		
		String[] removedDups=removeDups(animalDups);
		
		System.out.println(Arrays.toString(removedDups));

	}
	
//	public static String[] removeDups(String[] animalDups, int length) {
//		
//		
//		if(length==0 ||length ==1) {
//			return animalDups;
//		}
//		
//		String[] temp =new String[length];
//		int j=0;
//		for(int i=0;i<length-1;i++) {
//			if(animalDups[i].compareTo(animalDups[i+1])!=0) {
//				temp[j]=animalDups[i];
//				j++;
//			}
//		}
//
//		temp[j]=animalDups[length-1];
//		
//		String[] finalArray=new String[j+1];
//		for(int k=0;k<=j;k++) {
//			finalArray[k]=temp[k];
//		}
//		
//		return finalArray;
//		
//	}
	
	public static String[] removeDups(String[] animalDups) {
		String[] temp = new String[animalDups.length];
		int count=0;
		for(String animal:animalDups) {
			boolean exist=false;
			for(int i=0;i<=count;i++) {
				
				if(temp[i]==animal) {
					exist=true;
					break;
				}
			}

			if(!exist) {
				temp[count]=animal;
				count++;
			}
		}
		
		String [] animal=new String[count];
		for(int j=0;j<count;j++) {
			animal[j]=temp[j];
		}
		return animal;
	}

}
