/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singltonpattern;

/**
 *
 * @author Kaushalya
 */
public class Singleton {
    public static Singleton obj = new Singleton();
    
    private Singleton(){
        
    }
    
    public static Singleton getDetails()
    {
        return obj;
    }
    public void printDetails()
    {
        System.out.println("Hello World Kaushalya");
    }
    
}
