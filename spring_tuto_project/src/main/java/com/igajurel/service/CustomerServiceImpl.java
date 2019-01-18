/**
 * 
 */
package com.igajurel.service;

import java.util.List;

import com.igajurel.modules.Customer;
import com.igajurel.repository.CustomerRepositoryInterface;
import com.igajurel.repository.HibernateCustomerRepositoryImpl;

/**
 * @author i20432
 *
 */
public class CustomerServiceImpl implements CustomerServiceInterface {
	
	private CustomerRepositoryInterface customerRepositoryInterface = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.igajurel.service.CustomerServiceInterface#findAllLocal()
	 */
	@Override
	public List<Customer> findAllLocal(){
		return customerRepositoryInterface.findAll();
	}

}
