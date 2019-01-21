/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Management extends dbConnectivity {
    ArrayList<Item> Items=new ArrayList<>();;
    
    ArrayList<User> Users=new ArrayList<>();
 
    ArrayList<Loan> loan= new ArrayList<>();
    
    public void populate(){
        User b= new Borrower();
        b.setAddress("aaaaa");
        b.setEmail("bbbb");
        b.setTel("cccc");
        b.setName("sss");
        this.Users.add(b);
    }
    public boolean addBorrowerToUsers(Borrower obj){
        if (Users.add(obj)) {
            return true;
        }
        return false;
    }
    public boolean removeBorrower(Borrower obj){
        if (Users.remove(obj)) {
            return true;
        }
        return false;
    }
    public ArrayList getItems()
    {
        return this.Items;
        
    }
    public ArrayList getLoan()
    {
        return this.loan;
    }
    public ArrayList getUsers()
    {
        return this.Users;
    }
}
