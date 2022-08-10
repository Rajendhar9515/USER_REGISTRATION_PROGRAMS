package com.bridgelabz.functional_interfaces;

import com.bridgelabz.UserRegistrationException;

@FunctionalInterface
public interface IFirstNameValidation {
	public boolean firstNameValidation(String first_name) throws UserRegistrationException;
}