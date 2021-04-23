package com.surya.service;

import com.surya.bo.PatientBO;
import com.surya.dao.ICovidPatientDAO;
import com.surya.dto.PatientDTO;

public class CovidPatientMgmtServiceImpl implements ICovidPatientMgmtService {
	private ICovidPatientDAO dao;

	public CovidPatientMgmtServiceImpl(ICovidPatientDAO dao) {
		System.out.println("1-Param Constructor");
		this.dao = dao;
	}

	public String CalculateHosptialBill(PatientDTO dto) throws Exception {
		int discount = 0;
		float finalAmount = 0;
		float totbill = (dto.getBillperday() * dto.getNoofdayshosptialised());

		if (totbill < 100000) {
			discount = 10;
			finalAmount = totbill - ((totbill * discount) / 100);
		} else if (totbill > 100000) {
			discount = 20;
			finalAmount = totbill - ((totbill * discount) / 100);
		}
		// Create Bo class object having persistence data.
		PatientBO bo = new PatientBO();
		bo.setPatientName(dto.getPatientName());
		bo.setPatientAddrs(dto.getPatientAddrs());
		bo.setMobileNo(dto.getMobileNo());
		bo.setNoofdayshosptialised(dto.getNoofdayshosptialised());
		bo.setBillperday(dto.getBillperday());
		bo.setTotalbillamount(totbill);
		bo.setDiscount(discount);
		bo.setNetbillamount(finalAmount);

		// use dao
		int count = dao.insert(bo);

		return  count == 1 ? "Patient Total bill :"+totbill +" with discount of "+discount+"%"+" NetBillAmount  "+finalAmount:" patient bill failed";
	}

}
