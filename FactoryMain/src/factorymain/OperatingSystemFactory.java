/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymain;

import java.util.Scanner;

/**
 *
 * @author Kaushalya
 */
public class OperatingSystemFactory {
    public OS getDetails(){
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter your choise");
            String output = myObj.nextLine();  // Read user input
           
            //System.out.println("Choise: " + userName);  // Output user input
            
//        if(str.equals("Open"))
//            return new Android();
//        else if(str.equals("Closed"))
//            return new IOS();
//        else
//            return new Windows();

    if(output.equals(""))
       return new zero();
    
       else if(output.equals("Open"))
            return new Android();
       else if("Closed".equalsIgnoreCase(output))
            return new IOS();
   
       else
            return new Windows();
    }
    
}
