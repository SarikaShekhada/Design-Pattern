/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade_pattern;

/**
 *
 * @author HP
 */
public class Facade_pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        WeddingPlanner w=new WeddingPlanner();
        
        w.hallBook();
        w.photographerBook();
    }
    
}
