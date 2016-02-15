import java.math.BigInteger;

public class Problem2_Solved {
	public static void main(String[] args) throws InterruptedException {

		BigInteger g = new BigInteger("0");
		BigInteger f = new BigInteger("1");
		BigInteger sum = new BigInteger("0");

		for (int i = 1; i <= 33; i++) {
			f = f.add(g);
			g = f.subtract(g);
			if (f.mod(new BigInteger("2")).equals(BigInteger.ZERO)) {
				System.out.println(f);
				sum = sum.add(f);
			}
		}
		System.out.println("sum:" + sum);
	}
}


