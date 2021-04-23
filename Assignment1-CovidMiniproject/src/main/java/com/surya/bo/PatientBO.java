package com.surya.bo;

public class PatientBO {

	// Bean Properties
	private String patientName;
	private String patientAddrs;
	private String mobileNo;
	private int noofdayshosptialised;
	private float billperday;
	private float totalbillamount;
	private int discount;
	private float netbillamount;

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

	public float getTotalbillamount() {
		return totalbillamount;
	}

	public void setTotalbillamount(float totalbillamount) {
		this.totalbillamount = totalbillamount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public float getNetbillamount() {
		return netbillamount;
	}

	public void setNetbillamount(float netbillamount) {
		this.netbillamount = netbillamount;
	}

	//toString
	@Override
	public String toString() {
		return "PatientBO [patientName=" + patientName + ", patientAddrs=" + patientAddrs + ", mobileNo=" + mobileNo
				+ ", noofdayshosptialised=" + noofdayshosptialised + ", billperday=" + billperday + ", totalbillamount="
				+ totalbillamount + ", discount=" + discount + ", netbillamount=" + netbillamount + "]";
	}

	
	
	
	
}
