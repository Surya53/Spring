package com.surya.service;

import com.surya.bo.PatientBO;
import com.surya.dto.PatientDTO;

public interface ICovidPatientMgmtService {
   public String CalculateHosptialBill(PatientDTO dto) throws Exception;


}
