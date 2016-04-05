import java.math.BigInteger;

public class Problem20 {
	public static void main(String [] args){
		int charValue = 0,sum=0;
		
		BigInteger n = new BigInteger("100");
		BigInteger result = new BigInteger("1");
		
	       
	       for(BigInteger i = BigInteger.valueOf(1); i.compareTo(n) <=-1; i=i.add(BigInteger.ONE)){
	    	   result = result.multiply(i);
	    	//   System.out.println(result);    	   
	       }
	       System.out.println("The factorial of "+n+" is " + result);
	       int length = String.valueOf(result).length();
    	   System.out.println("Length: " +length);
    	   String resultString = result.toString();
    	   System.out.println("String: "+resultString);
    	   
    	   for(int i=0;i<=(length-1);i++){  
	    	   char ab = resultString.charAt(i);
	    	   charValue = Character.getNumericValue(ab);
	    	   sum = sum+charValue;
    	   }
    	   System.out.println("Sum of the digits in 100! = "+sum);
    	  
    	}
}
