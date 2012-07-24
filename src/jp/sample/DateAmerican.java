package jp.sample;

public class DateAmerican implements SplitDate {
	@Override
	public String change(long date) {
		return date / 100 % 100 + splitCharacter + date % 100 + splitCharacter + date / 10000;
	}
}
