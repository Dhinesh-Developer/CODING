package ARRAY;

public class program21 {
	public static void printAllPair(int[] ar) {
		for(int i=0;i<ar.length-1;i++) {
			for(int j=i+1;j<ar.length;j++) {
				System.out.println(ar[i]+" "+ar[j]);
			}
		}
	}
	public static void main(String[] args) {
		
		int[] ar = {3,2,5,7,1};
		printAllPair(ar);
	}

}
