/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementopatterndemo;

/**
 *
 * @author AVANI
 */
public class MementoPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Originator o=new Originator();
        CareTaker c=new CareTaker();
        
        o.setState("State 1");
        o.setState("State 2");
        
        c.add(o.SaveStateToMemento());
        o.setState("State 3");
        
        c.add(o.SaveStateToMemento());
        o.setState("State 4");
        
        System.out.println("Current State =" + o.getState());
        
        o.getStateFromMemento(c.get(0));
        System.out.println("First Saved State =" +o.getState());
        o.getStateFromMemento(c.get(1));
        System.out.println("Second Saved State =" +o.getState());
    }
    
}
