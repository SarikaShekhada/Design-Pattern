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

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Cell;
import jxl.Range;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.read.biff.PasswordException;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Excel_File implements Document
{
    Excel_File()
    {
        System.out.println("Excel Contructor");
    }
  
    @Override
    	public void CreateDocument()
	{
               System.out.println("in the method");
      		 //Create Blank workbook
      		XSSFWorkbook workbook = new XSSFWorkbook();

     	 //Create file system using specific name
     	 FileOutputStream out = null;
     	  try {
       	    out = new FileOutputStream(new File("E:\\Demo\\Book1.xlsx"));
      	 } catch (FileNotFoundException ex) {
      	     Logger.getLogger(Excel_File.class.getName()).log(Level.SEVERE, null, ex);
      	 }

    	  //write operation workbook using file out object
     	 workbook.write(out);
     	  try {
       	    out.close();
      	 } catch (IOException ex) {
        	   Logger.getLogger(Excel_File.class.getName()).log(Level.SEVERE, null, ex);
      	 }
      	System.out.println("createworkbook.xlsx written successfully");
      }

    @Override
    	public void Open() 
	{
        
      	  //Create file object

      	  File file = new File("E:\\Demo\\Book1.xlsx");

       	 try {
		//Open the file using Desktop class
		Desktop.getDesktop().open(file);

        }
	catch (IOException exception)
	{
		 exception.printStackTrace();
        }
}

    @Override
    public void Write() 
    {
       
        
    }
}
