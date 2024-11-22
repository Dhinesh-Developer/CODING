package ARRAY;

import java.util.Scanner;
// Print the float Numbers.
public class program3 {
	public static void printFLoatVAlue(float[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		float[] ar = new float[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextFloat();
		}
		printFLoatVAlue(ar);
	}

}
