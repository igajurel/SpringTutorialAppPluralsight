/**
 * 
 */
package com.igajurel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igajurel.modules.Customer;
import com.igajurel.repository.CustomerRepositoryInterface;

/**
 * @author i20432
 *
 */

@Service("customerServiceInterfaceBean")
public class CustomerServiceImpl implements CustomerServiceInterface {
	
	
	private CustomerRepositoryInterface customerRepositoryInterface ;
	//= new HibernateCustomerRepositoryImpl();
	
	
	public CustomerServiceImpl() {
		
	}
	
	
	public CustomerServiceImpl(CustomerRepositoryInterface customerRepositoryInterface) {
		System.out.println("We are using Constructor Injection");
		this.customerRepositoryInterface = customerRepositoryInterface;
	}
	
	/* (non-Javadoc)
	 * @see com.igajurel.service.CustomerServiceInterface#findAllLocal()
	 */
	@Override
	public List<Customer> findAllLocal(){
		return customerRepositoryInterface.findAll();
	}

	@Autowired
	public void setCustomerRepositoryInterface(CustomerRepositoryInterface customerRepositoryInterface) {
		System.out.println("We are using Setter Injection");
		this.customerRepositoryInterface = customerRepositoryInterface;
	}

}
