package kr.co.ezen.silsub1.run;

import kr.co.ezen.silsub1.medel.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member mb = new Member();

		mb.setMemberId("swc0516");
		mb.setMemberPwd("1234567@");
		mb.setMemberName("¼º¿øÃ¶");
		mb.setAge(26);
		mb.setGender('M');
		mb.setPhone("010-9149-7858");
		mb.setEmail("swc0516s@gmail.com");
		
		
		System.out.println("ID : "+mb.getMemberId());
		System.out.println("PASSWORD : "+mb.getMemberPwd());
		System.out.println("NAME : "+mb.getMemberName());
		System.out.println("AGE : "+mb.getAge());
		System.out.println("GENDER : "+mb.getGender());
		System.out.println("PHONE : "+mb.getPhone());
		System.out.println("EMAIL : "+mb.getEmail());

	}

}
