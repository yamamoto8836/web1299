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

		System.out.print("�Ȗڂ���͂��Ă���������");
		kamoku = reader.readLine();
		System.out.print("�o�Ȕԍ�����͂��Ă���������");
		no = Integer.parseInt(reader.readLine());
		System.out.print("���O����͂��Ă���������");
		name = reader.readLine();

		Ex21_03_Student seito = new Ex21_03_Student(kamoku, no, name);
		toString(seito);
	}
	
	static void toString(Ex21_03_Student seito){
		System.out.println("�ȖځF" + seito.getKamoku() + "�@�o�Ȕԍ��F" + seito.getNo()
														+ "�@���O�F" + seito.getName());
	}
}
