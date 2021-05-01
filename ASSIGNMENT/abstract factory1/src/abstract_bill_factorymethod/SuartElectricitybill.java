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
public class SuartElectricitybill implements ElectricitybillInterface
{

    double u,h;

    public SuartElectricitybill() {
        u=10;
        h=24;
    }
    
    @Override
    public double getpay() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return u * ( h * 30) / 1000 * 7;
    }

    @Override
    public double setunits(double u) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         this.u=u;
        return 0;
    }

    @Override
    public double sethour(double h) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.h=h;
        return 0;
    }
    
}
