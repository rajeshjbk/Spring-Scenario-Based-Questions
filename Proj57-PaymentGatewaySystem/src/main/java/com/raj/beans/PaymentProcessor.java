package com.raj.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {

    private final NetBankingPayment netBankingPayment;

	@Autowired
	@Qualifier("selectedPayment")
	IPayment iPayment;

    PaymentProcessor(NetBankingPayment netBankingPayment) {
        this.netBankingPayment = netBankingPayment;
    }
	
	public void processPayment(String customer, double amount){
		
	     System.out.println(customer+" -> "+iPayment.pay(amount));
	}
}
