package com.testing;

public class TestingTest {
	public static void main(String[] args) {
		Insan i = new Insan();
		//System.out.println(i.meslek.getMeslekAdi());
		
		
		test1(i);
		test2(i);
	}
	
	public static void test1(Insan insan) {
		
		// mesleği işsiz ollanlar için ekrana işsiz yaz
		
		
		if ( insan.meslek.getMeslekAdi() == "İşsiz") {
			System.out.println("İşsiz");
		}
		
	}
	
	public static void test2(Insan insan) {
		
		//mesleği şarkıcı olanlar için ekrana insan insan yaz
		if ( insan.meslek.getMeslekAdi() == "Şarkıcı") {
			System.out.println("İnsan insan");
		}
		
		
	}
}
