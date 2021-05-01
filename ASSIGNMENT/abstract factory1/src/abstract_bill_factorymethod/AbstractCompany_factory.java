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
public abstract class AbstractCompany_factory
{
    public abstract WaterbillInterface geWaterbill(int i);
    public abstract ElectricitybillInterface getElectricitybill(int i);
    public abstract EducationbillInterface getEducationbill(int i);
    
    public static AbstractCompany_factory getCompany(int i)
    {
        if(i == 1)
        {
            return new Ahm_factory();
        }
        else if(i == 2)
        {
            return new Rajkot_factory();
        }
        else if(i == 3)
        {
            return  new Surat_factory();
        }
        else
        {
            return null;
        }
    }
}
