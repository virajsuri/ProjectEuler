
public class Problem3 {
	public static void main(String[] args) {

		long starTime = System.currentTimeMillis();
	    long number = 600851475143L;
	//	long number = 10000L;
	    long highestPrime = 0;
	    for (long i = 2; i <= number; i++) {
	        if (number % i == 0) {
	            highestPrime = i;
	            number /= i;
	            System.out.println(i);
	            i++;
	        }
	    }
	    
	    

	    System.out.println("Highest prime: "+highestPrime);
	    long finTime = System.currentTimeMillis()-starTime;
		System.out.println("Elapsed time: "+finTime+" milliseconds.");
	}

}
