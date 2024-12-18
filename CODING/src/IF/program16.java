package IF;
// check if the number is power of 2.
public class program16 {
	public class PowerOfTwoChecker {
		public static boolean isPowerOfTwo(int n) {
			// A number is a power of 2 if n > 0 and (n & (n - 1)) == 0
			return n > 0 && (n & (n - 1)) == 0;
		}
		public static void main(String[] args) {

			int num = 16;
			if (isPowerOfTwo(num)) {
				System.out.println(num + " is a power of 2.");
			} else {
				System.out.println(num + " is not a power of 2.");
			}
		}

	}

}
