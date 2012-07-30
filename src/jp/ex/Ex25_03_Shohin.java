package jp.ex;

public class Ex25_03_Shohin {
	private int hinban;
	private String hinmei;
	private Ex25_03_Shohin next;

	public Ex25_03_Shohin(int hinban, String hinmei, Ex25_03_Shohin next) {
		this.hinban = hinban;
		this.hinmei = hinmei;
		this.next = next;
	}

	public Ex25_03_Shohin(int hinban, String hinmei) {
		this.hinban = hinban;
		this.hinmei = hinmei;
	}

	public void setNext(Ex25_03_Shohin next) {
		this.next = next;
	}

	public int getHinban() {
		return hinban;
	}

	public String getHinmei() {
		return hinmei;
	}

	public Ex25_03_Shohin getNext() {
		return next;
	}
}
