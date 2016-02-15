
public class Problem17 {
	public static void main(String [] args){
		int sum=0;
		String [] toNine = {"one","two","three","four","five","six","seven","eight","nine"};
		String [] byTentoHundred = {"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	
		for(int i=1; i<=5; i++){
			sum+=toNine[i-1].length();
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}
