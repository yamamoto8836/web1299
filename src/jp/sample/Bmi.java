package jp.sample;

public class Bmi extends StandardWeight {

	public Bmi(double height) {
		super(height);
	}

	@Override
	public double calStandardWeight() {
		return 22 * getHeight() * getHeight() / 10000;
	}

}
