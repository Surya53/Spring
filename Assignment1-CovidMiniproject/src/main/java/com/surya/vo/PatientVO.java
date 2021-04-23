package com.surya.vo;

public class PatientVO {
	private String patientName;
	private String patientAddrs;
	private String mobileNo;
	private String noofdayshosptialised;
	private String billperday;
	
	//Setter and getter methods
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
	public String getNoofdayshosptialised() {
		return noofdayshosptialised;
	}
	public void setNoofdayshosptialised(String noofdays) {
		this.noofdayshosptialised = noofdays;
	}
	public String getBillperday() {
		return billperday;
	}
	public void setBillperday(String billperday) {
		this.billperday = billperday;
	}
	
	//toString
	@Override
	public String toString() {
		return "PatientVO [patientName=" + patientName + ", patientAddrs=" + patientAddrs + ", mobileNo=" + mobileNo
				+ ", noofdayshosptialised=" + noofdayshosptialised + ", billperday=" + billperday + "]";
	}
	
	
	
}
