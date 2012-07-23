package jp.ex;

public class Ex22_01_Telephone {
	private String telno = null, name;

	public Ex22_01_Telephone(String name, String telno) {
		this.name = name;
		this.telno = telno;
	}

	public Ex22_01_Telephone(String name) {
		this.name = name;
	}

	public String getTelno() {
		return telno;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		if (telno == null)
			return "名前：" + name + "  電話番号：なし";
		else
			return "名前：" + name + "  電話番号：" + telno;
	}
}
