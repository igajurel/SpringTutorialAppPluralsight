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

@Service("CustomerServiceImplAnno")
public class CustomerServiceImpl implements CustomerServiceInterface {

	private CustomerRepositoryInterface customerRepositoryInterface;
	// = new HibernateCustomerRepositoryImpl();

	@Autowired
	public CustomerServiceImpl(CustomerRepositoryInterface customerRepositoryInterface) {
		System.out.println("we are using Constructor injection Auto-wired");
		this.customerRepositoryInterface = customerRepositoryInterface;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.igajurel.service.CustomerServiceInterface#findAllLocal()
	 */
	@Override
	public List<Customer> findAllLocal() {
		return customerRepositoryInterface.findAll();
	}

	public void setCustomerRepositoryInterface(CustomerRepositoryInterface customerRepositoryInterface) {
		System.out.println("we are using setter injection Auto-wired");
		this.customerRepositoryInterface = customerRepositoryInterface;
	}

}
