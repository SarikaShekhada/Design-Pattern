
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import javax.swing.text.Document;

/**
 *
 * @author HP
 */
import java.util.*;
public class DocumentFactory_Demo{
    public static void main(String[] args)throws Exception
	{ 
		
             int ch;
             Scanner s=new Scanner(System.in);
             System.out.println("1.Excel File");
             System.out.println("2.Word File");
	     System.out.println("3.TEXT File");
             System.out.println("4.PDF File");
             System.out.print("Enter your Document File=");
             ch=s.nextInt();
             
            Document d;
            d=Document_Factory.getFile(ch);
            d.Create();
            d.Open();
            d.Write();
            
            
        }
}
