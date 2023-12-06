package com.orderdetails.OrderDetails.Service;

import com.orderdetails.OrderDetails.model.Discount;
import com.orderdetails.OrderDetails.model.OrderRequest;
import com.orderdetails.OrderDetails.model.Payment;
import com.orderdetails.OrderDetails.model.Product;
import com.orderdetails.OrderDetails.model.User;

public interface OrderService {
	public boolean validateOrder(OrderRequest orderRequest);
	public Product createOrder(Product product);
	public User userDetail(User user);
	public Discount discount(Discount dis);
	public Payment payment(Payment pay);
}
