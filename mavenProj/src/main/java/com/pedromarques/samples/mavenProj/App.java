package com.pedromarques.samples.mavenProj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	System.out.println("Hello World! ... and have a nice day");
    	System.out.println("Time: " + GPSWSDateTime.getGPSWSTime() +
    			" Date: " + GPSWSDateTime.getGPSWSDate());
    
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		objA.getMessage();
		objA.setMessage("I'm object A");
		objA.getMessage(); 
		
		HelloWorld objB = (HelloWorld) context.getBean("helloWorld"); 
		objB.getMessage();    	
		objB.setMessage("I'm object BB");
		objB.getMessage();
    	
    	
    }
}
