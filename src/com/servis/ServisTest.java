package com.servis;

public class ServisTest {

	public static void main(String[] args) {
		
		ServisInterface sc = new SearchCustomer();
		sc.servisCagrisi();
		
		ServisInterface h = new Hesap();
		h.servisCagrisi();
		
		//yukari kisim factorysiz
		//aşağısı factory
		
		ServisInterface servis = ServisFabrikasi.getServis("Hesap");
		servis.servisCagrisi();
		
		ServisInterface servis2 = ServisFabrikasi.getServis("CRM");
		servis2.servisCagrisi();

	}

}
