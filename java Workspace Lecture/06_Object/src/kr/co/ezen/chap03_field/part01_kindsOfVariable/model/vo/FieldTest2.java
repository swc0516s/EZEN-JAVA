package kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo;

//class FieldTest2 { // ���� ��Ű�� �������� public�� ��� �⺻���� �ۺ�. �ٸ� ��Ű�������� ������ �� ���� .!!!!
public class FieldTest2 {
	public String pubA = "public";
	String defB = "default"; // default
	private String priC = "private";

	public static String pubSta = "public static";
	private static String priSta = "private static";

	public FieldTest2() {

	}

	// get �������� // getter
	// set �����ϴ� // setter
	// �� ���� ��Ŭ�� - �ҽ� -���׷���Ʈ ���� ����
	public String getPubA() { // ù���ڰ� �빮�ڷ� �ٲ�
		return pubA;
	}

	public void setPubA(String pubA) {
		this.pubA = pubA;
	}

	public String getDefB() {
		return defB;
	}

	public void setDefB(String defB) {
		this.defB = defB;
	}

	public String getPriC() {
		return priC;
	}

	public void setPriC(String priC) {
		this.priC = priC;
	}

	public static String getPubSta() {
		return pubSta;
	}

	public static void setPubSta(String pubSta) {
		FieldTest2.pubSta = pubSta;
	}

	public static String getPriSta() {
		return priSta;
	}

	public static void setPriSta(String priSta) {
		FieldTest2.priSta = priSta;
	}

}
