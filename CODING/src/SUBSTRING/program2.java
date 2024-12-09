package SUBSTRING;
import java.util.Scanner;
/*// write a program to print all the substring of length 4.
 mississippi
4
miss
issi
ssis
siss
issi
ssip
sipp
ippi

 */
public class program2 {
	static void subString(String s,int n) {
		for(int i=0;i<=s.length()-n;i++) {
			String t="";
			for(int j=i;j<n+i;j++) {
				t = t+s.charAt(j);
			}
			System.out.println(t);
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n = in.nextInt();
		subString(s,n);
	}

}
