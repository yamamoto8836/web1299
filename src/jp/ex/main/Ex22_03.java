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
				new Ex22_03_RentalVideo("太陽にほえろ", 100, 300, 500),
				new Ex22_03_RentalVideo("燃える闘魂", 100, 200, 300),
				new Ex22_03_RentalVideo("ごっつええ感じ", 50, 100, 200) };

		while (true) {
			System.out.println("貸出タイトルを入力してください＞");
			String title = reader.readLine();
			if (title.length() == 0)
				break;
			for (i = 0; i < rentalVideo.length
					&& !rentalVideo[i].getTitle().equals(title); i++)
				;
			if (i >= rentalVideo.length) {
				System.out.println("タイトルが見つかりません");
				continue;
			}

			System.out.println("泊数を入力してください＞");
			int days = Integer.parseInt(reader.readLine());
			int price = rentalVideo[i].gerRentalPrice(days);
			if (price < 0)
				System.out.println("貸出できません");
			else
				System.out.println(price + "円です");
		}
	}
}
