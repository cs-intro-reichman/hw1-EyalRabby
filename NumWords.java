// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int hundreds = Integer.parseInt(args[0]) / 100;
		int tens = (Integer.parseInt(args[0]) - hundreds*100) / 10;
		int ones = Integer.parseInt(args[0]) % 10 ;

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");		
	}
}
