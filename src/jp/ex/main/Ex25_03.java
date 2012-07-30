package jp.ex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.ex.Ex25_03_Shohin;
import jp.ex.Rei25_Kamoku;

public class Ex25_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String hinmei = null;
		int hinban;
		Ex25_03_Shohin start = null, now = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		while (true) {
			try {
				System.out.println("�i�Ԃ���͂��Ă�������(END:0)��");
				hinban = Integer.parseInt(reader.readLine());
				if (hinban == 0)
					break;
				if (hinban < 0) {
					System.out.println("�i�Ԃ�����Ă��܂�");
					continue;
				}
			} catch (IOException e) {
				System.out.println("�i�Ԃ�����Ă��܂�");
				continue;
			}

			while (true) {
				try {
					System.out.println("�i������͂��Ă���������");
					hinmei = reader.readLine();
					if (hinmei.length() > 0)
						break;
					System.out.println("�i��������Ă��܂�");
				} catch (IOException e) {
					System.out.println("�i��������Ă��܂�");
				}
			}

			if (start == null) {
				start = new Ex25_03_Shohin(hinban, hinmei);
				now = start;
				continue;
			}
			now.setNext(new Ex25_03_Shohin(hinban, hinmei));
			now = now.getNext();
		}

		while (true) {
			try {
				System.out.println("��������i�Ԃ���͂��Ă�������(END:0)��");
				hinban = Integer.parseInt(reader.readLine());
				if (hinban == 0)
					break;
			} catch (IOException e) {
				System.out.println("���̓G���[");
				continue;
			}

			now = start;
			while (now != null && now.getHinban() != hinban) {
				now = now.getNext();
			}
			if (now == null)
				System.out.println("�Y���f�[�^�Ȃ�");
			else
				System.out.println(now.getHinmei());

		}
	}
}
