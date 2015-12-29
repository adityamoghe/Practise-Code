package com.yash.currency.ejb;

import javax.ejb.Local;

@Local
public interface CurrencyEjbLocal {
	
	 public int convertCurrency(int currency);
}
