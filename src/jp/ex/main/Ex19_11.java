package jp.ex.main;

/*
 問題19－11 ヒープ
 Author:yamamoto
 */
import java.io.*;

public class Ex19_11 {
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int i, n; // nは要素数
		long start, end; // 開始時刻、終了時刻
		char yn; // 表示の要・不要

		// ①要素数と表示区分入力
		System.out.print("要素数を入力してください＞");
		n = Integer.parseInt(reader.readLine());
		System.out.print("データを表示しますか(y:する)＞");
		yn = reader.readLine().charAt(0);
		// ②配列作成
		int[] su = new int[n];
		// ③乱数代入
		for (i = 0; i < su.length; i++) {
			su[i] = (int) (Math.random() * n * 10 + 1);
		}
		// ④ソート前配列表示
		if (yn == 'y' || yn == 'Y')
			dspAllay(su);
		// ⑤ソート中表示
		System.out.println("ソート中");
		// ⑥ソート開始時間取得
		start = System.currentTimeMillis();
		// ⑦ソート
		makeheap(su);
		sortheap(su);

		// ⑧ソート終了時間取得
		end = System.currentTimeMillis();
		// ⑨ソート完了表示
		System.out.println("ソート完了");
		// ⑩ソート後配列表示
		if (yn == 'y' || yn == 'Y')
			dspAllay(su);

		// ⑪ソート時間表示
		System.out.println("開始：" + start + "  終了：" + end + " ソート時間："
				+ (end - start));
	}

	public static void dspAllay(int[] su) {
		for (int i = 0; i < su.length; i++) {
			System.out.print(su[i] + "  ");
			if (i % 10 == 9)
				System.out.println();
		}
	}

	public static void makeheap(int[] su) {
		for (int i = 1; i < su.length; i++) {
			int j = i;
			int k = (j - 1) / 2;
			while (k >= 0 && su[j] > su[k]) {
				swap(su, j, k);
				j = k;
				k = (j - 1) / 2;
			}
		}
	}

	public static void sortheap(int[] su) {
		for (int i = su.length - 1; i > 0; i--) {
			swap(su, 0, i);
			int j = 0, k;
			
			while ((k = j * 2 + 1) < i) {
				if (k < i - 1 && su[k] < su[k + 1])
					k = k + 1;

				if (su[j] >= su[k])
					break;

				swap(su, j, k);
				j = k;
			}
		}
	}

	public static void swap(int[] su, int x, int y) {
		int w = su[x];
		su[x] = su[y];
		su[y] = w;
	}
}
