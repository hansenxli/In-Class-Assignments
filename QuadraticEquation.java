/**
 * @author Hansen Li
 *
 * @date Jun 20, 2019
 */
public class QuadraticEquation {
	double a, b, c;
	
	public QuadraticEquation(double a, double b, double c) {
		setA(a);
		setB(b);
		setC(c);
	}
	
	public void setA(double value) {
		a = value;
	}
	
	public void setB(double value) {
		b = value;
	}
	
	public void setC(double value) {
		c = value;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getDiscriminant() {
		return Math.pow(getB(), 2) - (4 * getA() * getC());
	}
	
	public double getRoot1() {
		return ((-1 * getB()) - Math.pow(getDiscriminant(), 0.5))/(2 * getA());
	}
	
	public double getRoot2() {
		return ((-1 * getB()) + Math.pow(getDiscriminant(), 0.5))/(2 * getA());

	}
}
