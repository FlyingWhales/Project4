package com.di;

public class PolicyEndpoint {
	
	
	public void policyProduction() {
		//PolicyController pc = new PolicyController();
		CoverService cs = new CoverService();
		DiscountService ds = new DiscountService();
		PremiumService ps = new PremiumService();
		PaymentServiceInterface payS = new YKPaymentService(); // Siz burayı factory ile yapacaksınız
		
		PolicyController pc = new PolicyController(cs,ds,ps,payS); //constructor based dependency injection
		pc.produce();
		
		PolicyController pc2 = new PolicyController();
		
		
		//setter based dependency injection
		//method based?
		//property based?
		pc2.setCoverService(cs);
		pc2.setDiscountService(ds);
		pc2.setPremiumService(ps);
		pc2.setPaymentService(payS); // -> Interface based dependency injection
		
	}

}
