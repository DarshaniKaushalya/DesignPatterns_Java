/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Kaushalya
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("Kau");
        bs.loadData();
      
        //System.out.println(bs);
        
       BookShop bs1 = bs.clone();
        bs.getBooks().remove(2);
        bs1.setShopName("Dar");
        //bs1.loadData();
        //bs.getBooks().remove(2);
        System.out.println(bs);
        System.out.println(bs1);
        
        
    }
    
}
