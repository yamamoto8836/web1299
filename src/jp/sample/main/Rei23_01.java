package jp.sample.main;

import jp.sample.Bmi;
import jp.sample.StandardWeight;

public class Rei23_01 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double height = 140.0, weight = 36.62;
		StandardWeight nobita = new Bmi(height);
		
		System.out.println("のび太の標準体重は、"+ nobita.calStandardWeight()+ "です");
		System.out.println("標準体重との差は、" + nobita.difference(weight)+"です");
	}
}
