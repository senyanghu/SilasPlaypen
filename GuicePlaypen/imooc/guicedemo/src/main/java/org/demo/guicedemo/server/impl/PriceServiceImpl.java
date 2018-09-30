package org.demo.guicedemo.server.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.demo.guicedemo.server.PriceService;

public class PriceServiceImpl implements PriceService {
	private final Set<String> supportedCurrencies;

	@Inject
	public PriceServiceImpl(Set<String> supportedCurrencies) {
		super();
		this.supportedCurrencies = supportedCurrencies;
	}

	@Override
	public long getPrice(long orderId) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Set<String> getSupportedCurrencies() {
		return supportedCurrencies;
	}

	/*
	 * @Override public List<String> getSupportedCurrencies() { return
	 * Arrays.asList("USD", "CNY", "EUR"); }
	 */

}
