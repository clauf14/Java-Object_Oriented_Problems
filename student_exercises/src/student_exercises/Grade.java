package student_exercises;

public class Grade {

	private int grade;
	private String subject;
	private String date;

	public Grade(int grade, String subject, String date) {
		this.grade = grade;
		this.subject = subject;
		this.date = date;
	}

	public int getGrade() { // ---------getter and setter-------------------->
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String materia) {
		this.subject = materia;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	// <-------------------------------------------------------->

	public String toString() {
		return grade + " " + subject + " " + date; // display Grade
	}

}
