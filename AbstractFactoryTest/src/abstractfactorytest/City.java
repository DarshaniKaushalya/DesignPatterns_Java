/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorytest;

/**
 *
 * @author Kaushalya
 */
public class City implements Car{

    @Override
    public void drive() {
        System.out.println("Hi City");
    }
    
}
