package jp.ex;

public class Ex23_02_Cat extends Ex23_02_Pet {

	public Ex23_02_Cat(String name) {
		super("�L", name);
	}

	@Override
	public void petCry() {
		System.out.println(getAnimal() + "��" + getName() + "�́u�ɂ႟�ɂ႟�v���܂�");
	}
}
