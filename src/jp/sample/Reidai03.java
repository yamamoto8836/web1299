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
		
		System.out.print("���O����͂��Ă���������");
		name=reader.readLine();
		System.out.print("�l������͂��Ă�������");
		w=reader.readLine();
		ninzu=Integer.parseInt(w);
		
		System.out.println(name + "����̓��ꗿ��"+ ninzu*1200 + "�~�ł�");
	}

}
