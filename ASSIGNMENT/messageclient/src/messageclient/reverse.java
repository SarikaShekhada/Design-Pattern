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
public class reverse extends decorator
{
     public reverse(message bMsg)
    {
        super(bMsg);
    }
    @Override
    public String getMessage() 
    {
        return decoratorMsg.getMessage() + "\n YTICREVINU DLO SRAEY 001si htipaydiv tarajug";
    }
    
}
