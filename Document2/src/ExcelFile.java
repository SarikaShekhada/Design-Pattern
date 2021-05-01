/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod1;

/**
 *
 * @author AVANI
 */

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
public class ExcelFile implements Document1
{
    ExcelFile()
    {
        System.out.println("Excel COntructor");
    }
  
    @Override
    public void Create() {
               System.out.println("in the method");
        //Create Blank workbook
      XSSFWorkbook workbook = new XSSFWorkbook();

      //Create file system using specific name
      FileOutputStream out = null;
       try {
           out = new FileOutputStream(new File("C:/avni/createBlankWorkBook.xlsx"));
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
}
