package jp.ex;

public class Ex21_06_ShohinTable {
	private Ex21_06_Shohin[] shohinTable = new Ex21_06_Shohin[5];

	public Ex21_06_ShohinTable() {
		int[] hinban = { 1001, 1002, 2001, 2002, 3001 };
		int[] tanka = { 105, 147, 630, 525, 1365 };
		String[] hinmei = { "消しゴム", "ボールペン", "バインダー", "分度器", "コンパス" };

		for (int i = 0; i < hinban.length; i++) {
			shohinTable[i] = new Ex21_06_Shohin(hinban[i], tanka[i], hinmei[i]);
		}
	}

	public Ex21_06_Shohin getShohin(int idx) {
		if (idx < 0 || idx >= shohinTable.length)
			return null;

		return shohinTable[idx];
	}

	public int search(int hinban) {
		for (int i = 0; i < shohinTable.length; i++) {
			if (shohinTable[i].getHinban() == hinban)
				return i;
		}

		return -1;
	}
}
