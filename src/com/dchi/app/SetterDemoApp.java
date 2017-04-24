package com.dchi.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Phone myPhone = context.getBean("myPhone", Phone.class);*/
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Create object
		
		Phone mySecondPhone = context.getBean("mySecondPhone", Phone.class);
		
		System.out.println("LG G6 " + mySecondPhone.turnOff());
		
		context.close();
	}

}
