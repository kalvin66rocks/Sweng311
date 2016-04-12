/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemo;

/**
 *
 * @author kalvi_000
 */
public class StudentDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declares a new array of students;
        Student[] student = new Student [6];
        
        //creates an object for each element of the array
        student[0] = new UndergraduateStudent(8986709,"Smith");
        student[1] = new UndergraduateStudent(1234567,"Johnson");
        student[2] = new GraduateStudent(8912345,"Williams");
        student[3] = new GraduateStudent(6789123,"Brown");
        student[4] = new StudentAtLarge(9876543,"Jones");
        student[5] = new StudentAtLarge(2109876,"Miller");
        
        //for loop to call setTuition and to print out each element int array
        for ( int i = 0; i < 6; i++)
        {
            student[i].setTuition();
            System.out.printf("%s\n", student[i].toString());
        }
        
        
        
    }
    
}
