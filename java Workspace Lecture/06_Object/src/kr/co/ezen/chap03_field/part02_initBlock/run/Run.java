package kr.co.ezen.chap03_field.part02_initBlock.run;

import kr.co.ezen.chap03_field.part02_initBlock.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p = new Product();
		System.out.println(p.information());

		Product p2 = new Product("�Ƹ޸�ī��", 2500, "7�׷�");
		System.out.println(p2.information());
		
		Product p3 = new Product("�־Ƹ޸�ī��", 2000);
		System.out.println(p3.information());
		
		Product p4 = new Product("aaa",12);
		System.out.println(p4.information());
		
		
		// �ʱ�ȭ���� ���� ���� �۵�, 
	}

}
