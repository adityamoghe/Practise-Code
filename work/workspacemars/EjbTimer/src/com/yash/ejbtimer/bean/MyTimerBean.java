package com.yash.ejbtimer.bean;

import javax.ejb.LocalBean;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class MyTimerBean implements MyTimerBeanLocal {

  
    public MyTimerBean() {
        // TODO Auto-generated constructor stub
    }
    
    @Schedule(hour="*", minute="*", second="*")
    public void startTimer(){
    	System.out.println("This is Automatic Timer............");
    }

}
