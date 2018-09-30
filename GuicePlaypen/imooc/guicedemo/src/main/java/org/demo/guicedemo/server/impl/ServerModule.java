package org.demo.guicedemo.server.impl;

import java.util.Arrays;
import java.util.List;

import org.demo.guicedemo.server.OrderService;
import org.demo.guicedemo.server.PaymentService;
import org.demo.guicedemo.server.PriceService;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class ServerModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(OrderService.class).to(OrderServiceImpl.class);
		bind(PaymentService.class).to(PaymentServiceImpl.class);
		bind(PriceService.class).to(PriceServiceImpl.class);
		/*
		 * bind(new TypeLiteral<List<String>>() {
		 * }).annotatedWith(Names.named("supportedCurrencies")).toInstance(Arrays.asList
		 * ("CNY", "USD"));
		 */
		install(new ChinaModule());
		install(new GlobalModule());
	}

	@Provides
	@SessionId
	Long generateSessionId() {
		return System.currentTimeMillis();
	}

	/*
	 * @Provides
	 * 
	 * @Named("supportedCurrencies") List<String>
	 * getSupportedCurrencies(PriceService priceService) { return
	 * priceService.getSupportedCurrencies(); }
	 */
}
