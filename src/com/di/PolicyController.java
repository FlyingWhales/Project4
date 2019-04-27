package com.di;

public class PolicyController {

	private CoverService coverService; // = new CoverService(); //new ile verilirse PolicyController ile CoverService tightly coupled olur
	// Ödev: Loosely coupled ve  tightly coupled ne demektir
	
	private DiscountService discountService; // = new DiscountService();
	private PremiumService premiumService; // = new PremiumService();
	// private PaymentService paymentService = new PaymentService();
	//private GarantiPaymentService garantiPaymentService = new GarantiPaymentService();
	//private YKPaymentService ykPaymentService = new YKPaymentService();
	
	private PaymentServiceInterface paymentService;
	
	
	public PolicyController() {
		
	}
	
	public PolicyController(CoverService coverService, DiscountService discountService, PremiumService premiumService,
			PaymentServiceInterface paymentService) {
		
		//constructor based dependency injection
		super();
		this.coverService = coverService;
		this.discountService = discountService;
		this.premiumService = premiumService;
		this.paymentService = paymentService;
	}
	
	
	public CoverService getCoverService() {
		return coverService;
	}

	public void setCoverService(CoverService coverService) {
		this.coverService = coverService;
	}


	public DiscountService getDiscountService() {
		return discountService;
	}


	public void setDiscountService(DiscountService discountService) {
		this.discountService = discountService;
	}


	public PremiumService getPremiumService() {
		return premiumService;
	}

	public void setPremiumService(PremiumService premiumService) {
		this.premiumService = premiumService;
	}

	public PaymentServiceInterface getPaymentService() {
		return paymentService;
	}


	public void setPaymentService(PaymentServiceInterface paymentService) {
		this.paymentService = paymentService;
	}


	public String produce() {

		// Teminatları getir
		coverService.getCovers();
		// İndirimleri hesapla
		discountService.getDiscounts();
		// Prim hesapla
		premiumService.calculatePremium();
		// Odemeyi gerçekleştir
		paymentService.pay();

		//boolean isYKB = true; //burası normalde bir validasyon
		//bu senaryo için elle setledik

//		if (isYKB) {
//			ykPaymentService.pay();
//		} else {
//			garantiPaymentService.pay();
//		}
		 
		 /* Odev: 
		  * Burada this.paymentService = PaymentFactory.getPaymentService("YKB"); ile setlenecek
		  */

		return "";
	}

}
