/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_part2;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import lab2_part2.entities.Customer_1;
import lab2_part2.entities.Employee_1;
import lab2_part2.entities.Person_1;



/**
 *
 * @author liaml_000
 */
public class Main {
public static void main(String[] args) {
        EntityManagerFactory emf=null;
        EntityManager em=null;
        
        try{
            emf=Persistence.createEntityManagerFactory("Lab2Part2");
            em=emf.createEntityManager();
            Logger.getLogger(Main.class.getName()).log(Level.INFO, "Entity Manager created ("+emf+")");
            em.getTransaction().begin();
            
            Customer_1 c=new Customer_1();
            c.setFirstName("Matthias");
            c.setLastName("David");
            c.setSIN(1111111);
            c.setCredit_card_number("1111-1111-1111-1111");
            c.setCust_id("123");
            em.persist(c);
            
            Customer_1 c2=new Customer_1();
            c2.setFirstName("Joel");
            c2.setLastName("Peister");
            c2.setSIN(2222222);
            c2.setCredit_card_number("1111-1111-1111-1111");
            c2.setCust_id("123");
            em.persist(c2);
            
            Employee_1 e=new Employee_1();
            e.setFirstName("Liam");
            e.setLastName("Leung");
            e.setSIN(3333333);
            e.setSalary("$15.00");
            e.setTitle("cashier");
            em.persist(e);
            
            List<Customer_1> ListOfCustomer_1 = em.createQuery("SELECT c FROM Customer_1 c").getResultList();
            System.out.println("List of Customer_1");
            for(Customer_1 customer:ListOfCustomer_1){
                System.out.println(customer.getFirstName());
            }
            
            List<Employee_1> ListOfEmployee_1s = em.createQuery("SELECT e FROM Employee_1 e").getResultList();
            System.out.println("List of Employee_1s");
            for(Employee_1 employee:ListOfEmployee_1s){
                System.out.println(employee.getFirstName());
            }
            
            List<Person_1> ListOfPeople = em.createQuery("SELECT p FROM Person_1 p").getResultList();
            System.out.println("List of People");
            for(Person_1 person:ListOfPeople){
                System.out.println(person.getFirstName());
            }
        }catch(Exception e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            if(emf!=null)
                emf.close();
        }
    }
}
