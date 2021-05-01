/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade1;

/**
 *
 * @author HP
 */
public class draw {
    
    private Circle c;
    private Recentangle r;
    private Triangle t;
    
    public draw()
    {
        c=new Circle();
        r=new Recentangle();
        t=new Triangle();
        
    }
    
    public void Shape()
    {
        c.draw();
        r.draw();
        t.draw();
    }
}
