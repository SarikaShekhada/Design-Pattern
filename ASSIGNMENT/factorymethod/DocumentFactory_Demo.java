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

import java.util.Scanner;

public class DocumentFactory_Demo 
{
    public static void main(String[] args) throws Exception
    { 
		/*DocumentFactory documentFactory = new DocumentFactory();
              
                int ch = 0;
                Scanner in=new Scanner(System.in);
                
                System.out.println("1.EXCEL FILE");
                System.out.println("2.WORD FILE");
                System.out.println("3.PDF FILE");
                System.out.println("4.TEXT FILE");
                System.out.println("Enter your chioce:");
                ch=in.nextInt();
                Document d;
                d=DocumentFactory.getFile(ch);
                
                
                
			
		
		/*Document Word = documentFactory.getFile("WORDFILE");
		Word.CreateDocument(); 
		
		Document Pdf = DocumentFactory.getFile("PDFFILE"); 
		Pdf.CreateDocument(); 
		
		/*Document Text = documentFactory.getFile("TEXTFILE"); 
		Text.CreateDocument(); */
        
                 int ch;
            Scanner s=new Scanner(System.in);
             System.out.println("1.Excel File");
             System.out.println("2.Word File");
             System.out.println("3.PDF File");
             System.out.print("Enter your Document File=");
             ch=s.nextInt();
        
            Document d;
             //d=DocumentFactory.getFile(ch);
            //d.CreateDocument();
            
            Document Excel = Document_Factory.getFile("EXCELFILE");
		Excel.CreateDocument();	
	} 
}
