package REARRANGE_ARRAY;
/*]
 * * given an array of n size with positive integers and 0;write a program to rearrange
 * the array such that all 0 are last at the end of the array.
 * output = 3 7 4 6 8 3 0 0 0 0 
 */
public class program2 {
	private static void zeroAtLast(int[] ar) {
		int i = 0;
		int j = 0;
		while(i<ar.length) {
			if(ar[i] == 0) {
				i++;
			}else {
				ar[j] = ar[i];
				i++;
				j++;
			}
		}
		while(j<ar.length) {
			ar[j] = 0;
			j++;
		}
		for(int k = 0;k<ar.length;k++) {
			System.out.print(ar[k]+" ");
		}
	}
	public static void main(String[] args) {
		int[] ar = {3,7,0,4,0,6,0,8,0,3};
		zeroAtLast(ar);
	}

}
