package com.di;

public class GarantiPaymentService implements PaymentServiceInterface {

	@Override
	public void pay() {
		System.out.println("GarantiPaymentService.pay()");
	}
}
