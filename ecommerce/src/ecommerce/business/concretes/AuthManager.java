package ecommerce.business.concretes;

import ecommerce.business.abstracts.AuthService;
import ecommerce.business.abstracts.CustomerService;
import ecommerce.core.Validation;
import ecommerce.entities.concretes.Customer;


public class AuthManager implements AuthService {

	public CustomerService customerService;
	
	public AuthManager(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@Override
	public void register(Customer customer) {
	  if(customerCheckIfNull(customer)&&checkIfPasswordValidate(customer)&& Validation.emailValidation(customer.getEmail())){
		  customerService.add(customer);
		  
	  }
	  else {
		  System.out.println("giri� ba�ar���z");
	  }
		
	}

	
	

	public boolean customerCheckIfNull(Customer customer) {
		if(customer!=null&&!customer.getFirstName().isEmpty()&&!customer.getLastName().isEmpty()
				&&!customer.getEmail().isEmpty()) {
			return true;
		}
		System.out.println("Eksik giri� yapt�n�z");
		return false;
	}
	
	
	public boolean checkIfPasswordValidate(Customer customer) {
		if(customer.getPassword()>6) {
			return true;
		}
		else {
			System.out.println("eksik giri�");
			return false;
		}
		
	}
}
