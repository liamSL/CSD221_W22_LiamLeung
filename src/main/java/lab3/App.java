/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author liaml_000
 */
public class App {
    
    private ArrayList<Book> B = new ArrayList<Book>();
    private ArrayList<Magazine> M = new ArrayList<Magazine>();
    private ArrayList<DiscMag> DM = new ArrayList<DiscMag>();
    private int currentIndex = 0;
    private Scanner input = new Scanner(System.in);
    private String menu = "Menu\n" +
            View() +
            "1. Add a Book\n" +
            "2. Edit a Book\n" +
            "3. Delete a Book\n" +
            "4. Add a Magazine\n" +
            "5. List a Magazine\n" +
            "6. List a Disc Magazine\n" +
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
                opt = -1;
            }
            
            switch(opt){
                case 1: addBook();
                break;
                case 2: editBook();
                break;
                case 3: deleteBook();
                break;
                case 4: addMagazine();
                break;
                case 5: listMagazine();
                break;
                case 6: listDiscMagazine();
                break;
                case 0: done = true;
                System.out.println("bye...");
                break;
                default: System.out.println("Invalid input (number not in range), try again...");
                break;
            }
        }
    }
    
    public String View(){
        String ret = "";
        for (int i = 0; i < currentIndex; i++){
            try{
            String Line = "" + ((i+1) + ". " + B.get(i).getTitle() + " by " + B.get(i).getAuthor());
            ret = ret + (Line + "\n");
            }catch(Exception e)
                {
                    System.out.println(B.get(i));
                    continue;
            }
        }
        System.out.println(ret);
        return ret;
    }
    
    public void addBook(){
        
        Book b = new Book();
        System.out.println("Author: ");
        input.nextLine();
        String author = input.nextLine();
        b.setAuthor(author);
        System.out.println("Price: ");
        double price = input.nextDouble();
        b.setPrice(price);
        System.out.println("Copies: ");
        int copies = input.nextInt();
        b.setCopies(copies);
        input.nextLine();
        System.out.println("Title: ");
        String title = input.nextLine();
        b.setTitle(title);
        currentIndex++;
        B.add(b);
    }
    
    public void editBook(){
        System.out.println("Which Book would you like to edit?");
        View();
        int x = input.nextInt()-1;
        Book book = B.get(x);
        try{
            System.out.println("Enter Author (q to quit): ");
                        input.nextLine();
            String author = input.nextLine();
            if(author == "q" || author == "Q"){
                throw new Exception("Book editing has been canceled");
            }
            
            System.out.println("Quantity to order: ");
            int qty = input.nextInt();
            
            System.out.println("Title: ");
            input.nextLine();
            String title = input.nextLine();
            System.out.println("Price: ");
            double price = input.nextDouble();
            
            book.setAuthor(author);
            book.setTitle(title);
            book.setPrice(price);
            book.orderCopies(qty);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        B.set(x, book);
    }
    
    public void deleteBook(){
        System.out.println("which car would you like to delete?");
        View();
        int x = input.nextInt()- 1;
        B.remove(x);
        currentIndex--;
    }
    
    public void addMagazine(){
        Magazine m = new Magazine();
        System.out.println("Title: ");
        input.nextLine();
        String title = input.nextLine();
        m.setTitle(title);
        System.out.println("Price: ");
        double price = input.nextDouble();
        m.setPrice(price);
        System.out.println("Quantity: ");
        int Qty = input.nextInt();
        m.adjustQty(Qty);
        System.out.println("Issue: ");
        input.nextLine();
        String issue = input.nextLine();
        m.receiveNewIssue(issue);
        currentIndex++;
        M.add(m); 
    }
    
    public void listMagazine(){
    for (int i = 0; i < currentIndex; i++){
            try{
            System.out.println((i+1) + ": " + M.get(i).toString());
            }catch(Exception e)
                {
                    System.out.println(M.get(i));
                    continue;
            }
        }
    }
    
    public void listDiscMagazine(){
    for (int i = 0; i < currentIndex; i++){
            try{
            System.out.println((i+1) + ": " + DM.get(i).toString());
            }catch(Exception e)
                {
                    System.out.println(DM.get(i));
                    continue;
            }
        }
    }
    
}
