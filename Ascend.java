// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		double a = (Math.random() * range);
		double b = (Math.random() * range);
		double c = (Math.random() * range);

		double min1 = Math.min(a , b);
		double min2 = Math.min(min1 , c);

		double max1 = Math.max(a , c);
		double max2 = Math.max(max1 , b);
		
		double middle = a + b + c - min2 - max2;


		System.out.println((int) a + " " + (int) b + " " + (int) c);
		System.out.println((int) min2 + " " + (int) middle + " " + (int) max2);

	}
}

}
