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
public class book extends publication {
    public book(){}
     
    private String author;
    
    public String getAuthor(){
    return this.author;
    }
    
    public void setAuthor(String author){
    this.author = author;
    }
    
    public void orderCopies(int numCopies){
        int num = numCopies + getCopies();
        setCopies(num);
    }
}
