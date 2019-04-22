package com.servis;

public class SearchCustomer implements ServisInterface {

	
	private void search() {
		System.out.println("Aradım");
	}

	@Override
	public void servisCagrisi() {
		search();
	}
	
}
