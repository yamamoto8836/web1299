package jp.ex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.ex.Rei25_Kamoku;

public class Ex25_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String kamokuName = null;
		Rei25_Kamoku start = null, now = null;
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			try{
				System.out.println("â»ñ⁄ñºÇì¸óÕÇµÇƒÇ≠ÇæÇ≥Ç¢ÅÑ");
				kamokuName = reader.readLine();
				if (kamokuName.length()==0)
					break;
			}catch(IOException e){
				System.out.println("ÉGÉâÅ[î≠ê∂ÅF" + e);
				System.exit(1);
			}
			
			if (start == null){
				start = new Rei25_Kamoku(kamokuName);
				now = start;
				continue;
			}
			now.next = new Rei25_Kamoku(kamokuName);
			now = now.next;
		}
		
		now = start;
		while(now != null){
			System.out.println(now.kamokuName);
			now = now.next;			
		}
	}
}
