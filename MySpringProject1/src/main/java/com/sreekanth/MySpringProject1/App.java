package com.sreekanth.MySpringProject1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/*
		 * Vehicle vehicle=(Vehicle)new Car(); vehicle.drive();
		 */
    	
		
		  BeanFactory bf=new ClassPathXmlApplicationContext("beanconf.xml");
		  
		  Car t=(Car)bf.getBean("car");
		   
		  
    t.drive();
    	
    }
}
