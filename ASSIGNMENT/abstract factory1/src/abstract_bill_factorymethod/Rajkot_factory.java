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
public class Rajkot_factory extends AbstractCompany_factory
{

    @Override
    public WaterbillInterface geWaterbill(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new Rajkotwaterbill();
    }

    @Override
    public ElectricitybillInterface getElectricitybill(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new RajkotElectricitybill();
    }

    @Override
    public EducationbillInterface getEducationbill(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new RajkotEducationbill();
    }
    
}
