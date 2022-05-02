package com.inheri.example3;

public class CheckingAccount extends Account {
	String cardNo;

	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		/* 
		// super(); // �θ� ������ ȣ��
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.cardNo = cardNo;
		  */
		
		super(accountNo,ownerName, balance);
			this.cardNo=cardNo;
			
		}
	
	

	public int pay(String cardNo, int amount) throws Exception {

		if (!cardNo.equals(this.cardNo) || (balance < amount)) {
			throw new Exception("������ �Ұ����մϴ�.");
		}
		return withdraw(amount);
	}
}
