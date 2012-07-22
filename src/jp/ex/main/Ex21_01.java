package jp.ex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.ex.Ex21_01_Shohin;

public class Ex21_01 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String hinmei;
		int	tanka;
		
		System.out.println("商品名を入力してください＞");
		hinmei = reader.readLine();
		System.out.println("単価を入力してください＞");
		tanka = Integer.parseInt(reader.readLine());
		
		Ex21_01_Shohin shohin = new Ex21_01_Shohin();
		shohin.setHinmei(hinmei);
		shohin.setTanka(tanka);
		
		System.out.println(shohin.getHinmei() + "の単価は " + shohin.getTanka() +" 円です");
	}

}
