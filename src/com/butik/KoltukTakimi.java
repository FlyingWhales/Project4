package com.butik;

public class KoltukTakimi {

	String minder;
	int ayakSayisi;
	int fiyat;
	boolean sandalyeVarMi;

	public KoltukTakimi() {
		minder = minderYap();
		ayakSayisi = ayaklariYap();
		fiyat = fiyatBelirle();
		sandalyeVarMi = sandalyeYap();
		
		if (sandalyeVarMi) {
			System.out.println("Ama sandalyesi var :)");
		}
	}

	private boolean sandalyeYap() {

//		if (this.fiyat == 19000) {
//			return true;
//		}
//
//		return false;

//		return this.fiyat == 19000;

		boolean result = this.fiyat == 19000;
		return result;
	}

	private int fiyatBelirle() {
		System.out.println("Gülin Hanım :)");
		return 19000;
	}

	private int ayaklariYap() {
		System.out.println("Boya");
		System.out.println("Çivileri çak");
		return 4;
	}

	private String minderYap() {
		System.out.println("Kumaşları dik");
		return "minder";
	}

}
