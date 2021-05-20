/**
 * @author Hansen Li
 *
 * @date Jun 23, 2019
 */
// using Date import as no myDate class was supplied
import java.util.Date;

public class Employee extends Person {
	private String office;
	private double salary;
	private Date dateHired;
	
	// constructor for employee class
	public Employee(String n, String a, String p, String e, String o, double s) {
		super(n, a, p, e);
		setOffice(o);
		setSalary(s);		
		setDate();
	}
	
	// sets office
	public void setOffice(String o) {
		office = o;
	}
	
	// sets salary
	public void setSalary(double s) {
		salary = s;
	}
	
	// sets date
	public void setDate() {
		dateHired = new Date();
	}

	// gets office
	public String getOffice() {
		return office;
	}
	
	// gets salary
	public double getSalary() {
		return salary;
	}
	
	// gets date
	public Date getDate() {
		return dateHired;
	}
	
	// returns class info as string
	public String toString() {
		return super.toString() +
				"\nOffice: " + getOffice() +
				"\nSalary: " + getSalary() +
				"\nDate Hired: " + getDate();
	}
}
