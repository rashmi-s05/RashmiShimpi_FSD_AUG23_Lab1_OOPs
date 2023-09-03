package com.isa.interfaces;

import com.isa.model.Employee;

public interface CredentialGenerator {

	String generatePassword();
	String generateEmailAddress(String fisrtName, String lastName, String department);
	void showCredentials(Employee employee);
	
}
