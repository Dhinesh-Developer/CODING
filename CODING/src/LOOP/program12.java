package LOOP;

import java.util.Scanner;

public class program12 {
	public static int firstNPrimeNumber(int n) {
	     public static boolean checkPrime(int n){
			for(int i=2;i*i<=n;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
	    int count  = 0;
	    for(int i=2;count <n;i++)
	    {
	    	if(checkPrime(n)) {
	    		System.out.println(i);
	    		count++;
	    	}
	    }
	    
	}
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		int res = firstNPrimeNumber(n);
		
	}

}
