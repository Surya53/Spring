package com.surya.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.surya.controller.MainController;
import com.surya.vo.PatientVO;

public class RelaTimeTest {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      System.out.print("Enter the patient name            ::");
      String  patientName = sc.next();
      System.out.print("Enter the Patient Address         ::");
      String patientAddrs = sc.next();
      System.out.println("Enter the patient MobileNO        ::");
      String  mobileNo = sc.next();
      System.out.print("Enter the NO:Of days Hosptialised ::");
      String noofdays = sc.next();
      System.out.print("Enter the bill per day            ::");
      String billperday = sc.next();
      
      //Create vo class object
      PatientVO vo = new PatientVO();
      vo.setPatientName(patientName);
      vo.setPatientAddrs(patientAddrs);
      vo.setMobileNo(mobileNo);
      vo.setNoofdayshosptialised(noofdays);
      vo.setBillperday(billperday);
      
      //Create Ioc Container
      DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
      XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
      reader.loadBeanDefinitions("com/surya/cfgs/applicationContext.xml");
      
      //Get Controller object
      MainController controller = factory.getBean("PatController",MainController.class);
      
      //invoke the methods
      try
      {
    	  String result = controller.processPatient(vo);
    	  System.out.println(result);
    	  
      }
      catch(Exception e)
      {
    	  e.printStackTrace();
    	  System.out.println("Internal problem try Again....");
      }
      
      
	}//method

}//class
