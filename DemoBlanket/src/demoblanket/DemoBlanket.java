/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoblanket;

/**
 *
 * @author Kevin Brenneman
 */
public class DemoBlanket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Blanket blanket = new Blanket();
        
        ElectricBlanket electricblanket = new ElectricBlanket();
        
        System.out.printf("%s\n", blanket.toString());
        blanket.setColor("yellow");
        blanket.setSize("king");
        blanket.setMaterial("cashmere");
        System.out.printf("%s\n", blanket.toString());
        blanket.setColor("white");
        blanket.setSize("queen");
        blanket.setMaterial("wool");
        System.out.printf("%s\n", blanket.toString());
        blanket.setSize("twin");
        blanket.setMaterial("cotton");
        System.out.printf("%s\n", blanket.toString());
        
        System.out.printf("%s\n", electricblanket.toString());
        electricblanket.setMaterial("cashmere");
        electricblanket.setauto_shutoff(1);
        electricblanket.setheat_setting(4);
        System.out.printf("%s\n", electricblanket.toString());
        electricblanket.setMaterial("wool");
        electricblanket.setSize("double");
        electricblanket.setauto_shutoff(0);
        electricblanket.setheat_setting(3);
        System.out.printf("%s\n", electricblanket.toString());
    }
    
}
