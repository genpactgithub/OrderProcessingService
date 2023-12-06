package com.orderdetails.OrderDetails.model;

public class Discount {

	public float discount;

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public Discount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Discount(float discount) {
		super();
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Discount [discount=" + discount + "]";
	}
}
