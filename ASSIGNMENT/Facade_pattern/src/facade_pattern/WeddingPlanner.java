/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade_pattern;

/**
 *
 * @author HP
 */
public class WeddingPlanner {
    
    private Hall h;
    private Photographer p;
    
    public WeddingPlanner()
    {
        h=new Hall();
        p=new Photographer();
    }
    
    public void hallBook()
    {
        h.book();
    }
    
    public void photographerBook()
    {
        p.book();
    }
    
}
