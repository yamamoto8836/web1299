package jp.ex;

public class Ex23_02_Dog extends Ex23_02_Pet {

	public Ex23_02_Dog(String name) {
		super("��", name);
	}

	@Override
	public void petCry() {
		System.out.println(getAnimal() + "��" + getName() + "�́u���������v���܂�");
	}
}
