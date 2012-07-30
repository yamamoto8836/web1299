package jp.ex;

public class Ex23_03_TriangleArea extends Ex23_03_PolygonArea {

	private static final String[] sideNames = {"’ê•Ó","‚‚³"};

	public Ex23_03_TriangleArea() {
		super("OŠpŒ`", sideNames);
	}
	@Override
	public double findArea() {
		Ex23_03_side[] sides = getSides();

		return 	sides[0].getSide() * sides[1].getSide() / 2;
	}
}
