package org.demo.guicedemo.server.impl;

import javax.inject.Inject;

import org.demo.guicedemo.server.OrderService;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;

public class OrderServiceTest {

	@Inject
	private OrderService orderService;

	@Before
	public void setUp() {
		Guice.createInjector(new ServerModule()).injectMembers(this);
	}

	@Test
	public void testSendToPayment() {
		// OrderService orderService = Guice.createInjector(new
		// ServerModule()).getInstance(OrderService.class);
		orderService.sendToPayment(789L);
	}
}
