package jp.ex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.ex.Ex21_03_Student;

public class Ex21_05 {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String kamoku, name;
		int no;

		System.out.print("‰È–Ú‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		kamoku = reader.readLine();
		System.out.print("oÈ”Ô†‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		no = Integer.parseInt(reader.readLine());
		System.out.print("–¼‘O‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		name = reader.readLine();

		Ex21_03_Student seito = new Ex21_03_Student(kamoku, no, name);

		System.out.println(seito.toString());
	}
}
