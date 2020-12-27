package com.ecodation.ornekler;

/*
 * Radar algoritma
 */
public class Ornek022_Radar {
	
	public static void main(String[] args) {
		
		int radarOlcum = 160;
		
		if (70 < radarOlcum && radarOlcum < 80) {
			System.out.println("Hızınız normal");
		} else if (80 <= radarOlcum && radarOlcum < 85) {
			System.out.println("Ceza aldınız:" + " 110 TL");
		} else if (85 <= radarOlcum && radarOlcum < 90) {
			System.out.println("Ceza aldınız:" + " 190 TL");
		} else if (90 <= radarOlcum && radarOlcum < 100) {
			System.out.println("Ceza aldınız:" + " 210 TL");
		} else if (100 <= radarOlcum && radarOlcum < 150) {
			System.out.println("Ceza aldınız:" + " 650 TL" + " ve ehliyetine el konuldu.");
		} else {
			System.out.println("Dikkattttttttttttt");
		}
	}
	
}
