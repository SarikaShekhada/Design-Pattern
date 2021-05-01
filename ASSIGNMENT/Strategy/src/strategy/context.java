/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author HP
 */
public class context 
{
    private interfacetax t;
    
    public double Tax(interfacetax t)
    {
        this.t=t;
        return 0;
        
    }

    
    public double ExecuteStrategy(double amount)
    {
         return t.getInterest(amount);
    }

   
}
