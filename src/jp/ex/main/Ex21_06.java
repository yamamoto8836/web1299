package jp.ex.main;

import jp.ex.Ex21_06_Shohin;
import jp.ex.Ex21_06_ShohinTable;

public class Ex21_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ex21_06_ShohinTable shohinTable = new Ex21_06_ShohinTable();
		Ex21_06_Shohin shohin;

		for (int i = 0; ((shohin = shohinTable.getShohin(i)) != null); i++) {
			System.out.println("�i�ԁF" + shohin.getHinban() + "�@�i���F"
					+ shohin.getHinmai() + "�@�P���F" + shohin.getTanka());
		}
	}

}
