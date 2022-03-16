package no.hvl.dat109;

import java.util.Random;

public class Terning {

	private static int[] Tern;
	
	public static void trillTerninger() {
		Random ran = new Random();
		for(int i = 0; i<5; i++) {
			
			Tern[i] = ran.nextInt(6);

		}
		for(int i = 0; i < 5; i++) {
			System.out.println(Tern[i]);
		}
	}
}
