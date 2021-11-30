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
public class FactoryProducer {
    public static CarFactory getCarFactory(String factoryType){
           if(factoryType.equals("hyundai"))
            return new HyundaiCarFactory();
        else if(factoryType.equals("honda"))
            return new HondaCarFactory();
        else
            return null;
    }
    
}
