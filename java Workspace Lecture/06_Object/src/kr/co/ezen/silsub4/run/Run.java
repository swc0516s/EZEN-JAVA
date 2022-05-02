package kr.co.ezen.silsub4.run;

import kr.co.ezen.silsub4.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Student stu = new Student(); // 생성자 호출
//		System.out.println(stu.information());
		String str = stu.information();
		System.out.println(str);

	}

}
