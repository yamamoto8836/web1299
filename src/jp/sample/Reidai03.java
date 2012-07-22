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
		
		System.out.print("–¼‘O‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		name=reader.readLine();
		System.out.print("l”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		w=reader.readLine();
		ninzu=Integer.parseInt(w);
		
		System.out.println(name + "‚³‚ñ‚Ì“üê—¿‚Í"+ ninzu*1200 + "‰~‚Å‚·");
	}

}
