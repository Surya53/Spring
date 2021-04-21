package com.surya.controller;

import com.surya.VO.CustomerVO;
import com.surya.dto.CustomerDTO;
import com.surya.service.ICustomerMgmtService;

public class MainController {
	private ICustomerMgmtService service;

	public MainController(ICustomerMgmtService service) {
		System.out.println("MainController ::1-Param constructor");
		this.service = service;
	}

	public String processCustomer(CustomerVO vo) throws Exception {
		// convert VO class object data to DTO Class object data
		CustomerDTO dto = new CustomerDTO();
		dto.setCustName(vo.getCustName());
		dto.setCustAddrs(vo.getCustAddrs());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));

		// use service class.
		String result = service.calculateSimpleIntreset(dto);
		return result;
	}

}
