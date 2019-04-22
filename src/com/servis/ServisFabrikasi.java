package com.servis;

public class ServisFabrikasi {

	private ServisFabrikasi() {
		// new yapilamaz
	}

	public static ServisInterface getServis(String servisAdi) {

		ServisInterface result = null;

		switch (servisAdi) {
		case "SearchCustomer":
			result = new SearchCustomer();
			break;
		case "Hesap":
			result = new Hesap();
			break;

		default:
			System.out.println("Servis bulunamadi");
			break;
		}

		return result;
	}

}
