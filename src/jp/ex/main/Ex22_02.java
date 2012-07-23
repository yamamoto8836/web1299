package jp.ex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import jp.ex.Ex22_01_Keitai;
import jp.ex.Ex22_01_Telephone;

public class Ex22_02 {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name, telno, email;
		Ex22_01_Telephone[] telbook = new Ex22_01_Telephone[3];

		for (int i = 0; i < telbook.length; i++) {
			System.out.print("名前を入力してください＞");
			name = reader.readLine();
			System.out.print("電話番号を入力してください＞");
			telno = reader.readLine();
			if (telno.length() > 0) {
				System.out.print("メルアドを入力してください＞");
				email = reader.readLine();
				if (email.length() > 0)
					telbook[i] = new Ex22_01_Keitai(name, telno, email);
				else
					telbook[i] = new Ex22_01_Telephone(name, telno);
			} else
				telbook[i] = new Ex22_01_Telephone(name);
		}

		for (int i = 0; i < telbook.length; i++) {
			System.out.println(telbook[i]);
		}
	}
}
