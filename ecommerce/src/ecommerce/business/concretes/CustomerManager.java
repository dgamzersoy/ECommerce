package ecommerce.business.concretes;

import java.util.List;

import ecommerce.business.abstracts.CustomerService;
import ecommerce.core.GoogleService;
import ecommerce.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private GoogleService googleService;
	
	
	public CustomerManager(GoogleService googleService) {
		super();
		this.googleService = googleService;
	}


	@Override
	public void add(Customer customer) {
	
		var result = checkIfCustomerValidate(customer);
		if(result==true) {
			googleService.send(customer.getEmail(),"eklendi" );
		}
		else {
			System.out.println("tekrar giriþ yapýn");
		}
		
	
		
	
			
		}
		
		
	


	@Override
	public void delete(Customer customer) {
		System.out.println("silindi"+ customer.getFirstName());
		
	}

	@Override
	public List<Customer> getAll() {
		System.out.println("Listelendi");
		return null;
	}
	
	public boolean checkIfCustomerValidate(Customer customer) {
		if(customer.getFirstName().length()>2 && customer.getLastName().length()>2) {
			return true;
		}else {
			System.out.println("eksik giriþ yaptýnýz");
			return false;
		}
		
	}



	


}
