/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_phase1;

/**
 *
 * @author Kevin Brenneman
 */
public class Student {
    private String first_name;
    private String last_name;
    private long phone_number;
    
public Student(String first_name, String last_name, long phone_number)
{
    this.first_name = first_name;
    this.last_name = last_name;
    this.phone_number = phone_number;
   
}

public String get_first()
{
    return first_name;
}

public String get_last()
{
    return last_name;
}

public long get_phone()
{
    return phone_number;
}

@Override
    public String toString()
    {
        return String.format("%s %s phone number %d ", first_name, last_name, phone_number);
    }
}
