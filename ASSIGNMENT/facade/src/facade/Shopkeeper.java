/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author HP
 */
public class Shopkeeper 
{
    private mobileshop Iphone;  
    private mobileshop Samsung;  
    private mobileshop Blackberry;
    
    public Shopkeeper()
    {  
        Iphone= new Iphone();  
        Samsung=new Samsung();  
        Blackberry=new Blackberry();  
    }  
    
    public void IphoneSale(){  
        Iphone.modelNo();  
        Iphone.price();  
    }  
    
    public void SamsungSale(){  
        Samsung.modelNo();  
        Samsung.price();  
    }  
    
     public void BlackberrySale(){  
        Blackberry.modelNo();  
        Blackberry.price();  
    }  
}
