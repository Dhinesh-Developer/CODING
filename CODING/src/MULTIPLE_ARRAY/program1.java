package MULTIPLE_ARRAY;

import java.util.Scanner;

public class program1 {
	private static void CommonElements(int[] ar1,int[] ar2) {
		int i=0;
		int j=0;
		while(i< ar1.length &&j< ar2.length) {
			if(ar1[i] == ar2[j]) {
				System.out.println(ar1[i]);
				i++;
				j++;
			}
			else if(ar1[i]>ar2[j]) {
				j++;
			}else {
				i++;
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int[] ar1 = new int[n1];
		for(int i=0;i<ar1.length;i++) {
			ar1[i] = in.nextInt();
		}
		int[] ar2 = new int[n2];
		for(int i=0;i<ar2.length;i++) {
			ar2[i] = in. nextInt();
		}
		
		CommonElements(ar1,ar2);
	}

}
