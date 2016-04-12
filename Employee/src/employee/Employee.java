package employee;

/*
author Kevin Brenneman
 */
public class Employee 
{
    private String firstName;  //instance variable for first name
    private String lastName;   //instance variable for last name
    private double salary;     //instance variable for salary
    
    //method to set the first name
    public void setfirstName(String firstName)
    {
        this.firstName= firstName;
    }
    //method to get the first name
    public String getfirstName()
    {
        return firstName;
    }
    //method to set the last name
    public void setlastName(String lastName)
    {
        this.lastName= lastName;
    }
    //method to set the last name
    public String getlastName()
    {
        return lastName;
    }
    //method to set the salary
    public void setsalary(double salary)
    {
        if(salary <0 )
        {
            salary = 0;
        }
        else
        {
            this.salary= salary;
        }
    }
    //method to get the salary
    public double getsalary()
    {
        return salary;
    }
 }
