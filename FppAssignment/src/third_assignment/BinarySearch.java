package third_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static int counter = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray= {1,3,4,6,8,10,11,13,14,18,20};
		System.out.println("Arrays :"+Arrays.toString(numArray));
		System.out.println("Enter the target value from the Array:");
		
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		sc.close();
		
		System.out.printf("Searching %d in %s results: %d",target,Arrays.toString(numArray),searchTarget(numArray,target));

	}
	
	public static int searchTarget(int[] numArray,int target) {
		
		int numArrayLength=numArray.length;
		if(numArrayLength==0) {
			return -1;
		}
		return searchTarget(numArray,target,0,numArrayLength-1);
	}
	
	private static int searchTarget(int[] numArray,int target, int startPosition,int endPosition) {
					
//		counter++;
//		int index=(startPosition+endPosition)/2;
//		
//		if (counter > numArray.length || index >= numArray.length)
//			return -1;			
//			
//		if(numArray[index]==target) {
//			return index;
//		}else if(target<numArray[index]) {
//			endPosition=index-1;
//			System.out.println("numArray:"+Arrays.toString(numArray)+ " Start :"+startPosition+ " End :"+endPosition);
//			return searchTarget(numArray,target,startPosition,endPosition);
//		}else{
//			startPosition=index+1;
//			System.out.println("numArray:"+Arrays.toString(numArray)+ " Start :"+startPosition+ " End :"+endPosition);
//			return searchTarget(numArray,target,startPosition,endPosition);
//		}
		
		counter++;
		int mid = (startPosition + endPosition) / 2;
		if (counter > numArray.length || mid >= numArray.length) {
			return -1;
		}
		if(startPosition > endPosition) {
			return -1;
		}
//		
		if(startPosition == endPosition && target != numArray[mid]) {
			return -1;
		}

		if (numArray.length == 0) {
			return -1;
		}

		if (target == numArray[mid]) {
			return numArray[mid];
		}

		if (target < numArray[mid]) {
			System.out.println("numArray:"+Arrays.toString(numArray)+ " Start :"+startPosition+ " End :"+endPosition);
			return searchTarget(numArray, target, startPosition, mid - 1);
		}else {
			System.out.println("numArray:"+Arrays.toString(numArray)+ " Start :"+startPosition+ " End :"+endPosition);
			return searchTarget(numArray, target, mid + 1, endPosition);
		}
		
	}

}
