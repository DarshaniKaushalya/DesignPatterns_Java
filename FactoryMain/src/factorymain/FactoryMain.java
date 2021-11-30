/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymain;

/**
 *
 * @author Kaushalya
 */
public class FactoryMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperatingSystemFactory osf = new  OperatingSystemFactory();
        OS obj = osf.getDetails();
        obj.cal();
    }
    
}
