package jp.ex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.ex.Ex23_01_Broka;
import jp.sample.Bmi;
import jp.sample.StandardWeight;

public class Ex23_01 {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] system = { "ブローカ", "BMI" };

		while (true) {
			System.out.println("身長を入力してください＞");
			double height = Double.parseDouble(reader.readLine());
			if (height == 0)
				break;

			StandardWeight[] standardWeight = { new Ex23_01_Broka(height),
					new Bmi(height) };
			for (int i = 0; i < standardWeight.length; i++) {
				System.out.println(system[i] + "："
						+ standardWeight[i].calStandardWeight());
			}
		}
	}
}
