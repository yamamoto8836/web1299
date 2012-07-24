package jp.ex;

public class Ex21_08_Pot {
	private String name;
	private int quantity = 0, maxQuantity;

	public Ex21_08_Pot(String name, int maxQuantity) {
		this.name = name;
		this.maxQuantity = maxQuantity;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getMaxQuantity() {
		return maxQuantity;
	}

	// â¡êÖ
	public int push(int quantity) {
		if (maxQuantity - this.quantity < quantity)
			quantity = maxQuantity - this.quantity;

		this.quantity += quantity;

		return quantity;
	}

	// ããìí
	public int pop(int quantity) {
		if (this.quantity < quantity)
			quantity = this.quantity;

		this.quantity -= quantity;

		return quantity;
	}
}
