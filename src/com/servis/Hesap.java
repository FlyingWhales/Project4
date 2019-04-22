package com.servis;

public class Hesap implements ServisInterface {

	private void hesapAc() {
		System.out.println("Hesap açtım");
	}

	@Override
	public void servisCagrisi() {
		hesapAc();
	}
	
}
