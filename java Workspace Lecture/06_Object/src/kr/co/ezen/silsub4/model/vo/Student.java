package kr.co.ezen.silsub4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;

	// ���� �ʵ�.
	{
		classroom = 2;
		name = "ȫ�浿";
		height = 178.2;
		gender = 'F';
	} // static�� ������ �������� �� �ʱ�ȭ ����
		// ��ü�� ������ �Ǹ鼭 ���ÿ� �ʱ�ȭ

	static {
		grade = 3;
	}

	public Student() {

	} // �⺻�����ڴ� ��ü�� �����ɶ� �ڵ����� ������ �ȴ�.
		// �ٸ� �����ڰ� ������ �ȸ����.

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
