
public class Problem15 {
	public static void main(String [] args) {
		int n = 20;
		long paths = 1;
		 
		for (int i = 0; i < n; i++) {
		    paths *= (2 * n) - i;
		    paths /= i + 1;
		}
		System.out.println(paths);
	}
}
