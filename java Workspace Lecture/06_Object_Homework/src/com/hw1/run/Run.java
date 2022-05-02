package com.hw1.run;

import com.hw1.model.vo.Product;

public class Run {

	public static void main(String[] args) {

		Product pr = new Product("a", "b", "c", 123, 4.56);
		System.out.println(pr.information());

	}

}
