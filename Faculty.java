/**
 * @author Hansen Li
 *
 * @date Jun 23, 2019
 */
public class Faculty extends Employee{
	private String officeHours;
	private String rank;
	
	// constructor for faculty class
	public Faculty(String n, String a, String p, String e, String o, double s, String hours, String r) {
		super(n, a, p, e, o, s);
		setOfficeHours(hours);
		setRank(r);
	}

	// sets office hours
	public void setOfficeHours(String hours) {
		officeHours = hours;
	}
	
	// sets rank
	public void setRank(String r) {
		rank = r;
	}
	
	// gets office hours
	public String getOfficeHours() {
		return officeHours;
	}
	
	// gets rank
	public String getRank() {
		return rank;
	}
	
	// returns class info as string
	public String toString() {
		return super.toString() +
				"\nOffice Hours: " + getOfficeHours() +
				"\nRank: " + getRank();
	}
}
