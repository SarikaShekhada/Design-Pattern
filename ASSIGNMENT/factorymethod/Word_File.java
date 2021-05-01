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
import java.io.FileOutputStream;
public class Word_File implements Document
{ 
	@Override public void CreateDocument() 
	{ 
            
	    //XWPFDocument document = new XWPFDocument();
           // FileOutputStream out = new FileOutputStream (new File("C://Demo//FirstWord.docx"));
           // document.write(out);
            //out.close();
	} 

   // @Override
    public Document getFile(String excelfile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
