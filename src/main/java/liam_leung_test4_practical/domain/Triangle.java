package liam_leung_test4_practical.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author liaml_000
 */
@Entity
public class Triangle extends Shape {

    @Basic
    private String base;
    @Basic
    private String height;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
    public void PrintArea(){
    System.out.println((Integer.parseInt(base)*Integer.parseInt(height))/2);
    }
}