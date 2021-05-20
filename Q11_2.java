/**
 * @author Hansen Li
 *
 * @date Jun 23, 2019
 */
public class Q11_2 {

	public static void main(String[] args) {
		String fakeAddress = "1234 Ravenwood Drive, Aurora, Washington";
		String fakeNumber = "(555) 555 - 1234";
		String fakeEmail = "unreachable@notreal.net";
		String fakeHours = "8:00am - 5:00pm";
		String fakeRank = "Magister";
		String fakeTitle = "Brigadier General";
		
		System.out.println("Person Test");
		Person testPerson = new Person("Orson Cavell", fakeAddress, fakeNumber, fakeEmail);
		System.out.println(testPerson.toString());
		
		
		System.out.println("Student Test");
		Student testStudent = new Student("Katarina DuClaire", fakeAddress, fakeNumber, fakeEmail, 2);
		System.out.println(testStudent.toString());
		
		System.out.println("Employee Test");
		Employee testEmployee = new Employee("Arcelia de Voir", fakeAddress, fakeNumber, fakeEmail, "Blackgate Department of Affairs", 15000.00);
		System.out.println(testEmployee.toString());
		
		System.out.println("Faculty Test:");
		Faculty testFaculty = new Faculty("Adelaide Morgan", fakeAddress, fakeNumber, fakeEmail, "Blackgate Department of Affairs", 50000.00, fakeHours, fakeRank);
		System.out.println(testFaculty.toString());
		
		System.out.println("Staff Test:");
		Staff testStaff = new Staff("Bookman Nels", fakeAddress, fakeNumber, fakeEmail, "Blackgate Department of Affairs", 27000.00, fakeTitle);
		System.out.println(testStaff.toString());
		
	}
	
}
