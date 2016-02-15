import java.math.BigInteger;

public class Problem146 {
	public static void main(String [] args){
		
		BigInteger sum = BigInteger.ONE;
		for(int i=10; i<=1000000;i++){
			if(isPrime((int) (Math.pow(i, 2)+1))){
				if(isPrime((int) (Math.pow(i, 2)+3))){
					if(isPrime((int) (Math.pow(i, 2)+7))){
						if(isPrime((int) (Math.pow(i, 2)+9))){
							if(isPrime((int) (Math.pow(i, 2)+13))){
								if(isPrime((int) (Math.pow(i, 2)+27))){
									sum.add(BigInteger.valueOf(i));
								}
							}
						}
					}
				}
			}
		}
	}
	
	public static boolean isPrime(int x) {
		boolean wonderprime = false;
		if (x % 2 == 0)
			return false;
		for (int i = 2; i <= Math.sqrt(x); i++) {
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
