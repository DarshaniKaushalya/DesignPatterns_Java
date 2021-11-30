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
public class HyundaiCarFactory implements CarFactory{

    @Override
    public Car createCar(String carType) {
         if(carType.equals("I10"))
            return new I10();
        else if(carType.equals("I20"))
            return new I20();
        else
            return null;
    }
    
}
