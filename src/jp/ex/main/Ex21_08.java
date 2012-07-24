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

		System.out.println("�|�b�g�̖��O����͂��Ă���������");
		name = reader.readLine();
		System.out.println("�e�ʂ���͂��Ă���������");
		quantity = Integer.parseInt(reader.readLine());
		Ex21_08_Pot pot = new Ex21_08_Pot(name, quantity);

		while (true) {
			System.out.println("������I��ł�������(1:������ 2:�o�� 3:���ʕ\�� 9:�I��)��");
			no = Integer.parseInt(reader.readLine());
			if (no == 9)
				break;

			switch (no) {
			case 1:
			case 2:
				System.out.println("�ʂ���͂��Ă���������");
				quantity = Integer.parseInt(reader.readLine());
				switch (no) {
				case 1:
					System.out.println(pot.push(quantity) + "�����܂���");
					break;
				case 2:
					System.out.println(pot.pop(quantity) + "�o���܂���");
					break;
				}
				break;
			case 3:
				System.out.println(pot.getName() + "�̎c��" + pot.getQuantity()	+ "�ł�");
				break;
			}

		}

	}
}
