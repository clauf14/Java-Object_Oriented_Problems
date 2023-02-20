package student_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
	public static ArrayList<Student> readStudents(String students) {
		File f = new File(students);
		ArrayList<Student> list = new ArrayList<Student>();
		try {
			Scanner sc = new Scanner(f);
			int nrS = sc.nextInt();
			for (int i = 0; i < nrS; i++) {
				Student st = new Student(sc.next(), sc.next(), sc.next(), sc.next());
				int nrN = sc.nextInt();
				ArrayList<Grade> grade = new ArrayList<Grade>();
				for (int j = 0; j < nrN; j++) {
					Grade n = new Grade(sc.nextInt(), sc.next(), sc.next());
					grade.add(n);
				}
				st.setlistGrade(grade);
				list.add(st);
			}
		} catch (FileNotFoundException ex) {
			System.out.println("Fisier inexistent");
		}
		return list;
	}

	public static int areNota(String name, String surname, String subject, ArrayList<Student> list) {
		boolean found = false;
		for (Student st : list) {
			if (st.getName().equals(name) && st.getSurname().equals(surname)) {
				Grade sc = null;
				for (Grade g : st.getlistGrade())
					if (sc.getSubject().equals(subject))
						return sc.getGrade();
				found = true;
			}
		}
		if (!found)
			System.out.println("The student we are looking for does not exist");
		return -1;
	}

	public static void main(String[] args) {
		Student s1 = new Student("Negrea", "Paula", "503354325", "0757483012");
		Student s2 = new Student("Furtea", "Claudiu", "501054359345", "0727215520");
		System.out.println(s1);
		System.out.println(s2);
		if (s1.hasVodafone())
			System.out.println(s1.getSurname() + " has Vodafone");
		else
			System.out.println(s1.getSurname() + " has Orange");
		if (s2.isBornOnChristmas())
			System.out.println(s1.getSurname() + " is born on Christmas");
		else
			System.out.println(s1.getSurname() + " isn't born on Christmas");
		
		ArrayList<Student> students = readStudents("students");
		for (Student st : students) {
			System.out.println(st);
			System.out.println("Arithmetic mean is "+st.arithmeticMean());
			System.out.println("Subject and grade in which you have resit "+st.checkResit());
			System.out.println(" ");
		}
	}

}
