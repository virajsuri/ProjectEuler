
public class Problem6 {
	public static void main(String [] args){
		int base = 1;
		int sum = 0;
		int sum10 = 0;
		int squaresum = 0;
		
		for(base=1;base<=100;base++){
			int square = (int)Math.pow(base,2);
			sum = sum+square;
		}
		System.out.println("The sum of the squares: "+sum);
		
		
		for(base=1;base<=100;base++){
			sum10 = sum10+base;
			squaresum = (int)Math.pow(sum10,2);
		}
		System.out.println("The square of the sum of the squares: "+squaresum);
		
		int difference = squaresum - sum;
		System.out.println("Difference: "+difference);
	}
}
