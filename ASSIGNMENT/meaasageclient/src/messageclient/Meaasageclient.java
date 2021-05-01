/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageclient;

/**
 *
 * @author HP
 */
public class Meaasageclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        // TODO code application logic here
        message msg = new mymessage() ;
        System.out.println(msg.getMessage());
        message msg1 = new reverse( new UpperCase( new LowerCase( new mymessage())));
        System.out.println(msg1.getMessage());
    
}
