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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author HP
 */
public class Excel_File implements Document
{
    Excel_File()
    {
        System.out.println("Excel COntructor");
    }
  
    
      public void CreateDocument() 
     {
        //HSSFWorkbook wb = new HSSFWorkbook();   
	File f = new File("C:\\Demo\\B.xlsx"); 
        WritableWorkbook myexcel = null;
         try {
             myexcel = Workbook.createWorkbook(f);
         } catch (IOException ex) {
             Logger.getLogger(Excel_File.class.getName()).log(Level.SEVERE, null, ex);
         }
        System.out.println("Excel File has been created successfully.");   
         try {
             //wb.write(fileOut);
             myexcel.write();
         } catch (IOException ex) {
             Logger.getLogger(Excel_File.class.getName()).log(Level.SEVERE, null, ex);
         }
         try {
             myexcel.close();
         } catch (IOException ex) {
             Logger.getLogger(Excel_File.class.getName()).log(Level.SEVERE, null, ex);
         } catch (WriteException ex) {
             Logger.getLogger(Excel_File.class.getName()).log(Level.SEVERE, null, ex);
         }
    } 

    //@Override
    public Document getFile(String excelfile)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }
     /*public void CreateDocument() {
               System.out.println("in the method");
        //Create Blank workbook
      XSSFWorkbook workbook = new XSSFWorkbook();

      //Create file system using specific name
      FileOutputStream out = null;
       try {
           out = new FileOutputStream(new File("C:/Demo/createBlankWorkBook.xlsx"));
       } catch (FileNotFoundException ex) {
           Logger.getLogger(ExcelFile.class.getName()).log(Level.SEVERE, null, ex);
       }

      //write operation workbook using file out object
      workbook.write(out);
       try {
           out.close();
       } catch (IOException ex) {
           Logger.getLogger(ExcelFile.class.getName()).log(Level.SEVERE, null, ex);
       }
      System.out.println("createworkbook.xlsx written successfully");


     }

    private static class XSSFWorkbook {

        public XSSFWorkbook() {
        }

        private void write(FileOutputStream out) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }*/
}