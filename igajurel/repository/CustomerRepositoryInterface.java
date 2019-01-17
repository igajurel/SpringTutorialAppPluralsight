package com.igajurel.repository;

import java.util.List;

import com.igajurel.modules.Customer;

public interface CustomerRepositoryInterface {

	List<Customer> findAll();

}