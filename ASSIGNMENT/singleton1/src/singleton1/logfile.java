/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton1;

import java.util.logging.Level;
import java.util.logging.*; 
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class logfile
{
    public static void main(String[] args) 
    {

        MultiThread();
    }

    /**
     *
     */
    public static void MultiThread() 
    {
        LogManager lgmngr = LogManager.getLogManager(); 
        
        Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME); 
         Thread1 t = new Thread1(new Runnable()
        {
            public void run() 
            { 
                 thread t1 = thread.getInstance();
                log.log(Level.INFO, "message 1.."); 
                 t1.makeSomeLog();
            }
        });
 
        Thread1 t2 = new Thread1(new Runnable()
        {
            public void run()
            {
                thread t1 = thread.getInstance();
                log.log(Level.INFO,"message 2..");
                t1.makeSomeLog();
            }
        });
         
        t.start();
        t2.start();
    }
}
