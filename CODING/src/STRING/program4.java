package STRING;
 // count the words.
import java.util.Scanner;
class check{
	int cnt = 0;
	public void countWords(String s) {
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				cnt++;
			}
		}
		System.out.println(s.charAt(0) == ' '?cnt:cnt+1);
			
	}
}
public class program4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		check c = new check();
		c.countWords(s);
	}

}
