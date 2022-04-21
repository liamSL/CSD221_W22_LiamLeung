package liam_leung_test4_practical.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author liaml_000
 */
@Entity
public class Square extends Shape {

    @Basic
    private String thelength;
    @Basic
    private String width;

    public String getThelength() {
        return thelength;
    }

    public void setThelength(String thelength) {
        this.thelength = thelength;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }
    public void PrintArea(){
    System.out.println(Integer.parseInt(width)*Integer.parseInt(thelength));
    }
}