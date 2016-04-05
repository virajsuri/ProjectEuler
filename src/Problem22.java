import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem22 {
	public static void main(String [] args) {
		Problem22 obj = new Problem22();
		long totalSum=0;
		
		String[] names = obj.readFile(); //alphabetical order 5163 spots
		
		for(int i=0; i<=names.length-1;i++) {
			int letterSum=obj.getValue(names[i]);
			int indexName=(i+1);
			System.out.println(names[i]);
			System.out.print(letterSum+"*"+indexName);
			int nameScore=letterSum*indexName;
			System.out.println(" = "+nameScore);
			totalSum+=nameScore;
		}
		System.out.println("Total sum: "+totalSum);
		
		
	}
	
	
	public int getValue(String input) {
		input=input.toLowerCase();
		final String alphabet="abcdefghijklmnopqrstuvwxyz";
		int sum =0;
		for(int i=0;i<input.length();i++){
			sum +=alphabet.indexOf(input.charAt(i))+1;
		    
		}
		return sum;
	}



	public String[] readFile() {
		String [] names=null;
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new FileInputStream("p022_names.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not found");}
		
	while(inputStream.hasNext()) {
		String line = inputStream.nextLine();
		names = line.split(",");
		
	}
	java.util.Arrays.sort(names);
	for(int i=0;i<=names.length-1;i++) {
		names[i]=names[i].substring(1, names[i].length()-1);
	}	
		return names;
	}
}