package kr.co.ezen.silsub4.run;

import kr.co.ezen.silsub4.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Student stu = new Student(); // ������ ȣ��
//		System.out.println(stu.information());
		String str = stu.information();
		System.out.println(str);

	}

}
