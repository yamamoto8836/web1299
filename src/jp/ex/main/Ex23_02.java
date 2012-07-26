package jp.ex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.ex.Ex23_02_Cat;
import jp.ex.Ex23_02_Dog;
import jp.ex.Ex23_02_Frog;
import jp.ex.Ex23_02_Pet;

public class Ex23_02 {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name;
		Ex23_02_Pet[] pet = new Ex23_02_Pet[3];

		System.out.println("犬の名前を入力してください＞");
		name = reader.readLine();
		pet[0] = new Ex23_02_Dog(name);
		
		System.out.println("猫の名前を入力してください＞");
		name = reader.readLine();
		pet[1] = new Ex23_02_Cat(name);
		
		System.out.println("カエルの名前を入力してください＞");
		name = reader.readLine();
		pet[2] = new Ex23_02_Frog(name);
	
		for (int i = 0; i < pet.length; i++) {
			pet[i].petCry();
		}
	}
}
