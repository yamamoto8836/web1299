package jp.ex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.ex.Ex22_03_RentalVideo;

public class Ex22_03 {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int i;
		Ex22_03_RentalVideo[] rentalVideo = {
				new Ex22_03_RentalVideo("���z�ɂق���", 100, 300, 500),
				new Ex22_03_RentalVideo("�R���铬��", 100, 200, 300),
				new Ex22_03_RentalVideo("������������", 50, 100, 200) };

		while (true) {
			System.out.println("�ݏo�^�C�g������͂��Ă���������");
			String title = reader.readLine();
			if (title.length() == 0)
				break;
			for (i = 0; i < rentalVideo.length
					&& !rentalVideo[i].getTitle().equals(title); i++)
				;
			if (i >= rentalVideo.length) {
				System.out.println("�^�C�g����������܂���");
				continue;
			}

			System.out.println("��������͂��Ă���������");
			int days = Integer.parseInt(reader.readLine());
			int price = rentalVideo[i].gerRentalPrice(days);
			if (price < 0)
				System.out.println("�ݏo�ł��܂���");
			else
				System.out.println(price + "�~�ł�");
		}
	}
}
