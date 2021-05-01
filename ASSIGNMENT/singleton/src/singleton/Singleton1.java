/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author HP
 */
public class Singleton1 
{
    public static void main(String[] args) 
    {
       GVVC mygvvc=GVVC.getInstance("Aaliya's");
       mygvvc.setrollno(22);
      // System.out.println(mygvvc.getvc1());
        
        GVVC mygvvc1=GVVC.getInstance("Kuhu's");
        mygvvc.setrollno(25);
        
       GVVC mygvvc2=GVVC.getInstance("Misti's");
       mygvvc.setrollno(29);
        
       System.out.println(mygvvc.getvc1());
        System.out.println(mygvvc1.getvc1());
        System.out.println(mygvvc2.getvc1());    
    }
}
