package com.dk.java;

import java.util.Scanner;

public class prorgam2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[][] a =new int[2][];
		a[0] = new int[3];
		a[1] = new int[5];
		int i,j;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				System.out.println("class "+i+" students "+j);
				a[i][j] = in.nextInt();
			}
		}
		System.out.println("Ages are: ");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
