package kr.co.ezen.chap01.encapsulation.run;

import kr.co.ezen.chap01.encapsulation.model.vo.Account;

public class Run {

	public static void main(String[] args) {

		Account ac = new Account(); // ��ü ����
		// Account() : ������ ȣ��
		ac.displayBalance();
		ac.deposit(10000000);
		ac.displayBalance();
		
		ac.deposit(15000000);
		ac.displayBalance();
		
		ac.withdraw(100);
		ac.displayBalance();
		
		ac.withdraw(500000);
		ac.displayBalance();
	}

}
