/**
 * @author Hansen Li
 *
 * @date Jun 23, 2019
 */
public class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	
	// default constructor
	public Person() {
		
	}
	
	// constructor
	public Person(String n, String a, String p, String e) {
		setName(n);
		setAddress(a);
		setPhone(p);
		setEmail(e);
	}
	
	// sets name
	public void setName(String n) {
		name = n;
	}
	
	// sets address
	public void setAddress(String a) {
		address = a;
	}
	
	// sets phone number
	public void setPhone(String p) {
		phoneNumber = p;
	}
	
	// sets email address
	public void setEmail(String e) {
		email = e;
	}
	
	// returns name
	public String getName() {
		return name;
	}
	
	// returns address
	public String getAddress() {
		return address;
	}
	
	// returns phone number
	public String getPhone() {
		return phoneNumber;
	}
	
	// returns email address
	public String getEmail() {
		return email;
	}
	
	// returns object information as string
	public String toString() {
		return "Name: " + getName() + 
				"\nAddress: " + getAddress() + 
				"\nPhone Number: " + getPhone() +
				"\nEmail Address: " + getEmail();
	}
}
