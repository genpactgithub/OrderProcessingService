package com.orderdetails.OrderDetails.controller;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.orderdetails.OrderDetails.Service.OrderServiceImpl;
import com.orderdetails.OrderDetails.model.OrderRequest;

@RestController
public class OrderController {

	@Autowired
	private OrderServiceImpl orderservice;

	@PostMapping("/validate")
	public ResponseEntity validateOrder(@RequestBody OrderRequest orderRequest) {
		boolean isValid = false;
		try {
			isValid = this.orderservice.validateOrder(orderRequest);
			return ResponseEntity.of(Optional.of(isValid));

		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
	
	//create discount,payment and shipping end points as well. 
	

}
