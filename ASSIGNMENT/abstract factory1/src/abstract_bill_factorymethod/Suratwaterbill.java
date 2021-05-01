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
public class Suratwaterbill  implements WaterbillInterface
{

    double l,h;
    Suratwaterbill()
    {
        l=35;
        h=24;
    }
    @Override
    public double getpay() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return l * ( h * 30) / 1000 * 10;
    }

    @Override
    public double setliter(double l) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.l=l;
        return 0;
    }

    @Override
    public double sethour(double h) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.h=h;
        return 0;
    }
    
}
