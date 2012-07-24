package jp.ex;

public class Ex21_06_Shohin {
	private int hinban, tanka;
	private String hinmei;

	public Ex21_06_Shohin(int hinban, int tanka, String hinmei) {
		this.hinban = hinban;
		this.tanka = tanka;
		this.hinmei = hinmei;
	}

	public int getHinban() {
		return hinban;
	}

	public int getTanka() {
		return tanka;
	}

	public String getHinmai() {
		return hinmei;
	}
}
