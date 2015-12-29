package com.yash.currency.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class CurrencyEjb implements CurrencyEjbLocal {

	@Override
	public int convertCurrency(int currency) {
		// TODO Auto-generated method stub
		System.out.println("currency converter method");
		currency = currency / 64;
		
		return currency;
	}
}
