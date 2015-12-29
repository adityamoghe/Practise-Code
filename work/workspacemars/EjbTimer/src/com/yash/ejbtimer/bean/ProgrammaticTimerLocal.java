package com.yash.ejbtimer.bean;

import javax.ejb.Local;

@Local
public interface ProgrammaticTimerLocal {
	
	public void startMyTimer();
		
	public void myProgrammaticTimer();
}
