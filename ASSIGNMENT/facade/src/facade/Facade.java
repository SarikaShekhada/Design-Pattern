/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author HP
 * 
 */
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
public class Facade {

    /**
     * @param args the command line arguments
     */
    private static int  choice; 
    public static void main(String[] args) throws IOException 
    {
         System.out.print("========= Mobile Shop ============ \n");  
         System.out.print("            1. IPHONE.              \n");  
         System.out.print("            2. SAMSUNG.              \n");  
         System.out.print("            3. BLACKBERRY.            \n");  
       
         System.out.print("Enter your choice: ");  
         
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
         choice=Integer.parseInt(br.readLine());  
         Shopkeeper sk=new Shopkeeper();  
         
         switch (choice) 
         {  
            case 1:  
            {   
                sk.IphoneSale();  
            }  
            break;  
            case 2:  
            {  
                sk.SamsungSale();        
            }  
            break;    
            case 3:  
            {  
                sk.BlackberrySale();       
            }  
            break;     
            default:  
            {    
                System.out.println("Nothing You purchased");  
            }         
             return;  
        }  
    }
    
}
