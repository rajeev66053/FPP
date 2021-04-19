package first_assignment;

import java.util.Arrays;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {5,6,-4,3,1};
		int[] b= {3,8,9,11};
		

		int res[] = combine(a,b);
		
		/*System.arraycopy(a, 0, c, 0, alength);
		System.arraycopy(b, 0, c, alength, blength);*/
		
		System.out.println(Arrays.toString(res));

	}
	
	public static  int[] combine(int[]a, int[] b) {
		
		int[] temp=new int[a.length+b.length];
		int i=0;
		
		for(int x : a) {
			temp[i]=x;
			i++;
		}
		
		for(int y : b) {
			temp[i]=y;
			i++;
		}
		
		return temp;
	}
}
