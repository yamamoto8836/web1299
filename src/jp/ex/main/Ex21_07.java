package jp.ex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.ex.Ex21_03_Student;
import jp.ex.Ex21_06_Shohin;
import jp.ex.Ex21_06_ShohinTable;

public class Ex21_07 {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int hinban, su;
		Ex21_06_ShohinTable shohinTable = new Ex21_06_ShohinTable();
		Ex21_06_Shohin shohin;
		
		while(true){
			System.out.println("�i�Ԃ���͂��Ă���������");
			hinban = Integer.parseInt(reader.readLine());
			if (hinban ==0)
				break;
			
			shohin = shohinTable.getShohin(shohinTable.search(hinban));
			if (shohin == null){
				System.out.println("�i�Ԃ�����Ă��܂�");
				continue;
			}
			
			while(true){
				System.out.println(shohin.getHinmai() + "�̐��ʂ���͂��Ă���������");
				su = Integer.parseInt(reader.readLine());
				if (su != 0)
					break;
			}
			System.out.println("���z�F" + shohin.getTanka()* su);
		}

	}
}
