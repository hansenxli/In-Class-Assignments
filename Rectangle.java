/**
 * @author Hansen Li
 *
 * @date Jun 18, 2019
 */
public class Rectangle {

	// width and height variables defaulted to 1
	private double width = 1;
	private double height = 1;
	
	// default constructor
	public Rectangle() {		
	}
	
	// constructor calls functions to initialize them to new values
	public Rectangle(double w, double h) {
		setWidth(w);
		setHeight(h);
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	
	public double getArea(double w, double h) {
		return w * h;
	}
	
	public double getPerimeter(double w, double h) {
		return 2 * w + 2 * h;
	}
	
}
