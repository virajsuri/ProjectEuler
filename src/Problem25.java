import java.math.BigInteger;

public class Problem25 {
	//25test
	public static void main(String[] args) {
		BigInteger g = new BigInteger("0");
		BigInteger f = new BigInteger("1");
		
		for (int i = 2; i <= 100000000; i++) {
			f = f.add(g);
			g = f.subtract(g);
			if (f.mod(new BigInteger("1")).equals(BigInteger.ZERO)) {
			//	System.out.println(f);
				int length = String.valueOf(f).length();
			 	if(length==1000){
			 		System.out.println(i);
			 		System.out.println(f);
			 		break;
			 		
			 	}
			}
		}
		
		
	}
}
