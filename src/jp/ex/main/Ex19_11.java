package jp.ex.main;

/*
 ���19�|11 �q�[�v
 Author:yamamoto
 */
import java.io.*;

public class Ex19_11 {
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int i, n; // n�͗v�f��
		long start, end; // �J�n�����A�I������
		char yn; // �\���̗v�E�s�v

		// �@�v�f���ƕ\���敪����
		System.out.print("�v�f������͂��Ă���������");
		n = Integer.parseInt(reader.readLine());
		System.out.print("�f�[�^��\�����܂���(y:����)��");
		yn = reader.readLine().charAt(0);
		// �A�z��쐬
		int[] su = new int[n];
		// �B�������
		for (i = 0; i < su.length; i++) {
			su[i] = (int) (Math.random() * n * 10 + 1);
		}
		// �C�\�[�g�O�z��\��
		if (yn == 'y' || yn == 'Y')
			dspAllay(su);
		// �D�\�[�g���\��
		System.out.println("�\�[�g��");
		// �E�\�[�g�J�n���Ԏ擾
		start = System.currentTimeMillis();
		// �F�\�[�g
		makeheap(su);
		sortheap(su);

		// �G�\�[�g�I�����Ԏ擾
		end = System.currentTimeMillis();
		// �H�\�[�g�����\��
		System.out.println("�\�[�g����");
		// �I�\�[�g��z��\��
		if (yn == 'y' || yn == 'Y')
			dspAllay(su);

		// �J�\�[�g���ԕ\��
		System.out.println("�J�n�F" + start + "  �I���F" + end + " �\�[�g���ԁF"
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
