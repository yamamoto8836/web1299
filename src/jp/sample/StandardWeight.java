package jp.sample;

public abstract class StandardWeight {
	private double height;

	public StandardWeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public abstract double calStandardWeight();

	public double difference(double weight) {
		return weight - calStandardWeight();
	}
}
