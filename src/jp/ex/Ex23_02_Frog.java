package jp.ex;

public class Ex23_02_Frog extends Ex23_02_Pet {

	public Ex23_02_Frog(String name) {
		super("�J�G��", name);
	}

	@Override
	public void petCry() {
		System.out.println(getAnimal() + "��" + getName() + "�́u�Q���Q�[���Q���Q�[���v���܂�");
	}
}
