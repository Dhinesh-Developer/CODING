package REARRANGE_ARRAY;
/*
 * given a array of n integers,write a program to print all the consecutive sub array.
 * output = 
5
12 13 14
9
2 3 4 5
 */
public class program3 {
	private static void printConsecutiveSubArray(int[] ar) {
		
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i+1] - ar[i] == 1) {
				System.out.print(ar[i]+" ");
			}else {
				System.out.print(ar[i]);
				System.out.println();
			}
		}
		System.out.println(ar[ar.length-1]);
	}
	public static void main(String[] args) {
		int[] ar = {5,12,13,14,9,2,3,4,5};
		printConsecutiveSubArray(ar);
	}

}
