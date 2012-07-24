package jp.sample;

public class DateJapanese implements SplitDate {
	@Override
	public String change(long date) {
		return date / 10000 + splitCharacter + date / 100 % 100 + splitCharacter + date % 100;
	}
}
