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
public class Educationbill_factory extends Abstractbill_factory
{

    @Override
    public WaterbillInterface getWaterbill(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    @Override
    public ElectricitybillInterface getElectricitybill(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    @Override
    public EducationbillInterface getEducationbill(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(i == 1)
        {
            return new AhmEducationbill();
        }
        else if(i == 2)
        {
            return new RajkotEducationbill();
        }
        else if(i == 3)
        {
            return new SuratEducationbill();
        }
        else
        {
            return null;
        }
    }
    
}
