/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package factorymethod;
package org.apache.poi.xwpf.usermodel;
/**
 *
 * @author HP
 */
import factorymethod.Document;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class Word_File implements Document
{  

    @Override
    public void CreateDocument() {
        
        System.out.println("create in word");
        
       //Blank Document
      XWPFDocument document = new XWPFDocument();

      //Write the Document in file system
      FileOutputStream out = null;
        try {
            out = new FileOutputStream ( new File("E:\\Demo\\First.docx"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Word_File .class.getName()).log(Level.SEVERE, null, ex);
        }
      
      document.write(out);
        try {
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(Word_File .class.getName()).log(Level.SEVERE, null, ex);
        }
      
      System.out.println("createdocument.docx written successully"); 
       

    }

    @Override
    public void Open() {
        System.out.println("open in word");
        
        //Create file object

        File file = new File("E:\\Demo\\createdocument.docx");

        try {
           //Open the file using Desktop class

            Desktop.getDesktop().open(file);

        }catch (IOException exception){

            exception.printStackTrace();

        }
        System.out.println("open in word"); 
        
        
    }

    @Override
    public void Write() {
        System.out.println("write in word");
        //Blank Document
      XWPFDocument document = new XWPFDocument();

      //Write the Document in file system
      FileOutputStream out = null;
        try {
            out = new FileOutputStream(new File("E:\\Demo\\createdocument.docx"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Word_File .class.getName()).log(Level.SEVERE, null, ex);
        }

      //create Paragraph
      XWPFParagraph paragraph = document.createParagraph();
      XWPFRun run = paragraph.createRun();
      run.setText("At tutorialspoint.com, we strive hard to " +
         "provide quality tutorials for self-learning " +
         "purpose in the domains of Academics, Information " +
         "Technology, Management and Computer Programming Languages.");

      document.write(out);
        try {
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(Word_File .class.getName()).log(Level.SEVERE, null, ex);
        }
      System.out.println("createparagraph.docx written successfully");
      
        
    }
}

 

