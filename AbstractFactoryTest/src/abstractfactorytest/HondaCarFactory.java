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
public class HondaCarFactory implements CarFactory{

    @Override
    public Car createCar(String carType) {
        if(carType.equals("brio"))
            return new Brio();
        else if(carType.equals("city"))
            return new City();
        else
            return null;
    }
    
}
