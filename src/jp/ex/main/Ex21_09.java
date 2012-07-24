package jp.ex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.ex.Ex21_06_Shohin;
import jp.ex.Ex21_08_Pot;
import jp.ex.Ex21_09_ShohinTable;

public class Ex21_09 {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int hinban, tanka, max, no, idx;
		String hinmei;
		Ex21_09_ShohinTable shohinTable;
		Ex21_06_Shohin shohin;
		String[] errMsg = {"登録済品番です","未登録品番です","商品配列が満杯です"};

		System.out.println("最大商品数を入力してください＞");
		max = Integer.parseInt(reader.readLine());
		if (max > 0)
			shohinTable = new Ex21_09_ShohinTable(max);
		else
			shohinTable = new Ex21_09_ShohinTable();

loop1:	while (true) {
			System.out.println("処理を選んでください(1:登録 2:変更 3:検索 4:削除 6:一覧 9:終了)＞");
			no = Integer.parseInt(reader.readLine());
			if (no == 9)
				break;

			if (no == 6){
				shohinTable.list();
				continue;
			}

			if (!(no==1 || no==2 || no ==3 ||no==4))
				continue;

			System.out.println("品番を入力してください＞");
			hinban = Integer.parseInt(reader.readLine());
			if (hinban == 0)
				continue;

			switch(no){
			case 3:
				shohin = shohinTable.getShohin(hinban);
				if (shohin == null)
					System.out.println(errMsg[1]);
				else
					System.out.println("品名："	+ shohin.getHinmai() + "　単価：" + shohin.getTanka());
				continue loop1;
			case 4:
				idx = shohinTable.remove(hinban);
				if (idx < 0)
					System.out.println(errMsg[1]);
				else
					System.out.println("品番"	+ hinban + "削除しました");
				continue loop1;
			}

			System.out.println("品名を入力してください＞");
			hinmei = reader.readLine();
			System.out.println("単価を入力してください＞");
			tanka = Integer.parseInt(reader.readLine());

			switch (no){
			case 1:
				idx = shohinTable.add(new Ex21_06_Shohin(hinban, tanka, hinmei));
				switch(idx){
				case -2:
					System.out.println(errMsg[0]);
					break;
				case -9:
					System.out.println(errMsg[2]);
					break;
				default:
					System.out.println("品番"+ hinban + "追加しました");
				}
				break;
			case 2:
				idx = shohinTable.modify(new Ex21_06_Shohin(hinban, tanka, hinmei));
				if (idx == -1)
					System.out.println(errMsg[1]);
				else
					System.out.println("品番"+ hinban + "変更しました");

			}
		}
	}
}
