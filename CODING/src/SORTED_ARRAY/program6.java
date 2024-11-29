package SORTED_ARRAY;
import java.util.Scanner;
 // write a program to print all the unique element .

public class program6 {
	private static void uniqueELementsCount(int[] ar) {
		int count=1;
		int uniqueElement=0;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i] == ar[i+1]){
				count++;
			}else {
				if(count ==1) {
					uniqueElement++;
				}
				count=1;
			}
		}
		if(count==1) {
			uniqueElement++;
		}
		System.out.println(uniqueElement);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		uniqueELementsCount(ar);
	}

}
