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
import lab1.q6.Person;
import java.util.Scanner;
import java.util.ArrayList;
public class App {
    private ArrayList<Person> P = new ArrayList<Person>();
    private int currentIndex = 0;
    private Scanner input = new Scanner(System.in);
    private String menu = "Menu\n" +
            "1. Add a person\n" +
            "2. List people\n" +
            "3. Delete a person\n" +
            "0. exit\n";
    
    public void run(){
    boolean done = false;
        while(!done){
            System.out.println(menu);
            int opt;
       
            try{
                opt = input.nextInt();
            }
            catch(Exception e){
                System.out.println("Invalid input (not a number), try again...");
                continue;
            }
            
            switch(opt){
                case 1: addPerson();
                break;
                case 2: listPeople();
                break;
                case 3: deletePerson();
                break;
                case 0: done = true;
                break;
                default: System.out.println("Invalid input (number not in range), try again...");
                break;
            }
        }
    }
        
        public void addPerson(){
        System.out.println("What is the persons first name?:");
        String fname = input.next();
        System.out.println("What is the persons last name?:");
        String lname = input.next();
        System.out.println("What persons SIN number?:");
        long SIN = input.nextLong();
        Person p = new Person(fname, lname, SIN);
        currentIndex++;
        P.add(p);
        }
    
    public void listPeople(){
        for (int i = 0; i < currentIndex; i++){
            try{
            System.out.println((i+1) + ": FirstName " + P.get(i).getfname() + ", LastName " + P.get(i).getlname());
            }catch(Exception e)
                {
                    System.out.println(P.get(i));
                    continue;
            }
        }
    }
    
    public void deletePerson(){
        System.out.println("which car would you like to delete?");
        listPeople();
        int x = input.nextInt()- 1;
        P.remove(x);
        currentIndex--;
    }
}        
