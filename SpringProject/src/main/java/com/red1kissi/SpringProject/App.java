package com.red1kissi.SpringProject;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.red1kissi.model.PackageObject;
import com.red1kissi.model.SpringObject;

/**
 * Very simple application context invocation
 *
 */
public class App 
{
    public static void main( String[] args )
    {        
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
    	PackageObject obj = context.getBean(SpringObject.class);    	
    	
    	System.out.println( obj.getName());   
    	System.out.println( obj.getCollaborator().getName());
    	
    	    	
    }
}
