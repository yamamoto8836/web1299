package jp.sample.main;

import jp.sample.Employee;

public class Rei21_02 {

	public static void main(String[] args) {
		Employee tokugawa = new Employee("����ƍN", 55);
		Employee oda = new Employee("�D�c�M��", 28);

		System.out.println(tokugawa.getName() + "����́A��N�܂�" + tokugawa.getLimit() + "�N�ł�");
		System.out.println(oda.getName() + "����́A��N�܂�" + oda.getLimit() + "�N�ł�");
	}

}
