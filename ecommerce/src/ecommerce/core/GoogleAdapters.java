package ecommerce.core;

import ecommerce.google.Google;

public class GoogleAdapters implements GoogleService {

	@Override
	public void send(String email, String message) {
		Google googleLogin = new Google();
		googleLogin.googleLogin(message, message);
		
	}

}
