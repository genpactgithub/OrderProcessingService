package com.orderdetails.OrderDetails.Service;

import org.springframework.stereotype.Service;

import com.orderdetails.OrderDetails.model.Discount;
import com.orderdetails.OrderDetails.model.OrderRequest;
import com.orderdetails.OrderDetails.model.Payment;
import com.orderdetails.OrderDetails.model.Product;
import com.orderdetails.OrderDetails.model.User;
import java.util.regex.*;

@Service
public class OrderServiceImpl implements OrderService {

	public boolean validateOrder(OrderRequest orderRequest) {
		boolean isValid = false;
		try {
			if (orderRequest.getOrderId() > 0) {
				String p = "^\\d{10}$";
				Pattern pattern = Pattern.compile(p);
				Matcher phoneVali = pattern.matcher(orderRequest.getPhoneNumber());

				String emailRegex = "^(.+)@(.+)$";

				Pattern pattern1 = Pattern.compile(emailRegex);

				Matcher emailVali = pattern1.matcher(orderRequest.getEmailAddress());

				if (phoneVali.matches() && emailVali.matches()) {
					isValid = true;
				}
			} else {
				isValid = false;
			}

		} catch (NullPointerException e) {
			isValid = false;
			e.printStackTrace();

		}
		return isValid;
	}

	@Override
	public Product createOrder(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User userDetail(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Discount discount(Discount dis) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment payment(Payment pay) {
		// TODO Auto-generated method stub
		return null;
	}

}
