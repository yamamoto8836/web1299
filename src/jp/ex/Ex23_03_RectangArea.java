package jp.ex;

public class Ex23_03_RectangArea extends Ex23_03_PolygonArea {

	private static final String[] sideNames = {"c","‰¡"};

	public Ex23_03_RectangArea() {
		super("’·•ûŒ`", sideNames);
	}
	@Override
	public double findArea() {
		Ex23_03_side[] sides = getSides();

		return 	sides[0].getSide() * sides[1].getSide();
	}
}
