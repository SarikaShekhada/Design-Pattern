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
public class lowercase extends decorator
{
     public lowercase(message bMsg)
    {
        super(bMsg);
    }
    @Override
    public String getMessage() 
    {
       return decoratorMsg.getMessage() + " gujarat vidyapith is 100 years old univercity";
    }
        
    
}
