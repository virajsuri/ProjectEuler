public class Problem5{
	public static void main(String[] args) {

		long starTime = System.currentTimeMillis();

		for (int i = 2; i < 1000000000; i=i+2) {					
			if(
			//Numbers that are divisible by a higher int
			//  i % 2 <= 0 &&
			//	i % 3 <= 0 &&
			//  i % 4 <= 0 &&
			//	i % 5 <= 0 &&
			//	i % 6 <= 0 &&
			//	i % 7 <= 0 &&
			//	i % 8 <= 0 &&
			//	i % 9 <= 0 &&
			//	i % 10 <= 0 &&
				i % 11 <= 0 &&
			//	i % 12 <= 0 &&
				i % 13 <= 0 &&
				i % 14 <= 0 &&
				i % 15 <= 0 &&
				i % 16 <= 0 &&
				i % 17 <= 0 &&
				i % 18 <= 0 &&
				i % 19 <= 0 &&
				i % 20 <= 0) {
				System.out.println(i);
				break;
				
			}
		}
		long finTime = System.currentTimeMillis()-starTime;
		System.out.println("Elapsed time: "+finTime+" milliseconds.");
	}
}
