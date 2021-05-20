/**
 * @author Hansen Li
 *
 * @date Jun 23, 2019
 */
public class Staff extends Employee{
	private String title;
	
	// constructor for staff class
	public Staff(String n, String a, String p, String e, String o, Double s, String t) {
		super(n, a, p, e, o, s);
		setTitle(t);
	}
	
	// gets title
	public String getTitle() {
		return title;
	}
	
	// sets title
	public void setTitle(String t) {
		title = t;
	}
	
	// returns class info as string
	public String toString() {
		return super.toString() +
				"\nTitle: " + title;
	}
}
