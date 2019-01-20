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

	// private CustomerRepositoryInterface customerRepositoryInterface = new
	// HibernateCustomerRepositoryImpl();

	// now, using setter injection to use XML and bean to run CustomerServiceImpl
	// functions
	private CustomerRepositoryInterface customerRepositoryInterface;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.igajurel.service.CustomerServiceInterface#findAllLocal()
	 */
	@Override
	public List<Customer> findAllLocal() {
		return customerRepositoryInterface.findAll();
	}

	// for setter injection
	public void setCustomerRepositoryInterface(CustomerRepositoryInterface customerRepositoryInterface) {
		this.customerRepositoryInterface = customerRepositoryInterface;
	}
	
	//for constructor injection
	public CustomerServiceImpl(CustomerRepositoryInterface customerRepositoryInterface) {
		this.customerRepositoryInterface = customerRepositoryInterface;
	}
	
	public CustomerServiceImpl() {
		
	}
	

}
