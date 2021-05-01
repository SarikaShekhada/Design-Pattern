/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class p_internet implements internet
{

    private internet i=new Connectedinternet();
    private static List<String> bann;
    
    static 
    {
        bann=new ArrayList<String>();
        bann.add("abc.com");
        bann.add("def.com");
        bann.add("ghi.com");
        bann.add("jkl.com");
        bann.add("mno.com");
        bann.add("pqr.com");
        bann.add("stu.com");
        bann.add("vwx.com");
        bann.add("yz1.com");
        bann.add("aaa.com");
        
    }
    @Override
    public void doConnect(String url) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(bann.contains(url.toLowerCase()))
        {
              throw new Exception("Access denied");
        }
        i.doConnect(url);
    }
    
}
