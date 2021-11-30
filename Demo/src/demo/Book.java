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
public class Book {
    private int bid;
    private String bname;
    
    public void setBid(int bid){
        this.bid = bid;
    }
    public int getBid(){
        return bid;
    }
    public void setBname(String bname){
        this.bname = bname;
    }
    public String getBname(){
        return bname;
    }
    @Override
    public String toString(){
        return "Book[bid="+bid+",bname="+bname+"]";
    }
}
