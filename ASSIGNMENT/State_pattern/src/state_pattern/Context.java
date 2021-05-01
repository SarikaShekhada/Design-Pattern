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
public class Context {
    private IAlert i;
    
    public Context()
    {
        i=new Vibration();
    }
    
    public void setState(IAlert i)
    {
        this.i=i;
    }
    
    public void alert()
    {
        i.notify1(this);
    }
    
    
}
