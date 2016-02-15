import java.math.BigInteger;


public class Problem_16_Solved {
	public static void main(String [] args){
		int charValue = 0,sum=0;
		BigInteger twoPow1k = new BigInteger("2");
		twoPow1k = twoPow1k.pow(1000);
		System.out.println("2^1000 = "+twoPow1k);
		
		int length = String.valueOf(twoPow1k).length();
 	    System.out.println("Length of 2^1000: " +length);
		String resultString = twoPow1k.toString();
 	    
 	   for(int i=0;i<=(length-1);i++){  
    	   char ab = resultString.charAt(i);
    	   charValue = Character.getNumericValue(ab);
    	   sum = sum+charValue;
    	   
	   }
	   System.out.println("Sum of the digits in 2^1000 = "+sum);
	  
	}
}
