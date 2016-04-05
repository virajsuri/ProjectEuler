public class Problem4{
	public static void main(String [] args) {
		int max = 999 * 999;
		String revback = "";
		int i = 0;

		for (i = max; i >= 900000; i--) {
			
				String rev = new StringBuilder(Integer.toString(i)).reverse().toString();
				revback = new StringBuilder(rev).reverse().toString();
	
				if (rev.equals(revback)) {
					System.out.println("Palindrome: " + i);
	
					for (int q = 999; q > 100; q--) {
						for (int j = 999; j > 100; j--) {
							int pp = q * j;
							if (pp == i) {
								System.out.println("Answer: " + pp);
								System.exit(0);
							}
						}
					}
				}
			
		}
	}
}

