package com.di;

public class YKPaymentService implements PaymentServiceInterface {
	
	@Override
	public void pay() {
		System.out.println("YKPaymentService.pay()");
	}
}
