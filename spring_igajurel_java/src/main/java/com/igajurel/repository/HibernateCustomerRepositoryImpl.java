/**
 * 
 */
package com.igajurel.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.igajurel.modules.Customer;

/**
 * @author ishan
 *
 */
@Repository("customerRepositoryImpl")
public class HibernateCustomerRepositoryImpl implements CustomerRepositoryInterface {
	
	/* (non-Javadoc)
	 * @see com.igajurel.repository.CustomerRepositoryInterface#findAll()
	 */
	@Value("${dbUsername}")
	private String dbUsernameVar;
	
	@Override
	public List<Customer> findAll(){
		
		System.out.println(dbUsernameVar);
		//to perform time-space complexity, write own code instead of the customers.add() and for the loop and the add() alter process, benchmark time, O(n) 
		List<Customer> customers = new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			Customer customer = new Customer();
			
			customer.setFirstName("Ishan");
			customer.setLastName("Gajurel");
			customer.setAge(i);
			
			customers.add(customer);
			
		}
		
		return customers;
		
	}

}