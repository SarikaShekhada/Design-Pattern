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
public abstract class decorator implements message
{
   
   /* @Override
    public String getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
     protected message decoratorMsg;
        
    public decorator(message decoratorMsg)
    {
        this.decoratorMsg=decoratorMsg;
    }

}
