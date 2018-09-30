package org.demo.guicedemo.server.impl;

import javax.inject.Inject;

import org.demo.guicedemo.server.OrderService;
import org.demo.guicedemo.server.PaymentService;
import org.demo.guicedemo.server.PriceService;

public class OrderServiceImpl implements OrderService {
	// dependencies
	private final PriceService priceService;
	private final PaymentService paymentService; // remove final
	private final SessionManager sessionManager;

	// states
	private Long ordersPaid = 0L;

	@Inject
	public OrderServiceImpl(PriceService priceService, PaymentService paymentService, SessionManager sessionManager) {
		super();
		this.priceService = priceService;
		this.paymentService = paymentService;
		this.sessionManager = sessionManager;
	}

	@Override
	public void sendToPayment(long orderId) {
		long price = priceService.getPrice(orderId);
		paymentService.pay(orderId, price, sessionManager.getSessionId());
		ordersPaid = ordersPaid + 1;

		throw new RuntimeException("price is: " + price + "; order id is:" + orderId);
	}

}
