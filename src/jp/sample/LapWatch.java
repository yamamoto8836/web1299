package jp.sample;

public class LapWatch extends StopWatch {

	private long lapTime;

	public LapWatch(String name) {
		super(name);
		lapTime = -1;
	}

	// lap計測
	public void lap() {
		long time = System.currentTimeMillis();

		if (getStartTime() == -1) {
			System.out.println("開始されていません");
			return;
		}

		if (lapTime == -1)
			lapTime = getStartTime();
		// 前のラップからのタイムと開始からのタイムを表示
		System.out.print("lap  :" + (time - lapTime) / 1000. + "秒  ");
		System.out.println("total:" + (time - getStartTime()) / 1000. + "秒");
		// 現在の時間を保存
		lapTime = time;
	}

	// 計測　スーパークラスのオーバーライド
	@Override
	public void stop() {
		lap();
		reset();
	}

	// リセット　スーパークラスのオーバーライド
	@Override
	public void reset() {
		super.reset();
		lapTime = -1;
	}

}
