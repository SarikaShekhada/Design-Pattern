/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author HP
 */
public class Proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        internet i=new p_internet();
        try
        {
            i.doConnect("SARIKA.org");
            i.doConnect("AAA.com");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    
}
