package jp.ex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.ex.Rei25_Kamoku;

public class Ex25_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String kamokuName = null;
		Rei25_Kamoku start = null, now = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			try {
				System.out.println("‰È–Ú–¼‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
				kamokuName = reader.readLine();
				if (kamokuName.length() == 0)
					break;
			} catch (IOException e) {
				System.out.println("ƒGƒ‰[”­¶F" + e);
				System.exit(1);
			}

			now = start;
			start = new Rei25_Kamoku(kamokuName);
			start.next = now;
		}

		now = start;
		while (now != null) {
			System.out.println(now.kamokuName);
			now = now.next;
		}
	}
}
