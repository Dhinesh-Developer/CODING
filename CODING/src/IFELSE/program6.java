package IFELSE;

import java.util.Scanner;
// Grade Program
public class program6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n>100 || n<0) {
			System.out.println("Wrong Input");
		}else if(n>89 && n<100) {
			System.out.println("A+");
		}else if(n>79 && n <89) {
			System.out.println("A");
		}else if(n>69 && n <79) {
			System.out.println("B");
		}else if(n>59 && n <69) {
			System.out.println("B+");
		}else if(n>49 && n <59) {
			System.out.println("C");
		}else if(n>39 && n <49) {
			System.out.println("C+");
		}else {
			System.out.println("F");
		}
	}

}
