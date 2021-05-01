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
public class Educatinal implements interfacetax
{
     double amount;
    
    @Override
    public double getInterest(double amount) {
        return (amount * 18)/100;
        
    }
}
