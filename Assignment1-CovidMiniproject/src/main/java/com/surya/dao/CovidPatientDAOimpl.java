package com.surya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.surya.bo.PatientBO;

public class CovidPatientDAOimpl implements ICovidPatientDAO {

	public final String COVID_PATIENT_INSERT_QUERY = "INSERT INTO COVID VALUES(PATID_SEQ.NEXTVAL,?,?,?,?,?,?,?,?)";
	private DataSource ds;
	
	public CovidPatientDAOimpl(DataSource ds) {
       System.out.println("PatientDAOImpl :: 1-Param Constructor");
		this.ds = ds;
	}
	
	@Override
	public int insert(PatientBO bo) throws Exception {
       Connection con = null;
       PreparedStatement ps = null;
       int count = 0;
       try {
    	   //get pooled connection 
    	   con = ds.getConnection();
    	   //Create a prepared statement  object having  pre compiled sql query.
    	   
    	   ps = con.prepareStatement(COVID_PATIENT_INSERT_QUERY);
    	   ps.setString(1,bo.getPatientName());
    	   ps.setString(2, bo.getPatientAddrs());
    	   ps.setString(3,bo.getMobileNo());
    	   ps.setInt(4, bo.getNoofdayshosptialised());
    	   ps.setFloat(5,bo.getBillperday());
    	   ps.setFloat(6,bo.getTotalbillamount());
    	   ps.setInt(7,bo.getDiscount());
    	   ps.setFloat(8,bo.getNetbillamount());
    	   
    	   //Execute query
    	   count = ps.executeUpdate();
    	   
       }
       catch(SQLException se)
       {
    	   se.printStackTrace();
    	   throw se;
       }
       catch(Exception e)
       {
    	   e.printStackTrace();
    	   throw e;
       }
       finally {
    	   try {
    		   if(ps!= null)
    			   ps.close(); 
    	   }
    	   catch(SQLException se)
    	   {
    		   se.printStackTrace();
    		   throw se;
    	   }
    	   try {
    		   if(con!= null)
    			   con.close();
    	   }
    	   catch(SQLException se)
    	   {
    		   se.printStackTrace();
    		   throw se;
    	   }
       }//finally
       
		return count;
	}//method

}// class
