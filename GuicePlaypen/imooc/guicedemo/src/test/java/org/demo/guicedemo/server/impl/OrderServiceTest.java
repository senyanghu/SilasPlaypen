package org.demo.guicedemo.server.impl;

import java.util.List;

import javax.inject.Inject;

import org.demo.guicedemo.server.OrderService;
import org.demo.guicedemo.server.PriceService;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Provider;
import com.google.inject.name.Named;

public class OrderServiceTest {

	@Inject
	private OrderService orderService;

	@Inject
	private PriceService priceService;

	/*
	 * @Inject
	 * 
	 * @Named("supportedCurrencies") private Provider<List<String>>
	 * supportedCurrenciesProvider;
	 */

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

	@Test
	public void testSupportedCurrencies() {
		// throw new RuntimeException(supportedCurrenciesProvider.get().toString());
		throw new RuntimeException(priceService.getSupportedCurrencies().toString());

	}
}
