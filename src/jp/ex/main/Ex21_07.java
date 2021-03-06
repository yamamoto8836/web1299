package jp.ex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.ex.Ex21_06_Shohin;
import jp.ex.Ex21_06_ShohinTable;

public class Ex21_07 {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int hinban, su;
		Ex21_06_ShohinTable shohinTable = new Ex21_06_ShohinTable();
		Ex21_06_Shohin shohin;

		while (true) {
			System.out.println("品番を入力してください＞");
			hinban = Integer.parseInt(reader.readLine());
			if (hinban == 0)
				break;

			shohin = shohinTable.getShohin(shohinTable.search(hinban));
			if (shohin == null) {
				System.out.println("品番が誤っています");
				continue;
			}

			while (true) {
				System.out.println(shohin.getHinmai() + "の数量を入力してください＞");
				su = Integer.parseInt(reader.readLine());
				if (su != 0)
					break;
			}
			System.out.println("金額：" + shohin.getTanka() * su);
		}

	}
}
