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
import java.util.Scanner;
public class Abstractbillfactory_method 
{
    public static void main(String [] args) {
        Abstractbill_factory b;
        WaterbillInterface w;
        ElectricitybillInterface e;
        EducationbillInterface ed;
        Scanner s=new Scanner(System.in);
        int c1,c2;
        
        System.out.println("---BILL---");
        System.out.println("1.Water Bill");
        System.out.println("2.Electricity Bill");
        System.out.println("3.Education Bill");
        System.out.println("");
        System.out.print("Choose any bill:-- ");
        c1=s.nextInt();
        
        System.out.println("");
        System.out.println("---COMPANY---");
        System.out.println("1.Rajkot Compony");
        System.out.println("2.Ahemdabad Company");
        System.out.println("3.Surat Company");
        System.out.println("");
        System.out.print("Choose any Company:-- ");
        c2=s.nextInt();
        
        System.out.println("");
        b=Abstractbill_factory.getbill(c1);
        if(c1 == 1)
        {
            w=b.getWaterbill(c2);
            System.out.println("WATER BILL = " +w.getpay());
        }
       
        
       //b=Abstractbill_factory.getbill(c1);
        else if(c1 == 2)
        {
            //b=Abstractbill_factory.getbill(c1);
            e=b.getElectricitybill(c2);
            System.out.println("ELECTRICITY BILL = " +e.getpay());
        }
        
        else
        {
            ed=b.getEducationbill(c2);
            System.out.println("EDUCATION BILL = " +ed.getpay());
        }
    }
}
