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
		
		System.out.println("�̂ё��̕W���̏d�́A"+ nobita.calStandardWeight()+ "�ł�");
		System.out.println("�W���̏d�Ƃ̍��́A" + nobita.difference(weight)+"�ł�");
	}
}
