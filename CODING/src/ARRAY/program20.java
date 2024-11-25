package ARRAY;
// Find the product of 2 pairs return largest * secondLargest 
public class program20 {
	public static int maxProductPair(int[] ar) {
		int l = Integer.MIN_VALUE;
		int sl = Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] > l) {
				sl = l;
				l = ar[i];
			}else if(ar[i] > sl) {
				sl = ar[i];
			}
		}
		return l*sl;
	}

	public static int minProductPair(int[] ar) {
		int s = Integer.MAX_VALUE;
		int ss = Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] < s) {
				ss = s;
				s = ar[i];
			}else if(ar[i] < ss) {
				ss = ar[i];
			}
		}
		int t = s*ss;
		return t;
	}                                                          
	public static void main(String[] args) {
		//int[] ar = {3,2,7,4,9};
		int[] ar = {-7,-3,-9,-4,-5};
		int res1 = maxProductPair(ar);
		int res2 = minProductPair(ar);

		System.out.println("Max pair product in the array: "+ (res1>res2?res1:res2));
	}
	//Max pair product in the array: 63
}
