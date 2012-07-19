package jp.sample.main;

import jp.sample.LapWatch;
import jp.sample.StopWatch;

public class Rei22_01 {

	public static void main(String[] args) {

		StopWatch watch = new StopWatch();	//StopWatchインスタンス作成
		StopWatch lap = new LapWatch();		//LapWatchインスタンス作成

		watch.start();			//StopWatch計測開始		
		lap.start();			//LapWatch計測開始
		for (int i = 0; i < 4; i++){
			for(long j=0; j < 3000000000L; j++);
			watch.stop();		//StopWatch計測
			lap.stop();			//LapWatch計測
		}
		lap.start();
		lap.stop();
		((LapWatch) lap).reset();
	}

}
