package kr.co.ezen.silsub3.run;

import kr.co.ezen.silsub3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle cir = new Circle();

		Circle.setRadius(3);

		System.out.println("���� ���� : " + Circle.getRadius() * Circle.getRadius() * Circle.PI); // ������ x ������ x ������
		System.out.println("���� �ѷ� : " + Circle.getRadius() * 2 * Circle.PI); // ������x2 x ������

		cir.incrementRadius();
		System.out.println("���� ���� : " + Circle.getRadius() * Circle.getRadius() * Circle.PI);
		System.out.println("���� �ѷ� : " + Circle.getRadius() * 2 * Circle.PI);
	}

}
