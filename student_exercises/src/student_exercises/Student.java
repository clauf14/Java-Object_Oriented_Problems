package student_exercises;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {
	private String name;
	private String surname;
	private String CNP;
	private String phone;
	private int age;
	private ArrayList<Grade> listGrade;
	
	public Student(String name,String surname,String CNP,String phone) {
		this.name=name;
		this.surname=surname;
		this.CNP=CNP;
		this.phone=phone;
		this.age=ageCalculation();
	}
	
	public int ageCalculation() {
		String an="20"+CNP.substring(1,3);   //"substring" take from a string from position 1 inclusive to position 3 exclusively
		int anInt=Integer.parseInt(an);
		int azi=LocalDate.now().getYear();     // "LocalDate.now()" --> today's date 20.02.2023     "getYear()" --> year 2023
		return azi-anInt;
	}
	
	public boolean hasVodafone() {
		if(phone.startsWith("072", 0) || phone.startsWith("073", 0))
			return true;
		return false;
	}
	
	public boolean isBornOnChristmas() {
		if(CNP.substring(3, 7).equals("1225"))
			return true;
		return false;
	}
	
	public boolean wasHisBirthday() {
		int month=Integer.parseInt(CNP.substring(3, 5));
		int day=Integer.parseInt(CNP.substring(5,7));
		int monthC=LocalDate.now().getMonthValue();
		int dayC=LocalDate.now().getDayOfMonth();
		if(month<monthC)
			return true;
		else if(month==monthC && day<dayC)
			return true;
		return false;
	}
	
	public String toString() {
		return "name="+name+" "+",surname="+surname+" "+",CNP="+CNP+" "+",phone="+phone+" "+",age="+age+" "+",List of Grades="+listGrade;     // display Student 
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCNP() {
		return CNP;
	}

	public void setCNP(String cNP) {
		CNP = cNP;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(){
		listGrade= new ArrayList<Grade>();
	}
	
	public ArrayList<Grade> getlistGrade(){
		return listGrade;
	}
	
	public void setlistGrade(ArrayList<Grade>listGrade) {
		this.listGrade=listGrade;
	}
	
	public double arithmeticMean() {
		double s = 0;
		for(int i=0; i<listGrade.size(); i++) {
			s=s+listGrade.get(i).getGrade();
		}
		return (double)s/listGrade.size();
	}
	
	public ArrayList<Grade> checkResit() {
		ArrayList<Grade> resit=new ArrayList<Grade>();
		for(int i=0; i<listGrade.size(); i++) {
			if(listGrade.get(i).getGrade()<5)
				resit.add(listGrade.get(i));
				
		}
		return resit;
		
	}
}