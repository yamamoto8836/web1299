package jp.ex;

public class Ex22_03_RentalVideo extends Ex22_03_Video {
	private int day0, day1, day7;

	public Ex22_03_RentalVideo(String title, int day0, int day1, int day7) {
		super(title);
		this.day0 = day0;
		this.day1 = day1;
		this.day7 = day7;
	}

	public int gerRentalPrice(int days) {
		switch (days) {
		case 0:
			return day0;
		case 1:
			return day1;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			return day7;
		}

		return -1;
	}
}
