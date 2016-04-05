import java.math.BigInteger;
public class Problem10 {
	public static void main(String[] args){

		long starTime = System.currentTimeMillis();
		int twoMil=2000000;
		long sum=5;
		
		for(int i=1;i<=twoMil;i++){
			if(isPrime(i)){
				sum=sum+=i;
				System.out.println(i);
				
			}
		}
		System.out.println(sum);
	  //  long finTime = System.currentTimeMillis()-starTime;
		//System.out.println("Elapsed time: "+finTime+" milliseconds.");
	}
	
	
	public static boolean isPrime(long x) {
		boolean wonderprime = false;
		if (x % 2 == 0)
			return false;
		for (long i = 2; i <= Math.sqrt(x); i++) {
			if (x % i != 0) {
				wonderprime = true;
			} else {
				wonderprime = false;
				break;
			}
		}
		return wonderprime;
	}
}
