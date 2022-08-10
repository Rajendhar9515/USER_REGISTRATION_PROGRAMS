package com.bridgelabz.functional_interfaces;

import com.bridgelabz.UserRegistrationException;

@FunctionalInterface
public interface ILastNameValidation {
	public boolean lastNameValidation(String last_name) throws UserRegistrationException;

}