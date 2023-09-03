package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmpCredentialsImpl;

public class DriverApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the employees first name");
		String f=sc.next();
		
		System.out.println("please enter the employees last name");
		String l=sc.next();
		
        Employee emp1 = new Employee(f,l);// making obj for employee class
        
        
        EmpCredentialsImpl cred = new  EmpCredentialsImpl();//creating cred object 
        
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resources");
        System.out.println("4. Legal");
        
        System.out.println("Please choose your department");
        int choice = sc.nextInt();
        String genEmail="";
        String genPassword="";
        
        switch(choice)
        {
        case 1:
        	genEmail=cred.generateEmailId(emp1.getFname().toLowerCase(),emp1.getLname().toLowerCase(),"tech");
        break;
        
        case 2:
        	genEmail=cred.generateEmailId(emp1.getFname().toLowerCase(),emp1.getLname().toLowerCase(),"admin");
        break;
        
        case 3:
        	genEmail=cred.generateEmailId(emp1.getFname().toLowerCase(),emp1.getLname().toLowerCase(),"human resource");
        break;
        
        case 4:
            genEmail=cred.generateEmailId(emp1.getFname().toLowerCase(),emp1.getLname().toLowerCase(),"legal");
        break;
        
        default: System.out.println("Please enter valid input");
        }
        
        genPassword=cred.generatePassword();
        emp1.setEmailid(genEmail);
        emp1.setPassword(genPassword);
        
       
        cred.showDetails(emp1);
        
              
	    }
	}


