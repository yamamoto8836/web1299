package jp.sample.main;

import jp.sample.DateAmerican;
import jp.sample.DateEuropean;
import jp.sample.DateJapanese;
import jp.sample.SplitDate;

public class Rei23_02 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SplitDate[] dateToString = { new DateAmerican(), new DateEuropean(),
				new DateJapanese() };
		String[] country = { "アメリカ", "ヨーロッパ", "日本" };
		long date = 20120712;

		for (int i = 0; i < dateToString.length; i++) {
			System.out.println(dateToString[i].change(date) + "   "
					+ country[i]);
		}
	}

}
