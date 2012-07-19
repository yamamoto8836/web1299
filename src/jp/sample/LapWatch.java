package jp.sample;

public class LapWatch extends StopWatch {

	private long lapTime = -1;
	
	//計測　スーパークラスのオーバーライド
	public void stop(){
		long time = System.currentTimeMillis();

		if (super.getStartTime() == -1)
			System.out.println("開始されていません");
		//前のラップからのタイムを表示
		if(lapTime != -1){
			System.out.print((time - lapTime) / 1000. +"秒    ");		
		}
		//計測開始からのタイムを表示
		System.out.println((time - super.getStartTime()) / 1000. +"秒");
		//現在の時間を保存
		lapTime = time;
	}
	//リセット　スーパークラスのオーバーライド
	public void reset(){
		super.reset();
		lapTime = -1;
	}

}
