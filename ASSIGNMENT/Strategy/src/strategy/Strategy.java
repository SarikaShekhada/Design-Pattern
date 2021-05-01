/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author HP
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        context c=new context();
        c.Tax(new Educatinal());
       System.out.println("edutional = " + c.ExecuteStrategy(5000));
       
       c.Tax(new Reseditanl());
       System.out.println("Resediantal = " + c.ExecuteStrategy(1500));
        
       c.Tax(new HealthCare());
       System.out.println("HealthCare = " + c.ExecuteStrategy(900));
       
       c.Tax(new Commercial());
       System.out.println("Commercial = " + c.ExecuteStrategy(2000));
    }
    
}
