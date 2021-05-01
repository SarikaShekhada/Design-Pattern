/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class thread 
{
    public static thread t1;
    private final static Logger LOGGER =  
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    
    static 
    {
        t1 = new thread();
    }
    private thread()
    {
    }
    public static thread getInstance()
    {
        return t1;
    }
    public void makesomelog()
    {
        LOGGER.log(Level.INFO, "Message 1"); 
        LOGGER.log(Level.INFO, "Message 2"); 
    }

    void makeSomeLog() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
