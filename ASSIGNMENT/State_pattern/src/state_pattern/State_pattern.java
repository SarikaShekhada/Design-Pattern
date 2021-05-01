/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state_pattern;

/**
 *
 * @author HP
 */
public class State_pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Context c=new Context();
        
        c.alert();
        c.alert();
        
        c.setState(new Slient());
        
        c.alert();
        c.alert();
        
        c.setState(new Mute());
        
        c.alert();
        
        
    }
    
}
