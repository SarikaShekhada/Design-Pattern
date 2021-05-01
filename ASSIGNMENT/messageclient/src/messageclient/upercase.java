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
public class upercase extends decorator
{
     public upercase(message bMsg)
    {
        super(bMsg);
    }
    @Override
    public String getMessage()
    {
       return decoratorMsg.getMessage() + "  GUJARAT VIDYAPITH IS 100 YEARS OLD UNIVERCITY";
    }
    
}
