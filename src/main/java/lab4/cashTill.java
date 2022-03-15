/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author liaml_000
 */
public class cashTill {
    private double running_total = 0;
    
    public void addToTotal(double add){
        running_total += add;
    }
}
