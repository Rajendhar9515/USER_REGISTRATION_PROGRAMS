package com.bridgelabz.functional_interfaces;

import com.bridgelabz.UserRegistrationException;

@FunctionalInterface
public interface IMobileNumValidation {
	public boolean mobileNumberValidation(String mobileNum) throws UserRegistrationException;

}