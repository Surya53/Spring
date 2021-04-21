package com.surya.service;

import com.surya.bo.CustomerBo;
import com.surya.dao.ICustomerDAO;
import com.surya.dto.CustomerDTO;

public final class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	private ICustomerDAO dao;

	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		System.out.println("CustomerMgmtServiceImpl.0-param constructor");
		this.dao = dao;
	}

	@Override
	public String calculateSimpleIntreset(CustomerDTO dto) throws Exception {
		// calculate simple intrest amount(business logic)

		float intrAmt = (dto.getPamt() * dto.getRate() * dto.getTime()) / 100.0f;
		// create BO class object having persistence data
		CustomerBo bo = new CustomerBo();
		bo.setCustName(dto.getCustName());
		bo.setCustAddrs(dto.getCustAddrs());
		bo.setPamt(dto.getPamt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setIntrestAmount(intrAmt);

		// Use DAO
		int count = dao.insert(bo);
		// ternary operator <condition>?<Sucess>:<failure>
		return count == 1 ? "Customer registered Successfully ----> SimpleIntrest amount :: " + intrAmt
				: "Customer registration failed";
	}

}
