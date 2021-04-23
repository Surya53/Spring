package com.surya.controller;

import com.surya.dto.PatientDTO;
import com.surya.service.ICovidPatientMgmtService;
import com.surya.vo.PatientVO;

public class MainController {
	private ICovidPatientMgmtService service;

	public MainController(ICovidPatientMgmtService service) {
        System.out.println("MainControler ::1-Param Constructor ");
		this.service = service;
	}
	
	public String processPatient(PatientVO vo) throws Exception
	{
		//convert vo class to DTO class object
		PatientDTO dto = new PatientDTO();
		dto.setPatientName(vo.getPatientName());
		dto.setPatientAddrs(vo.getPatientAddrs());
		dto.setMobileNo(vo.getMobileNo());
		dto.setNoofdayshosptialised(Integer.parseInt(vo.getNoofdayshosptialised()));
		dto.setBillperday(Float.parseFloat(vo.getBillperday()));
		
		//use service class
		String result = service.CalculateHosptialBill(dto);
		
		return result;
	}

}
