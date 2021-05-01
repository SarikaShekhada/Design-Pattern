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
public class AhmElectricitybill implements ElectricitybillInterface
{
    double u,h;

    public AhmElectricitybill() {
        u=10;
        h=24;
    }

    //AhmElectricitybill() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
    @Override
    public double getpay() {
        return u * ( h * 30) / 1000 * 7;
    }
    
    @Override
    public double setunits(double u) {
        this.u=u;
        return 0;
    }

    @Override
    public double sethour(double h) {
        this.h=h;
        return 0;
    }

    
    
}
