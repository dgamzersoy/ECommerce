package ecommerce;

import ecommerce.business.concretes.CustomerManager;
import ecommerce.core.GoogleAdapters;
import ecommerce.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("gamze");
		customer.setLastName("Ersoy");
		customer.setEmail("gamze@hotmail.com");
		customer.setPassword(1234);
		
		CustomerManager customerManager = new CustomerManager(new GoogleAdapters());
        customerManager.getAll();
        customerManager.add(customer);
	}

}
