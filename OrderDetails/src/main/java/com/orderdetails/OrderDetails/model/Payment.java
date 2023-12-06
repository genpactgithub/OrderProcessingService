package com.orderdetails.OrderDetails.model;

public class Payment {
	
	public double payment;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(double payment) {
		super();
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Payment [payment=" + payment + "]";
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}
	
}
