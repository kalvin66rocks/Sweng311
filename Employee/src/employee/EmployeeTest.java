package employee;

import java.util.Scanner;

/*
author Kevin Brenneman
 */
public class EmployeeTest 
{
    public static void main(String[] args) 
    {
        //createan object to obtain input from the user
        Scanner input = new Scanner(System.in);
        
        //create a new employee object to create the 
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        
        //prompt for first and last name of employee 1 and get the salary
        System.out.println("Please enter the information for employee 1: first name, last name, salary; each seperated by a space");
        System.out.print("Employee 1: ");
        String firstName1 = input.next();
        employee1.setfirstName(firstName1);
        String lastName1 = input.next();
        employee1.setlastName(lastName1);
        double salary1 = input.nextDouble();
        employee1.setsalary(salary1);
        
        //prompt for first and last name of employee 2 and get the salary
        System.out.println("Please enter the information for employee 2: first name, last name, salary; each seperated by a space");
        System.out.print("Employee 2: ");
        String firstName2 = input.next();
        employee2.setfirstName(firstName2);
        String lastName2 = input.next();
        employee2.setlastName(lastName2);
        double salary2 = input.nextDouble();
        employee2.setsalary(salary2);
        System.out.println("");
        
        //display the original information for both employees
        System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f%n", employee1.getfirstName(), employee1.getlastName(), employee1.getsalary());
        System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f%n", employee2.getfirstName(), employee2.getlastName(), employee2.getsalary());
        
        //display that we are increasing the salary of both employees
        System.out.println("Increasing employee salary by 10%");
        
        //set the salary of both employees to show a 10% raise
        employee1.setsalary(salary1 * (1.1));
        employee2.setsalary(salary2 * (1.1));
        
        //print out the updated information for the employees
        System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f%n", employee1.getfirstName(), employee1.getlastName(), employee1.getsalary());
        System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f%n", employee2.getfirstName(), employee2.getlastName(), employee2.getsalary());
    }
}