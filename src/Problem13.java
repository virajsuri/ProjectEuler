import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;


public class Problem13 {
	public static void main(String [] args) throws IOException{
		BigInteger sum = new BigInteger("0");
		Scanner inputStream = null;
		try{
			inputStream = new Scanner(new FileInputStream("p013_ints.txt"));
		}
		catch (FileNotFoundException e){
			System.out.println("File not found");
			System.exit(0);
		}
		for(int i=1;i<=100;i++){
			BigInteger line1 = new BigInteger(inputStream.nextLine());
			sum = sum.add(line1);
		}
		
		System.out.println("SUM: "+sum);
	}
}
