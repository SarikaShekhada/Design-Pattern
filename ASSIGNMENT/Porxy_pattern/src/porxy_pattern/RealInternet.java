/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porxy_pattern;

/**
 *
 * @author HP
 */
public class RealInternet implements Internet{

    @Override
    public void ConnectTo(String server) throws Exception {
        System.out.println("Connecting to server......");
    }
    
}
