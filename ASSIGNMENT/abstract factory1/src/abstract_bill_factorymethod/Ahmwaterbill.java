/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_bill_factorymethod;

/**
 *
 * @author HP
 */
public class Ahmwaterbill implements WaterbillInterface
{
    double l,h;

    public Ahmwaterbill() 
    {
        l=40;
        h=24;
    }
    @Override
    public double getpay() {
        return l * ( h * 30) / 1000 * 10;
    }
    
    @Override
    public double setliter(double l) 
    {
       this.l=l;
       return 0;
    }

    @Override
    public double sethour(double h) 
    {
       this.h=h;
       return 0;
    }

    
}
