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
public abstract class Abstractbill_factory {
    public abstract WaterbillInterface getWaterbill(int i);
    public abstract ElectricitybillInterface getElectricitybill(int i);
    public abstract EducationbillInterface getEducationbill(int i);
    
    public static Abstractbill_factory getbill(int i)
    {
        if(i == 1)
        {
            return new Waterbill_factory();
        }
        else if(i == 2)
        {
            return new Electricitybill_factory();
        }
        else if(i == 3)
        {
            return new Educationbill_factory();
        }
        else
        {
            return null;
        }
    }
}
