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
public class GVVC 
{

    //static GVVC mygvvc2;
    String name;
    int rollno;
    public static GVVC vc;
    
    private GVVC(String name)
    {
        this.name=name;
    }
    public int getrollno()
    {
        return rollno;
    }
    public void setrollno()
    {
        this.rollno=rollno;
    }
    public String getvc1()
    {
        return name + "rollno is" + rollno;
    }
     public static GVVC getInstance(String name)
    {
        if(vc == null)
        {
            vc = new GVVC(name);
        }
        return vc;
    }
    
     void setrollno(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
