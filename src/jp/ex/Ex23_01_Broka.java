package jp.ex;

import jp.sample.StandardWeight;

public class Ex23_01_Broka extends StandardWeight {

	public Ex23_01_Broka(double height) {
		super(height);
	}

	@Override
	public double calStandardWeight() {
		return (getHeight() - 100) * 0.9;
	}

}
