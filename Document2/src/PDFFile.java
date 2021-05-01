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
   import java.io.IOException;  
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.pdmodel.PDPage;  

public class PDFFile implements Document1 {

    @Override
    public void Create() {
          
        System.out.println("PDF in");
        //Creating PDF document object 
      PDDocument document = new PDDocument();     
     
      //Add an empty page to it 
      document.addPage(new PDPage()); 
     
        try {
            //Saving the document
            document.save("C:/avni/BlankPdf.pdf");
        } catch (IOException ex) {
            Logger.getLogger(PDFFile.class.getName()).log(Level.SEVERE, null, ex);
        }
      System.out.println("PDF created");  
      
        try {
            //Closing the document
            document.close();
        } catch (IOException ex) {
            Logger.getLogger(PDFFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
   
}
    

