package jp.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Ex23_03_PolygonArea {
	private String polygonName;
	private Ex23_03_side[] sides;

	public Ex23_03_PolygonArea(String polygonName, String[] sideNames) {
		this.polygonName = polygonName;
		sides = new Ex23_03_side[sideNames.length];
		for (int i = 0; i < sideNames.length; i++) {
			sides[i].setSideName(sideNames[i]);
		}
	}

	public Ex23_03_side[] getSides() {
		return sides.clone();
	}

	public abstract double findArea();

	public void inputData() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < sides.length; i++) {
			System.out.println(sides[i].getSideName() + "‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
			sides[i].setSide(Double.parseDouble(reader.readLine()));
		}
	}

	public void dspArea() {
		for (Ex23_03_side side : sides) {
			System.out.println(side.getSideName() + ":" + side.getSide() + " ");
		}
		System.out.println("‚Ì" + polygonName + "‚Ì–ÊÏ‚Í" + findArea() + "‚Å‚·");
	}
}