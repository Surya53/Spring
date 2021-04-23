package com.surya.dto;

import java.io.Serializable;

public class PatientDTO implements Serializable {
	private String patientName;
	private String patientAddrs;
	private String mobileNo;
	private int noofdayshosptialised;
	private float billperday;
	
	//Setter and Getters
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAddrs() {
		return patientAddrs;
	}
	public void setPatientAddrs(String patientAddrs) {
		this.patientAddrs = patientAddrs;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getNoofdayshosptialised() {
		return noofdayshosptialised;
	}
	public void setNoofdayshosptialised(int noofdayshosptialised) {
		this.noofdayshosptialised = noofdayshosptialised;
	}
	public float getBillperday() {
		return billperday;
	}
	public void setBillperday(float billperday) {
		this.billperday = billperday;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "PatientDTO [patientName=" + patientName + ", patientAddrs=" + patientAddrs + ", mobileNo=" + mobileNo
				+ ", noofdayshosptialised=" + noofdayshosptialised + ", billperday=" + billperday + "]";
	}
	
	
	

}
