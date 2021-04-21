package com.surya.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import com.surya.VO.CustomerVO;
import com.surya.controller.MainController;

public class RealtimeDITest {
 
	public static void main(String[] args) {
	  //Read inputs from enduser as string values
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer name::");
		String name =  sc.next();
		System.out.print("Enter Customer Address::");
		String addrs =  sc.next();
		System.out.print("Enter  Customer principle Amount::");
		String pAmt = sc.next();
		System.out.print("Enter Customer  Rate of intrest::");
		String rate = sc.next();
		System.out.print("Enter Customer Time ::");
		String time = sc.next();
		
		//create CustomerVO class object
		CustomerVO vo  = new CustomerVO();
		vo.setCustName(name);
		vo.setCustAddrs(addrs);
		vo.setPamt(pAmt);
		vo.setRate(rate);
		vo.setTime(time);
		
		//Create IOc Container 
		DefaultListableBeanFactory factory  = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new  XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/surya/cfgs/applicationContext.xml");
		//get controller object
		MainController controller = factory.getBean("controller",MainController.class);
		//invoke the methods
		try {
			String result = controller.processCustomer(vo);
			System.out.println(result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Internal  problem----Try Again");
		}
		
	}//method

}//class
