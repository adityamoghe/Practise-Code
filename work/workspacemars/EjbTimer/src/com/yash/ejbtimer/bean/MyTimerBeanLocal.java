package com.yash.ejbtimer.bean;

import javax.ejb.Local;

@Local
public interface MyTimerBeanLocal {
	
	 public void startTimer();
}
