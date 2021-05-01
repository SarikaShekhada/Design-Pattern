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
public class Electricitybill_factory extends Abstractbill_factory
{

   @Override
    public ElectricitybillInterface getElectricitybill(int i)
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(i == 1)
        {
            return new AhmElectricitybill();
        }
        else if(i == 2)
        {
            return new RajkotElectricitybill();
        }
        else if(i == 3)
        {
            return new SuartElectricitybill();
        }
        else
        {
            return null;
        }
    }

    @Override
    public WaterbillInterface getWaterbill(int i)
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    @Override
    public EducationbillInterface getEducationbill(int i) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return null;
    }

   
    
}
