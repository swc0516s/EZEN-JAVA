package kr.co.ezen.silsub2.run;

import kr.co.ezen.silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {

		Product pro = new Product();
		pro.setpName("���");
		pro.setPrice(100000);
		pro.setBrand("�ż���");
		System.out.println(pro.information());
	}

}
