/**
 * @author Hansen Li
 *
 * @date Jun 18, 2019
 */
public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock() {
	}
	
	public Stock(String stockSymbol, String stockName) {
		setSymbol(stockSymbol);
		setName(stockName);
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSymbol(String stockSymbol) {
		symbol = stockSymbol;
	}
	
	public void setName(String stockName) {
		name = stockName;
	}
	
	public void setPreviousClosingPrice(double s) {
		previousClosingPrice = s;
	}
	
	public void setCurrentPrice(double s) {
		currentPrice = s;
	}
	
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	
	public double getCurrentPrice() {
		return currentPrice;
	}
	
	
	public double getChangePercent(double prev, double curr) {
		return ((curr - prev)/prev) * 100;
	}
	
}
