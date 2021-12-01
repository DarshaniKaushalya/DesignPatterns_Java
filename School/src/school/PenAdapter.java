/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import school.kau.GelPen;

/**
 *
 * @author Kaushalya
 */
public class PenAdapter implements Pen{

    GelPen gp = new GelPen();
    
    @Override
    public void write(String str) {
        gp.mark(str);
    }
    
}
