/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author HP
 */
public class Samsung implements mobileshop
{

    @Override
    public void modelNo() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       System.out.println(" Samsung Galaxy ");  
    }

    @Override
    public void price() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println(" Rs 45000.00 ");  
    }
    
}
