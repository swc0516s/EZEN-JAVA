package com.inheri.example2;

public class CheckingAccount extends Account {
	String cardNo;

	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		// 부모 기본 생성자 호출 //요 자리에서 눈에 보이지 않지만
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.cardNo = cardNo;
	}

	public int pay(String cardNo, int amount) throws Exception {

		if (!cardNo.equals(this.cardNo) || (balance < amount)) {
			throw new Exception("지불이 불가능합니다.");
		}
		return withdraw(amount);
	}
}
