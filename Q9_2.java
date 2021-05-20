/**
 * @author Hansen Li
 *
 * @date Jun 18, 2019
 */
public class Q9_2 {

	public static void main(String[] args) {
		
		Stock tempStock = new Stock("ORCL", "Oracle Corporation");
		//creates test values
		tempStock.setPreviousClosingPrice(34.5);
		tempStock.setCurrentPrice(34.35);
	
		System.out.printf("The stock symbol is %s and the stock name is %s.\n", tempStock.getSymbol(), tempStock.getName());
		System.out.printf("The price change percentage is %.2f%%.", tempStock.getChangePercent(tempStock.getPreviousClosingPrice(),tempStock.getCurrentPrice()));
		
		
	}
}
