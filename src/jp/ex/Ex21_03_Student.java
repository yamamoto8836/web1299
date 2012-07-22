package jp.ex;

public class Ex21_03_Student {
	private String kamoku;
	private int no;
	private String name;
	
	public Ex21_03_Student(String kamoku, int no, String name) {
		this.kamoku = kamoku;
		this.no = no;
		this.name = name;
	}

	public String getKamoku() {
		return kamoku;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}
	
	public String toString(){
		return "科目：" + kamoku + "　出席番号：" + no+ "　名前：" + name;
	}
}
