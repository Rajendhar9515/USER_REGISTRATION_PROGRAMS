package com.bridgelabz.functional_interfaces;

import com.bridgelabz.UserRegistrationException;

@FunctionalInterface
public interface IEmailValidation {
	public boolean emailValidation(String email) throws UserRegistrationException;

}