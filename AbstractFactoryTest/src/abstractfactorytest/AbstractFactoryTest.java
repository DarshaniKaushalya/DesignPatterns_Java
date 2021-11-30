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
public class AbstractFactoryTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarFactory honda = FactoryProducer.getCarFactory("honda");
        
        Car brio = honda.createCar("brio");
        brio.drive();
        
        Car city = honda.createCar("city");
        city.drive();
        
        CarFactory hyundaiCarFactory = FactoryProducer.getCarFactory("hyundai");
        
        Car I10 = hyundaiCarFactory.createCar("I10");
        I10.drive();
        
        Car I20 = hyundaiCarFactory.createCar("I20");
        I20.drive();
    }
    
}
