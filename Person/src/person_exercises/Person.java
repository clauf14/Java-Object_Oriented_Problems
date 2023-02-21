package person_exercises;

public class Person {

	private String firstName;
	private String lastName; // Person class atributes
	private int age;
	public String setFirstName;

	public void initializePerson() {
		firstName = "Furtea";
		lastName = "Claudiu";
		age = 18;
		System.out.println(firstName + " " + lastName + " " + age);
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String ln) {
		lastName = ln;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		age = a;
	}

	public Person(String fn, String ln, int a) {
		firstName = fn;
		lastName = ln;
		age = a;
	}

	public Person() {

	}

	public Person(String firstName) {
		this.firstName = firstName;
	}

	public Person(String firstName, String lastName) {
		this(firstName);// current class builder call
		this.lastName = lastName;

	}

	public String toString() {
		return firstName + " " + lastName + " " + age;
	}

	public Person(Person P) {
		this.firstName = P.firstName;
		this.lastName = P.lastName;
		this.age = P.age;
	}

}
