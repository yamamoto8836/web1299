package jp.sample.main;

import jp.sample.Hito;

public class Rei21_01 {

	public static void main(String[] args) {
		Hito hanako = new Hito();
		hanako.setNamae("�Ԏq");
		hanako.setSeibetu(1);
		
		Hito taro = new Hito();
		taro.setNamae("���Y");
		taro.setSeibetu(0);
		
		System.out.println("���O��" + hanako.getNamae() + "�A���ʂ�" + hanako.getSeibetu());
		System.out.println("���O��" + taro.getNamae() + "�A���ʂ�" + taro.getSeibetu());		
	}

}



