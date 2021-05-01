/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentfactory_demo;

/**
 *
 * @author HP
 */
public class Document_Factory
{
    public static Document getfile(int type)
    {
        if(type == 1)
        {
            return new Excel_file();
        }
        else if(type == 2)
        {
            return new Word_file();
        }
       else if(type == 3)
        {
            return new Pdf_file();
        }
       else if(type == 4)
        {
            return new Text_file();
        }
       else 
       {
           return null;
       }
        
        
    }
}
