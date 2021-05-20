/**
 * @author Hansen Li
 *
 * @date Jun 23, 2019
 */
public class Student extends Person{
	private int classStatus;
	private String status;
	public final int FRESHMAN = 1;
	public final int SOPHOMORE = 2;
	public final int JUNIOR = 3;
	public final int SENIOR = 4;

	// student constructor
	public Student(String n, String a, String p, String e, int s) {
		super(n, a , p, e);
		setStatus(s);
	}
	
	// returns class status
	public String getStatus() {
		return status;
	}
	
	// sets class status
	public void setStatus(int classStatus) {
		switch(classStatus) {
			case 1:
				status = "freshman";
				break;
			case 2:
				status = "sophomore";
				break;
			case 3:
				status = "junior";
				break;
			case 4:
				status = "senior";
				break;
			default:
				status = "Unknown Status";
		}
	}
	
	// converts class info to string output
	public String toString() {
		return super.toString() + 
				"\nStatus: " + getStatus();
	}
	
}
