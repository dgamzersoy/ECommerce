package ecommerce.business.abstracts;

import java.util.List;

import ecommerce.entities.concretes.Customer;

public interface CustomerService {
	void add(Customer customer);
	void delete(Customer customer);
	List<Customer>getAll();
	

}
