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
public class Blanket {
    private double price;
    private String material;
    private String size;
    private String color;
    //this is used to keep track of the price modifier for size
    public double size_price;
    //this is used to keept track of the price modifier for the material
    public double material_price;
    
    //no arguement constructor that sets intial values
    public Blanket()
    {
        this.size = "twin";
        this.material = "cotton";
        this.color = "white";
        this.price = 30;
        
    }
    //sets the material fo the blanket
    public void setMaterial(String material)
    {
        switch(material.toLowerCase())
        {
            case "cotton":
                this.material = "cotton";
                if(material_price == 45)
                    this.price -= 45;
                if(material_price == 20)
                    this.price -= 20;
                material_price = 0;
                break;
            case "wool":
                this.material = "wool";
                if(material_price == 45)
                    this.price -= 25;
                if(material_price == 20)
                    this.price += 0;
                if(material_price == 0)
                    this.price += 20;
                material_price = 20;
                break;
            case "cashmere":
                this.material = "cashmere";
                if(material_price == 45)
                    this.price += 0;
                if(material_price == 20)
                    this.price += 25;
                if(material_price == 0)
                    this.price += 45;
                material_price = 45;
                break;  
            default:
                this.material = "cotton";
                this.size ="twin";
                this.color = "white";
                material_price = 0;
                this.price = 30;
                break;
        }
    }
    
    //sets the size of the blanket
    public void setSize(String size)
    {
        switch(size.toLowerCase())
        {
            case "twin":
                this.size = "twin";
                if(size_price == 40)
                    this.price -= 40;
                if(size_price == 25)
                    this.price -= 25;
                if(size_price == 10)
                    this.price -= 10;
                if(size_price == 0)
                    this.price += 0;
                size_price = 0;
                break;
            case "double":
                this.size = "double";
                if(size_price == 40)
                    this.price -= 30;
                if(size_price == 25)
                    this.price -= 15;
                if(size_price == 10)
                    this.price +=0;
                if(size_price == 0)
                    this.price += 10;
                size_price = 10;
                break;
            case "queen":
                this.size = "queen";
                if(size_price == 40)
                    this.price -= 15;
                if(size_price == 25)
                    this.price += 0;
                if(size_price == 10)
                    this.price += 15;
                if(size_price == 0)
                    this.price += 25;
                size_price = 25;
                break;
            case "king":
                this.size = "king";
                if(size_price == 40)
                   this.price += 0;
                if(size_price == 25)
                    this.price += 15;
                if(size_price == 10)
                    this.price += 30;
                if(size_price == 0)
                    this.price += 40;
                size_price = 40;
                break;
            default:
                this.material = "cotton";
                this.size = "twin";
                this.color = "white";
                size_price = 0;
                this.price = 30;
                break;
        }   
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public void update_price(double additional_charge)
    {
        this.price += additional_charge;
    }
    
    //to string method for this class
    @Override
    public String toString()
    {
        return String.format("Blanket Size:%s Color:%s Material:%s Price:%.2f", size, color, material, price);
    }
    
}
