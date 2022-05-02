package kr.co.ezen.silsub2.run;

import kr.co.ezen.silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {

		Product pro = new Product();
		pro.setpName("사과");
		pro.setPrice(100000);
		pro.setBrand("신선한");
		System.out.println(pro.information());
	}

}
