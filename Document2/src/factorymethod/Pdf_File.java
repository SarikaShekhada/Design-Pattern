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

import com.sun.javafx.font.FontFactory;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

//import com.itextpdf.text.pdf.PdfWriter;
public class Pdf_File implements Document
{ 
    public void CreateDocument() 
    {
	PDDocument document = new PDDocument();
	document.addPage(new PDPage());
        try {
            document.save("C://Demo/FirstPdf.pdf");
        } catch (IOException ex) {
            Logger.getLogger(Pdf_File.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        System.out.println("PDF created");
        try { 
            document.close();
        } catch (IOException ex) {
            Logger.getLogger(Pdf_File.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
   
}        