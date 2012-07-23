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
			return "���O�F" + name + "  �d�b�ԍ��F�Ȃ�";
		else
			return "���O�F" + name + "  �d�b�ԍ��F" + telno;
	}
}
