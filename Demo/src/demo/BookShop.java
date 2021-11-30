/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kaushalya
 */
public class BookShop implements Cloneable{
    private String shopName;
    List <Book> books = new ArrayList<>();
    
     public void setShopName(String shopName){
        this.shopName = shopName;
    }
    public String getShopName(){
        return shopName;
    }
    public void setBooks(List<Book> books){
        this.books = books;
    }
    public List<Book> getBooks(){
        return books;
    }
    
    public void loadData()
    {
        for(int i=1;i<=5;i++){
            Book b = new Book();
            b.setBid(i);
            b.setBname("Book "+i);
            getBooks().add(b);
        }
    }
    
    @Override
    public String toString(){
        return "BookShop[shopName="+shopName+",books="+books+"]";
    }
    
    @Override
    protected BookShop clone() throws CloneNotSupportedException{
        //return super.clone();
        
        BookShop shop = new BookShop();
        for(Book b:this.getBooks())
        {
            shop.getBooks().add(b);
        }
        return shop;
    }
    
}
