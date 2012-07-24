package jp.ex;

public class Ex22_01_Keitai extends Ex22_01_Telephone {
	private String email = null;

	public Ex22_01_Keitai(String name, String telno, String email) {
		super(name, telno);
		this.email = email;
	}

	@Override
	public String toString() {
		return super.toString() + "  ƒƒ‹ƒAƒhF" + email;
	}
}
