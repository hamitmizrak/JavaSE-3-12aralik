package com.ecodation.dersler;

public class Ders038_cok_boyutlı {

	public static void main(String[] args) {

		// 2=satır 3=sutun
		int[][] matrixDizi = new int[2][2];
		matrixDizi[0][0] = 0;
		matrixDizi[0][1] = 1;
		matrixDizi[1][0] = 2;
		matrixDizi[1][1] = 3;

		for (int i = 0; i < 2; i++) { // satır
			for (int j = 0; j < 2; j++) { // sutun
				System.out.print(matrixDizi[i][j]);
			}
			System.out.println("");
		}

		int[][] arr = { { 1, 2 }, { 3, 4 } };

		for (int i = 0; i < 2; i++) { // satır için
			for (int j = 0; j < 2; j++) {// sutun için
				System.out.print("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
			System.out.println();
		}

	}
}
