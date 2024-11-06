// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double initAmount = Double.parseDouble(args[0]);
		double interestRate = Double.parseDouble(args[1]);
		double years =  Double.parseDouble(args[2]);

		double futureValue = initAmount * Math.pow((1 + ( interestRate / 100)), years);

		System.out.println("After " + (int) years + "years, " + "$" + (int) initAmount + " saved at " + (int) interestRate + "% will yield $" + (int) futureValue);
		
		}
}