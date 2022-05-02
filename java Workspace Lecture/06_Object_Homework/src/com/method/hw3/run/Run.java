package com.method.hw3.run;

import com.method.hw3.sample.StaticSample;

public class Run {

	public static void main(String[] args) {
//		StaticSample ss = new StaticSample();
		StaticSample.setValue("Java");

		System.out.println("value:" + StaticSample.getValue());

		StaticSample.toUpper();
		System.out.println("대문자로:"+StaticSample.getValue());
		
		System.out.println("길이:"+StaticSample.valueLength());
		
		System.out.println("PROGRAMMING 붙여서 :"+StaticSample.valueConcat("PROGRAMMING"));
		
		StaticSample.setChar(0,'C');
		System.out.println("J => C:"+StaticSample.getValue());
	}

}
