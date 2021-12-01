/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author Kaushalya
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pen p = new PenAdapter();
        AssignmentWork as = new AssignmentWork();
        as.setPen(p);
        as.writeAssignment("I am writing");
    }
    
}
