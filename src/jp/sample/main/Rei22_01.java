package jp.sample.main;

import jp.sample.LapWatch;
import jp.sample.StopWatch;

public class Rei22_01 {

	public static void main(String[] args) {

		StopWatch watch = new StopWatch("stop1");	//StopWatch�C���X�^���X�쐬
		StopWatch lap = new LapWatch("lap1");		//LapWatch�C���X�^���X�쐬

		watch.start();						//StopWatch�v���J�n
		lap.start();						//LapWatch�v���J�n
		for (int i = 0; i < 4; i++){
			if (i != 0)
				((LapWatch) lap).lap();		//Lap�v��
			for(long j=0; j < 3000000000L; j++);
		}
		watch.stop();						//StopWatch�v���I��
		lap.stop();							//LapWatch�v���I��
	}

}
