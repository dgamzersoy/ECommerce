package ecommerce.core;

import ecommerce.entities.concretes.CustomerDto;

public interface GoogleAuthService {
	
	void register(String email);
	void login(CustomerDto customerDto);
	

}
