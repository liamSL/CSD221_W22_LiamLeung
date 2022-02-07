package lab2_part2.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
public class Customer_1 extends Person_1 {

    @Basic
    private String credit_card_number;
    @Basic
    private String cust_id;

    public String getCredit_card_number() {
        return credit_card_number;
    }

    public void setCredit_card_number(String credit_card_number) {
        this.credit_card_number = credit_card_number;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

}