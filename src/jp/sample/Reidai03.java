package jp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reidai03 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		int ninzu;
		String name, w;
		
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(streamReader);
		
		System.out.print("名前を入力してください＞");
		name=reader.readLine();
		System.out.print("人数を入力してください");
		w=reader.readLine();
		ninzu=Integer.parseInt(w);
		
		System.out.println(name + "さんの入場料は"+ ninzu*1200 + "円です");
	}

}
