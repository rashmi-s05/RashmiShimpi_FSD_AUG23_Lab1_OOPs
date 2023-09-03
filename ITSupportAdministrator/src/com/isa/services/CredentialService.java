package com.isa.services;

import java.util.Random;

import com.isa.interfaces.CredentialGenerator;
import com.isa.model.Employee;

public class CredentialService implements CredentialGenerator  {

	@Override
	public String generatePassword() {
		String specialCharacters = "!@#$%^&*()_+=-";
        int passwordLength = 8;  // You can adjust the length as needed
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        password.append((char) (random.nextInt(26) + 'A')); // Capital letter
        password.append((char) (random.nextInt(26) + 'a')); // Small letter
        password.append(random.nextInt(10)); // Number
        password.append(specialCharacters.charAt(random.nextInt(specialCharacters.length()))); // Special character

        for (int i = 4; i < passwordLength; i++) {
            char randomChar = (char) (random.nextInt(94) + 33); // Any printable ASCII character
            password.append(randomChar);
        }

        return password.toString();
	}

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		String email = firstName + lastName +"@"+ department+".digi.com"; 
		return email;
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear "+ employee.getFirstName() +" your generated credentials are as follows");
		System.out.println("Email--> "+ employee.getEmail());
		System.out.println("Password--> " + employee.getPassword());
	}

}
