/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.entities;

import lab5.*;



/**
 *
 * @author liaml_000
 */
public class publication extends saleableItem {
    public publication(){}
    
    private String title;
    private double price;
    private int copies;
    
    public String getTitle(){
    return this.title;
    }
    
    public void setTitle(String title){
    this.title = title;
    }
    
    public double getPrice(){
    return this.price;
    }
    
    public void setPrice(double price){
    this.price = price;
    }
    
    public int getCopies(){
    return this.copies;
    }
    
    public void setCopies(int copies){
    this.copies = copies;
    }
    
    public void sellCopy(){
    this.copies = this.copies -= 1;
    }
    
    public String toString(){
    String R =title + " " + price + " " + copies;
    return R;
    }
}
