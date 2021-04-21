package com.surya.dao;

import com.surya.bo.CustomerBo;

public interface ICustomerDAO {
  public int insert(CustomerBo bo) throws Exception;
}
