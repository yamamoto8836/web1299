package jp.sample;

public class StopWatch {
	private long startTime;
	private String name;
		
	public StopWatch(String name) {
		this.name = name;
		startTime = -1;
	}

	protected String getName(){
		return name;
	}

	protected long getStartTime() {
		return startTime;
	}

	// 計測開始
	public void start() {
		if (startTime == -1)
			startTime = System.currentTimeMillis();
	}

	// 計測
	public void stop() {
		long time = System.currentTimeMillis();

		if (startTime == -1) {
			System.out.println("開始されていません");
			return;
		}
		// 開始からのタイムを表示
		System.out.println((time - startTime) / 1000. + "秒");
		reset();
	}

	// リセット
	protected void reset() {
		startTime = -1;
	}
}
