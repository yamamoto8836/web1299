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

	// �v���J�n
	public void start() {
		if (startTime == -1)
			startTime = System.currentTimeMillis();
	}

	// �v��
	public void stop() {
		long time = System.currentTimeMillis();

		if (startTime == -1) {
			System.out.println("�J�n����Ă��܂���");
			return;
		}
		// �J�n����̃^�C����\��
		System.out.println((time - startTime) / 1000. + "�b");
		reset();
	}

	// ���Z�b�g
	protected void reset() {
		startTime = -1;
	}
}
