package jp.ex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.ex.Ex21_06_Shohin;
import jp.ex.Ex21_08_Pot;
import jp.ex.Ex21_09_ShohinTable;

public class Ex21_09 {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int hinban, tanka, max, no, idx;
		String hinmei;
		Ex21_09_ShohinTable shohinTable;
		Ex21_06_Shohin shohin;
		String[] errMsg = {"�o�^�ϕi�Ԃł�","���o�^�i�Ԃł�","���i�z�񂪖��t�ł�"};

		System.out.println("�ő古�i������͂��Ă���������");
		max = Integer.parseInt(reader.readLine());
		if (max > 0)
			shohinTable = new Ex21_09_ShohinTable(max);
		else
			shohinTable = new Ex21_09_ShohinTable();

loop1:	while (true) {
			System.out.println("������I��ł�������(1:�o�^ 2:�ύX 3:���� 4:�폜 6:�ꗗ 9:�I��)��");
			no = Integer.parseInt(reader.readLine());
			if (no == 9)
				break;

			if (no == 6){
				shohinTable.list();
				continue;
			}

			if (!(no==1 || no==2 || no ==3 ||no==4))
				continue;

			System.out.println("�i�Ԃ���͂��Ă���������");
			hinban = Integer.parseInt(reader.readLine());
			if (hinban == 0)
				continue;

			switch(no){
			case 3:
				shohin = shohinTable.getShohin(hinban);
				if (shohin == null)
					System.out.println(errMsg[1]);
				else
					System.out.println("�i���F"	+ shohin.getHinmai() + "�@�P���F" + shohin.getTanka());
				continue loop1;
			case 4:
				idx = shohinTable.remove(hinban);
				if (idx < 0)
					System.out.println(errMsg[1]);
				else
					System.out.println("�i��"	+ hinban + "�폜���܂���");
				continue loop1;
			}

			System.out.println("�i������͂��Ă���������");
			hinmei = reader.readLine();
			System.out.println("�P������͂��Ă���������");
			tanka = Integer.parseInt(reader.readLine());

			switch (no){
			case 1:
				idx = shohinTable.add(new Ex21_06_Shohin(hinban, tanka, hinmei));
				switch(idx){
				case -2:
					System.out.println(errMsg[0]);
					break;
				case -9:
					System.out.println(errMsg[2]);
					break;
				default:
					System.out.println("�i��"+ hinban + "�ǉ����܂���");
				}
				break;
			case 2:
				idx = shohinTable.modify(new Ex21_06_Shohin(hinban, tanka, hinmei));
				if (idx == -1)
					System.out.println(errMsg[1]);
				else
					System.out.println("�i��"+ hinban + "�ύX���܂���");

			}
		}
	}
}
