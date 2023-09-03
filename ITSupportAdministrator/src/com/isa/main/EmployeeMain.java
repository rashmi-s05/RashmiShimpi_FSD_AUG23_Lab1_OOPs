package com.isa.main;

import com.isa.model.Employee;
import com.isa.services.CredentialService;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
				
		Employee employee = new Employee("Rashmi", "Shimpi");
		
		CredentialService service = new CredentialService();
		
		String generateEmail = "";
		String generatePassword = "";

		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		switch(option) {
		
			case 1 : {
				generateEmail = service.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "tech");
				generatePassword = service.generatePassword();
				break;
			}
			case 2 : {
				generateEmail = service.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "admin");
				generatePassword = service.generatePassword();
				break;
			}
			case 3 : {
				generateEmail = service.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "hr");
				generatePassword = service.generatePassword();
				break;
			}
			case 4 : {
				generateEmail = service.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "legal");
				generatePassword = service.generatePassword();
				break;
			}			
			default : {
				System.out.println("Please enter valid option");
				break;
			}
		}		
		
		employee.setEmail(generateEmail);
		employee.setPassword(generatePassword);
		service.showCredentials(employee);
		sc.close();
	}

}
