package person_exercises;

public class Person2 {

	private String name;
	private static Person2 pers = null;

	private Person2(String name) {
		this.name = name;
	}

	public static Person2 getObject(String name) {
		if (pers == null)
			pers = new Person2(name);
		return pers;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}
}
