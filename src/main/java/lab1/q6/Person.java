/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.q6;

/**
 *
 * @author liaml_000
 */
public class Person {
    private String firstname;
    private String lastname;
    private long SIN;
    
    public Person(String fn, String ln, long S){
        setfname(fn);
        setlname(ln);
        setSIN(S);
    }
    
    public String getfname(){
        return this.firstname;
    }

    public void setfname(String fnam){
        this.firstname = fnam;
    }

    public String getlname(){
        return this.lastname;
    }

    public void setlname(String lnam){
        this.lastname = lnam;
    }

    public long getSIN(){
        return this.SIN;
    }
    
    public void setSIN(long S){
        this.SIN = S;
    }
}
