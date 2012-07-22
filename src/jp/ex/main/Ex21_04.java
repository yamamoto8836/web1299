package jp.ex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.ex.Ex21_03_Student;

public class Ex21_04 {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String kamoku, name;
		int no;

		System.out.print("科目を入力してください＞");
		kamoku = reader.readLine();
		System.out.print("出席番号を入力してください＞");
		no = Integer.parseInt(reader.readLine());
		System.out.print("名前を入力してください＞");
		name = reader.readLine();

		Ex21_03_Student seito = new Ex21_03_Student(kamoku, no, name);
		toString(seito);
	}
	
	static void toString(Ex21_03_Student seito){
		System.out.println("科目：" + seito.getKamoku() + "　出席番号：" + seito.getNo()
														+ "　名前：" + seito.getName());
	}
}
