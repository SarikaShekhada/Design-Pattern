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
import java.io.IOException;  
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.pdmodel.PDPage;  
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class Pdf_File implements Document {

    @Override
    public void CreateDocument() {
          
        
        //Creating PDF document object 
      PDDocument document = new PDDocument();     
     
      //Add an empty page to it 
      document.addPage(new PDPage()); 
     
        try {
            //Saving the document
            document.save("E:\\Demo\\BlankPdf.pdf");
           
        } catch (IOException ex) {
            Logger.getLogger(Pdf_File.class.getName()).log(Level.SEVERE, null, ex);
        }
      System.out.println("PDF created");  
      
        try {
            //Closing the document
            document.close();
        } catch (IOException ex) {
            Logger.getLogger(Pdf_File.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    @Override
    public void Open() {
        
         File pdfFile = new File("E:\\Demo\\BlankPdf.pdf");
        if (pdfFile.exists()) {

            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().open(pdfFile);
                } catch (IOException ex) {
                    Logger.getLogger(Pdf_File.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("Awt Desktop is not supported!");
            }

        } else {
            System.out.println("File is not exists!");
        }

        System.out.println("Done");
      

      } 

    @Override
    public void Write() {
             
      
      //Loading an existing document 
      PDDocument doc = null; 
        try {
            doc = PDDocument.load(new File("E:\\Demo\\BlankPdf.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(Pdf_File.class.getName()).log(Level.SEVERE, null, ex);
        }

      //Creating a PDF Document 
      PDPage page = doc.getPage(0);       
      PDPageContentStream contentStream = null; 
        try {
            contentStream = new PDPageContentStream(doc, page);
        } catch (IOException ex) {
            Logger.getLogger(Pdf_File.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        try {
            //Begin the Content stream
            contentStream.beginText();
        } catch (IOException ex) {
            Logger.getLogger(Pdf_File.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            //Setting the font to the Content stream
            contentStream.setFont( PDType1Font.TIMES_ROMAN, 16 );
        } catch (IOException ex) {
            Logger.getLogger(Pdf_File.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            //Setting the position for the line
            contentStream.newLineAtOffset(25, 725 );
        } catch (IOException ex) {
            Logger.getLogger(PDFFile.class.getName()).log(Level.SEVERE, null, ex);
        }
      String text = "This is an example of adding text to a page in the pdf document we can add as many lines as we want like this using the draw string method of the ContentStream class"; 

        try {
            //Adding text in the form of string
            contentStream.showText(text);
        } catch (IOException ex) {
            Logger.getLogger(PDFFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            //Ending the content stream
            contentStream.endText();
        } catch (IOException ex) {
            Logger.getLogger(PDFFile.class.getName()).log(Level.SEVERE, null, ex);
        }
      System.out.println("Content added");       

        try {
            //Closing the content stream
            contentStream.close();
        } catch (IOException ex) {
            Logger.getLogger(PDFFile.class.getName()).log(Level.SEVERE, null, ex);
        }

       
            //Saving the document
        //    doc.save(new File("E:\\avni\\BlankPdf.pdf"));
       

        try {
            //Closing the document
            doc.close();
        } catch (IOException ex) {
            Logger.getLogger(PDFFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
    
}
    

