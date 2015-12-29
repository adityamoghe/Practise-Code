package com.yash.ejbtimer.bean;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.ScheduleExpression;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.TimerService;

/**
 * Session Bean implementation class ProgrammaticTimer
 */
@Stateless
@LocalBean
public class ProgrammaticTimer implements ProgrammaticTimerLocal {
	
	@Resource
    TimerService timerService;
	
    public ProgrammaticTimer() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void startMyTimer() {
		// TODO Auto-generated method stub
		
		ScheduleExpression scheduleExpression =new ScheduleExpression().hour("*").minute("*").second("*");
		timerService.createCalendarTimer(scheduleExpression);
		
	}

	@Override
	@Timeout
	public void myProgrammaticTimer() {
		// TODO Auto-generated method stub
		
		System.out.println("Programmatic Timer..........................");
	}
	
	

}
