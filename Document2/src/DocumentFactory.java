/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod1;

//import javax.swing.text.Document;

import org.apache.poi.xwpf.usermodel.WordFile;


/**
 *
 * @author AVANI
 */
public class DocumentFactory {
    
    public static Document1 getFile(int FileType)
    { 
        if(FileType == 1)
        {
            return new ExcelFile();
        } 
        else if(FileType == 2)
        {
            return  new WordFile();
        }
        else if(FileType == 3)
        {
            return new PDFFile();
        }
        else 
        { 
            return null;
         }
       
    } 
}
