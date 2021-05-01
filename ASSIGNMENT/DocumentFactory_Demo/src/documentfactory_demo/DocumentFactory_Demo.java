/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentfactory_demo;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DocumentFactory_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        Document d;
        Scanner s=new Scanner(System.in);
        System.out.println("EXCEL FILE");
        System.out.println("WORD FILE");
        System.out.println("PDF FILE");
        System.out.println("TEXT FILE");
        System.out.println("Enter your choice:");
        int ch=s.nextInt();
        
        d=Document_Factory.getfile(ch);
        d.create();
        d.open();
        d.write();
        d.close();
        
        
    }
    
}
