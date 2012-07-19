package jp.sample.main;

import jp.sample.Employee;

public class Rei21_02 {

	public static void main(String[] args) {
		Employee tokugawa = new Employee("徳川家康", 55);
		Employee oda = new Employee("織田信長", 28);
		
		System.out.println(tokugawa.getName() + "さんは、定年まで" + tokugawa.getLimit() + "年です");
		System.out.println(oda.getName() + "さんは、定年まで" + oda.getLimit() + "年です");
	}

}
