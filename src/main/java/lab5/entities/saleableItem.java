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

public class saleableItem extends cashTill {
    
    private double price;
    
    public void sellItem(){
        addToTotal(this.price);
    }
    
    
    public double getPrice(saleableItem s){
        return this.price;
    }
}