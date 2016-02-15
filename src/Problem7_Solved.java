public class Problem7_Solved {
	public static void main(String[] args) {

		int iteration = 0;
		int num = 0;
		long starTime = System.currentTimeMillis();
		
		for (int i = 1; i <= 100000000; i=i+2) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				System.out.print("Prime: ");
				System.out.println(i);
				iteration++;
			}
			if (iteration == 10001) {
				System.out.println("10,001st prime: " + i);
				break;
			}
		}
	    long finTime = System.currentTimeMillis()-starTime;
		System.out.println("Elapsed time: "+finTime+" milliseconds.");
	}
}
