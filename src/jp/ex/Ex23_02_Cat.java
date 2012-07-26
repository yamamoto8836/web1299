package jp.ex;

public class Ex23_02_Cat extends Ex23_02_Pet {

	public Ex23_02_Cat(String name) {
		super("猫", name);
	}

	@Override
	public void petCry() {
		System.out.println(getAnimal() + "の" + getName() + "は「にゃぁにゃぁ」鳴きます");
	}
}
