package com.surya.dao;

import com.surya.bo.PatientBO;

public interface ICovidPatientDAO {
   public int insert(PatientBO bo) throws Exception;
}
