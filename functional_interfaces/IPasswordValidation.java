package com.bridgelabz.functional_interfaces;

import com.bridgelabz.UserRegistrationException;

@FunctionalInterface
public interface IPasswordValidation {
	public boolean passwordValidation(String password) throws UserRegistrationException;

}
