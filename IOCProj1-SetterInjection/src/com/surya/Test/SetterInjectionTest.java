package com.surya.Test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.surya.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
	 //Locate and hold spring bean cfg file.
	FileSystemResource res = new FileSystemResource("src/com/surya/cfgs/applicationContext.xml");
	//Create IOC Container
	XmlBeanFactory factory  = new XmlBeanFactory(res);
	//get targetBean class object
	Object obj = factory.getBean("wmg");
	//type casting
	WishMessageGenerator generator = (WishMessageGenerator)obj;
	//invoke the business method
	String result = generator.generateWishMessage("surya");
	System.out.println("Result :: "+result);
	
		
	}

}
