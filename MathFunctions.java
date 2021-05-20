/**
 * @author Hansen Li
 *
 * @date Jun 15, 2019
 */
public class MathFunctions {
	
	// takes list of doubles and returns standard deviation
	public static double deviation(double[] x) {
		double sum = 0.0;
		double difference;
		double meanVal = mean(x);
		
		// sums up the squared difference values of x and mean
		for (int i = 0; i < x.length; i++) {
			difference = Math.pow(x[i] - meanVal, 2);
		    sum += difference;
		    }
		
		return Math.sqrt(sum / (x.length - 1));
	}
	
	
	// takes list of doubles and returns mean
	public static double mean(double[] x) {
		
		double sum = 0.0;
		
		// sums up all values of the list
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		
		// returns the calculated mean
		return sum / x.length;
		
		
	}
}
