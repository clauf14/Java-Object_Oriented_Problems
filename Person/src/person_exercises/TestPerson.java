package person_exercises;

import java.util.ArrayList;

public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person();// create object of type Person
		p1.initializePerson();
		p1.setFirstName = ("Someone");
		System.out.println(p1.getFirstName());
		Person p2 = new Person("Popescu", "Ion", 30);
		System.out.println(p2.getFirstName() + " " + p2.getLastName() + " " + p2.getAge());
		Person p3 = new Person("Negrea");
		p3.setLastName("Paula");
		p3.setAge(19);
		System.out.println(p3);
		Double a = 7.69;
		System.out.println(a);
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		for (int i = 0; i < persons.size(); i++)
			System.out.println(persons.get(i));
		System.out.println(sort(persons));
		Person p4 = new Person(p3);// with the copy constructor
		System.out.println(p4);
		p3.setAge(50);
		System.out.println(p3 + " " + p4);
		if (p3 == p4)
			System.out.println("p3 si p4 are equal");
		else
			System.out.println("p3 si p4 are not equal");
		Person p5 = p3;
		if (p5 == p3)
			System.out.println("p5 si p3 are equal");
		else
			System.out.println("p5 si p3 not equal");
		System.out.println(p5);
		p3.setFirstName("Test");
		System.out.println(p5.getFirstName());

	}

	public static ArrayList<Person> sort(ArrayList<Person> pers) {
		for (int i = 0; i < pers.size() - 1; i++)
			for (int j = i + 1; j < pers.size(); j++)
				if (pers.get(j - 1).getAge() > pers.get(j).getAge()) {
					Person aux = pers.get(j - 1);
					pers.set(j - 1, pers.get(j));
					pers.set(j, aux);
				}
		return pers;
	}

}
