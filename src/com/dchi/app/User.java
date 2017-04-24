package com.dchi.app;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dchi.app.*;

public class User {
	
	
	public static void main(String[] args) {
		
		//GalaxyS8 gs8 = new GalaxyS8();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Phone myPhone = context.getBean("myPhone", Phone.class);
		Phone myLG = context.getBean("mySecondPhone", Phone.class);
		GalaxyNote myNote = context.getBean("myThirdPhone", GalaxyNote.class);
		
		System.out.println(myPhone.ring());
		System.out.println(myPhone.turnOnLight());
		
		System.out.println("LG G6 " + myLG.turnOn());
		System.out.println("Galaxy Note " + myNote.ring());		
		System.out.println(myNote.getName());
		
		context.close();
	}

}


// configure as constructor-arg or property id="name of the property/field" ref="object you're injccting"

//constructor is passed the value/boject which then assigns it to the private field

//property passes the object to the setter which then sets it to the private field/property