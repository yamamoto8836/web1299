package jp.ex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.ex.Ex21_02_Shohin;

public class Ex21_02 {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		int[] hinbanList = { 1001, 2122, 1521 };
		String[] hinmeiList = { "�i�`�����b", "�l�i�a�R�[�q�[", "�S�[�t��" };
		int[] tankaList = { 250, 870, 2300 };

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int i, hinban, su;

		Ex21_02_Shohin[] shohin = new Ex21_02_Shohin[3];

		for (i = 0; i < hinbanList.length; i++) {
			shohin[i] = new Ex21_02_Shohin();
			shohin[i].setHinban(hinbanList[i]);
			shohin[i].setHinmei(hinmeiList[i]);
			shohin[i].setTanka(tankaList[i]);
		}

		System.out.println("�w�����鏤�i�ԍ�����͂��Ă���������");
		hinban = Integer.parseInt(reader.readLine());
		System.out.println("���ʂ���͂��Ă���������");
		su = Integer.parseInt(reader.readLine());

		for (i = 0; i < shohin.length && hinban != shohin[i].getHinban(); i++)
			;
		if (i < shohin.length)
			System.out.println(shohin[i].getHinmei() + su + "��"
										+ su * shohin[i].getTanka() + "�~�ł�");
		else
			System.out.println("�Y�����i������܂���");
	}
}
