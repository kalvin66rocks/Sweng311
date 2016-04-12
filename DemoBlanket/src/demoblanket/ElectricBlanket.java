/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoblanket;

/**
 *
 * @author kalvi_000
 */
public class ElectricBlanket extends Blanket{
    private int auto_shutoff;
    private int heat_setting;
    
    public ElectricBlanket()
    {
        super();
        this.auto_shutoff = 0;
        this.heat_setting = 1;
    }
    
    //sets our heat setting and keeps it in an appropriate range
    public void setheat_setting(int setting)
    {
        this.heat_setting = setting;
        if( setting <1 || setting >5)
            this.heat_setting = 1;   
    }
    
    //sets whether or not we have auto shutoff and adjusts the price
    public void setauto_shutoff(int shutoff)
    {
        if(shutoff == 1 && auto_shutoff == 0)
            super.update_price(5.75);
        if(shutoff == 0 && auto_shutoff == 1)
            super.update_price(-5.75);
        this.auto_shutoff = shutoff;
    }
    
    //returns whether or not we have auto shutoff
    public int getauto_shutoff()
    {
        return auto_shutoff;
    }
    //returns what the heat setting is
    public int getheat_setting()
    {
        return heat_setting;
    }
    
    //to string method for this class
    @Override
    public String toString()
    {
        return String.format("%s Heat setting:%d Automatic Shutoff:%d", super.toString(), heat_setting, auto_shutoff);
    }
}
