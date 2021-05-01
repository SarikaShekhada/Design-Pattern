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
public class SuratEducationbill implements EducationbillInterface
{
    double f,y;

    public SuratEducationbill() {
        f=21000;
        y=3;
    }
    
    @Override
    public double getpay() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return f * y;
    }

    @Override
    public double setfee(double f) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.f=f;
        return 0;
    }

    @Override
    public double setfyear(double y) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       this.y=y;
       return 0;
    }
   
    
}
