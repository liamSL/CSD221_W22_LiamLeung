package lab2_part2.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
public class Employee_1 extends Person_1 {

    @Basic
    private String Title;
    @Basic
    private String Salary;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

}