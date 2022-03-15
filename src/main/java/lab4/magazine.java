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
public class magazine extends publication{
    
    public magazine(){}
    
    public magazine(String title, double price, int orderQty, String currIssue, int copies)
    {
    setTitle(title);
    setPrice(price);
    adjustQty(orderQty);
    receiveNewIssue(currIssue);
    setCopies(copies);   
    }
    
    private int orderQty = 10;
    private String currIssue;
    
    public void adjustQty(int n){
    this.orderQty = n;
    }
    
    public void receiveNewIssue(String newIssue){
    this.currIssue = newIssue;
    }
    
    @Override
    public String toString(){
    String R = "Title: " + getTitle() + " currIssue: " + currIssue;
    return R;
    }
    
}
