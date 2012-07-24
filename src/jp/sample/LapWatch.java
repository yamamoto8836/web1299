package jp.sample;

public class LapWatch extends StopWatch {

	private long lapTime;

	public LapWatch(String name) {
		super(name);
		lapTime = -1;
	}

	// lap�v��
	public void lap() {
		long time = System.currentTimeMillis();

		if (getStartTime() == -1) {
			System.out.println("�J�n����Ă��܂���");
			return;
		}

		if (lapTime == -1)
			lapTime = getStartTime();
		// �O�̃��b�v����̃^�C���ƊJ�n����̃^�C����\��
		System.out.print("lap  :" + (time - lapTime) / 1000. + "�b  ");
		System.out.println("total:" + (time - getStartTime()) / 1000. + "�b");
		// ���݂̎��Ԃ�ۑ�
		lapTime = time;
	}

	// �v���@�X�[�p�[�N���X�̃I�[�o�[���C�h
	@Override
	public void stop() {
		lap();
		reset();
	}

	// ���Z�b�g�@�X�[�p�[�N���X�̃I�[�o�[���C�h
	@Override
	public void reset() {
		super.reset();
		lapTime = -1;
	}

}
