package jp.sample.main;

import jp.sample.Hito;

public class Rei21_01 {

	public static void main(String[] args) {
		Hito hanako = new Hito();
		hanako.setNamae("花子");
		hanako.setSeibetu(1);
		
		Hito taro = new Hito();
		taro.setNamae("太郎");
		taro.setSeibetu(0);
		
		System.out.println("名前は" + hanako.getNamae() + "、性別は" + hanako.getSeibetu());
		System.out.println("名前は" + taro.getNamae() + "、性別は" + taro.getSeibetu());		
	}

}



