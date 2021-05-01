/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author HP
 */

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Text_File implements Document
{ 
	public void CreateDocument() 
	{
            File file = new File("C:\\demo\\first.txt"); 
            boolean result = false;
            try {
                result = file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Text_File.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(result)
            {  
                try {
                    System.out.println("file created "+file.getCanonicalPath());
                } catch (IOException ex) {
                    Logger.getLogger(Text_File.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
            else  
            {  
                try {  
                    System.out.println("File already exist at location: "+file.getCanonicalPath());
                } catch (IOException ex) {
                    Logger.getLogger(Text_File.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
	} 

	public void open() 
    	{
       		System.out.println("open in word");
        
        	//Create file object

       		 File file = new File("E:\\Demo\\first.txt");

        	Runtime rs=new Runtime.getRuntime();
		try
		{
			rs.exec("Notpad");
		}
		catch (IOException e)
		{
			e.printStackTrace()
		}
		System.out.println("open in Notepad"); 
    	}	

	@Override
   	public void Write() 
   	 {
       
        
  	 }

	
}
