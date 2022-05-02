package kr.co.ezen.silsub4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;

	// 전부 필드.
	{
		classroom = 2;
		name = "홍길동";
		height = 178.2;
		gender = 'F';
	} // static을 제외한 나머지를 다 초기화 했음
		// 객체가 생성이 되면서 동시에 초기화

	static {
		grade = 3;
	}

	public Student() {

	} // 기본생성자는 객체가 생성될때 자동으로 생성이 된다.
		// 다른 생성자가 있으면 안만든다.

	public static int getGrade() {
		return grade;
	}

	public static void setGrade(int grade) {
		Student.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String information() {
		return "[" + "grade=" + grade + ",classroom=" + classroom + ",name=" + name + ",height=" + height + ",gender="
				+ gender + "]";

	}

}
