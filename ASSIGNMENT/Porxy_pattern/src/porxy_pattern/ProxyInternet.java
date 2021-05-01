/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porxy_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ProxyInternet implements Internet{
    
    private Internet i=new RealInternet();
    
    private static List<String> bann;
    
    static 
    {
        bann=new ArrayList<String>();
        bann.add("abc.com");
        bann.add("xxx.xom");
    }

    @Override
    public void ConnectTo(String server) throws Exception {
        if(bann.contains(server.toLowerCase()))
        {
            //throw new Exception("Access denied");
            System.out.println("Access denied");
        }
        
        i.ConnectTo(server);
    }
    
    
}
