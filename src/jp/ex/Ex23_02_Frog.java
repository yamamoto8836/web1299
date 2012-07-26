package jp.ex;

public class Ex23_02_Frog extends Ex23_02_Pet {

	public Ex23_02_Frog(String name) {
		super("カエル", name);
	}

	@Override
	public void petCry() {
		System.out.println(getAnimal() + "の" + getName() + "は「ゲロゲーロゲロゲーロ」鳴きます");
	}
}
