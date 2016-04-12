/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6problem2;

/**
 *
 * @author Kevin Brenneman
 */
public class DemoRunners {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runner [] runner = new Runner[6];
        
        runner[0] = new Machine();
        runner[1] = new Machine();
        runner[2] = new Athlete();
        runner[3] = new Athlete();
        runner[4] = new PoliticalCandidate();
        runner[5] = new PoliticalCandidate();
        
        for( int i = 0; i <6; i ++)
        {
            System.out.printf("The meaning of run for %s is to %s \n", runner[i].getClass(), runner[i].run());
        }
    }
    
}
