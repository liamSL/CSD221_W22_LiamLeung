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
public class discmag extends magazine{
    public discmag(String title, double price, int orderQty, String currIssue, int copies)
    {
    setTitle(title);
    setPrice(price);
    adjustQty(orderQty);
    receiveNewIssue(currIssue);
    setCopies(copies);
    }
    
    @Override
    public void receiveNewIssue(String newIssue)
    {
    receiveNewIssue(newIssue);   
    }
}
