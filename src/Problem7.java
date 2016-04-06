public class Problem7 {
	public static void main(String[] args) {

		int iteration = 0;
		int num = 0;
		long starTime = System.currentTimeMillis();
		boolean candidateFound=false;

		int i=1;
		while(!candidateFound) {
			if(isPrime(i)) {
				iteration++;
//				System.out.println("Prime: "+i);
//				System.out.println("Iteration: "+iteration);
			}
			if(iteration==10001) {
				num=i;
				candidateFound=true;
			}
			i++;
		}
		System.out.println(num);
	    long finTime = System.currentTimeMillis()-starTime;
		System.out.println("Elapsed time: "+finTime+" milliseconds.");
	}
	
	public static boolean isPrime(int x) {

		if (x % 2 == 0)
			return false;
		for (int i = 3; i * i <= x; i += 2)
            if (x % i == 0) 
            	return false;
        return true;

	}
}
