package com.butik;

public class Dolap {
	
	int kapak;
	String malzeme;
	
	
	
	public Dolap() {
		malzeme = malzemeSec();
		kapak = kapakUret();
	}



	private int kapakUret() {
		System.out.println("2 kapakli");
		return 2;
	}



	private String malzemeSec() {
		System.out.println("malzeme seç");
		return "Meşe";
	}
	

}
