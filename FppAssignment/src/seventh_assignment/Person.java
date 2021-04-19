package seventh_assignment;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	// --------------------------------------------------------------
	public Person( String first, String last, int a) { // constructor
		firstName = first;
		lastName = last;
		age = a;
	}
	// --------------------------------------------------------------
	public String getLast() // get last name
	{
		return lastName;
	}
	@Override
	public String toString() {
		return "Person [lastName=" + lastName + "\n FirstName=" + firstName +
				"\nAge=" + age + "]";
	}
}
