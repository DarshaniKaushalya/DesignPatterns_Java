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
public class AssignmentWork {
    private Pen p;
    
    public void setPen(Pen p)
    {
        this.p = p;
    }
    public Pen getPen()
    {
        return p;
    }
    public void writeAssignment(String str){
        p.write(str);
    }

    
    
}
