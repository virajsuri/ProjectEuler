
public class Problem_14_Solved {
	public static void main(String[] args) {
		
		long starTime = System.currentTimeMillis();
		long endingpoint=1000000, maxiteration = 0,result=0;
		long sequence=0;
		
		
		for (long n = endingpoint; n >= 2; n--) {
		sequence=n;
		int length=1;
		
			while (sequence != 1) {
				if (sequence % 2 == 0) {
					sequence /= 2;
				}
				else{
					sequence = (3 * sequence) + 1;
				}
				length++;
			}

			if(length>maxiteration){
				maxiteration=length;
				result=n;
			}
		}
		
		
		System.out.println(result);
		long finTime = System.currentTimeMillis()-starTime;
		System.out.println("Elapsed time: "+finTime+" milliseconds.");
	}
}
