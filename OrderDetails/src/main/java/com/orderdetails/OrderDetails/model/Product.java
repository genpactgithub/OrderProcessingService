package com.orderdetails.OrderDetails.model;

import java.util.List;

public class Product {

	
	public long productId;
	public double price;
	public String productName;
	/* public List<String>order */;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(long productId, double price, String productName/* , List<String> order */) {
		super();
		this.productId = productId;
		this.price = price;
		this.productName = productName;
		/* this.order = order; */
	}

	/*
	 * public List<String> getOrder() { return order; }
	 */

	/*
	 * public void setOrder(List<String> order) { this.order = order; }
	 */

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", price=" + price + ", productName=" + productName + "]";
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
}
