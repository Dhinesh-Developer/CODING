package com.dk.java;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int[][][] a = new int[2][][];
		 a[0] = new int[3][];
		 a[1] = new int[2][];
		 a[0][0] = new int[2];
		 a[0][1] = new int[2];
		 a[0][2] = new int[3];
		 a[1][0] = new int[2];
		 a[1][1] = new int[3];
		 
		 for(int i=0;i<a.length;i++) {
			 for(int k=0;k<a[i].length;k++) {
				 for(int j=0;j<a[i][k].length;j++) {
					 System.out.println("school "+i+" class"+j+" student "+k);
					 a[i][k][j] = in.nextInt();
				 }
			 }
		 }
		 
		 for(int i=0;i<a.length;i++) {
			 for(int k=0;k<a[i].length;k++) {
				 for(int j=0;j<a[i][k].length;j++) {
					 System.out.print(a[i][k][j]+" ");
				 }
				 System.out.println();
			 }
			 System.out.println();
		 }
	}=

}
