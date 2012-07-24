package jp.ex;

public class Ex21_09_ShohinTable {
	private Ex21_06_Shohin[] shohinTable;
	private int dataCount = 0;

	public Ex21_09_ShohinTable(int numberOfElements) {
		shohinTable = new Ex21_06_Shohin[numberOfElements];
	}

	public Ex21_09_ShohinTable() {
		shohinTable = new Ex21_06_Shohin[10];
	}

	public int add(Ex21_06_Shohin shohin) {
		if (search(shohin.getHinban()) >= 0) {
			return -2;
		}

		if (dataCount == shohinTable.length) {
			return -9;
		}
		
		shohinTable[dataCount] = shohin;

		return dataCount++;
	}

	public int modify(Ex21_06_Shohin shohin) {
		int idx = search(shohin.getHinban());

		if (idx < 0) {
			return -1;
		}

		shohinTable[idx] = shohin;

		return idx;
	}
	public int remove(int hinban) {
		int idx = search(hinban);

		if (idx < 0) {
			return -1;
		}

		for (int i = idx; i < dataCount - 1; i++) {
			shohinTable[i] = shohinTable[i + 1];
		}

		return dataCount--;
	}

	public Ex21_06_Shohin getShohin(int hinban) {
		int idx = search(hinban);

		if (idx < 0) {
			return null;
		}

		return shohinTable[idx];
	}

	public void list() {
		if (dataCount == 0) {
			System.out.println("¤•i“o˜^‚È‚µ");
			return;
		}

		for (int i = 0; i < dataCount; i++) {
			System.out.println(shohinTable[i].getHinban() + "  "
					+ shohinTable[i].getHinmai() + "  " + shohinTable[i].getTanka());
		}
	}

	public int search(int hinban) {
		for (int i = 0; i < dataCount; i++) {
			if (shohinTable[i].getHinban() == hinban)
				return i;
		}

		return -1;
	}

}
