package jp.ex;

public abstract class Ex23_02_Pet {
	private String animal, name;

	public Ex23_02_Pet(String animal, String name) {
		this.animal = animal;
		this.name = name;
	}

	public String getAnimal() {
		return animal;
	}

	public String getName() {
		return name;
	}

	public abstract void petCry();
}
