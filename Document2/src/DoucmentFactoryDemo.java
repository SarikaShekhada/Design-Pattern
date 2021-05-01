/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod1;

import javax.swing.text.Document;

/**
 *
 * @author AVANI
 */
import java.util.*;
public class DoucmentFactoryDemo {
    public static void main(String[] args)throws Exception
	{ 
		
             int ch;
            Scanner s=new Scanner(System.in);
             System.out.println("1.Excel File");
             System.out.println("2.Word File");
             System.out.println("3.PDF File");
             System.out.print("Enter your Document File=");
             ch=s.nextInt();
        
            Document1 d;
            d=DocumentFactory.getFile(ch);
            d.Create();
        }
}
