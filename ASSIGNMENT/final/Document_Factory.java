/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

//import javax.swing.text.Document;

import org.apache.poi.xwpf.usermodel.WordFile;


/**
 *
 * @author HP
 */

public class Document_Factory{
    
    public static Document getFile(int FileType)
    { 
        
        if(FileType == 1)
        {
            return new Excel_File();
        } 
        else if(FileType == 2)
        {
            return  new Word_File();
        }
	else if(FileType == 3)
        {
            return new Text_File();
        }
        else if(FileType == 4)
        {
            return new Pdf_File();
        }
        else 
        { 
            return null;
         }
       
    } 
}
