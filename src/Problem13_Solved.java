import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;


public class Problem13_Solved {
	public static void main(String [] args) throws IOException{
		BigInteger sum = new BigInteger("0");
		Scanner inputStream = null;
		try{
<<<<<<< HEAD
			inputStream = new Scanner(new FileInputStream("ints.txt"));
=======
			inputStream = new Scanner(new FileInputStream("ints_problem13.txt"));
>>>>>>> 0ab4e76ec6ef6631b5d3ade020dc7625625c95cd
		}
		catch (FileNotFoundException e){
			System.out.println("File not found");
			System.exit(0);
		}
		for(int i=1;i<=100;i++){
			BigInteger line1 = new BigInteger(inputStream.nextLine());
			//System.out.println(line1);
			sum = sum.add(line1);
		}
		System.out.println();
		System.out.println("SUM: "+sum);
<<<<<<< HEAD
=======
		System.out.println("First 10 digits: "+sum.toString().substring(0, 10));
>>>>>>> 0ab4e76ec6ef6631b5d3ade020dc7625625c95cd
	}
}
