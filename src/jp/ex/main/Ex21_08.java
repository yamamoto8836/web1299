package jp.ex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.ex.Ex21_08_Pot;

public class Ex21_08 {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int quantity, no;
		String name;

		System.out.println("ポットの名前を入力してください＞");
		name = reader.readLine();
		System.out.println("容量を入力してください＞");
		quantity = Integer.parseInt(reader.readLine());
		Ex21_08_Pot pot = new Ex21_08_Pot(name, quantity);

		while (true) {
			System.out.println("処理を選んでください(1:加える 2:出す 3:水量表示 9:終了)＞");
			no = Integer.parseInt(reader.readLine());
			if (no == 9)
				break;

			switch (no) {
			case 1:
			case 2:
				System.out.println("量を入力してください＞");
				quantity = Integer.parseInt(reader.readLine());
				switch (no) {
				case 1:
					System.out.println(pot.push(quantity) + "加えました");
					break;
				case 2:
					System.out.println(pot.pop(quantity) + "出しました");
					break;
				}
				break;
			case 3:
				System.out.println(pot.getName() + "の残は" + pot.getQuantity()	+ "です");
				break;
			}

		}

	}
}
