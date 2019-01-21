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
abstract class User extends Management {
    String name;
    String password;
    String address;
    String telephone;
    String Email;

    
    public User()
    {
        this.name=null;
        this.password=null;
        this.telephone=null;
        this.address=null;
    }
    public User(String nam,String i,String tel,String add,String Em)
    {
        this.name=nam;
        this.password=i;
        this.telephone=tel;
        this.address=add;
        this.Email=Em;
    }
   
    abstract ArrayList<Item> SearchTitle(String title);
    abstract ArrayList<Item> SearchAuthor(String author);
    abstract ArrayList<Item>SearchSubject(String subject);
    //abstract void OnHold(Item book);
    
   public String getName()
   {
        return this.name;
   }
   public String getEmail()
   {
        return this.Email;
   }
   public String getPassword()
   {
        return this.password;
   }
   public String getAddress()
   {
        return this.address;
   }
   public String getTelelphone()
   {
        return this.telephone;
   }
   
   
   public void setName(String name)
   {
        this.name=name;
   }
   public void setEmail(String Em)
   {
        this.Email=Em;
   }
   public void setPassword(String i)
   {
        this.password=i;
   }
    public void setAddress(String add)
   {
        this.address=add;
   }
     public void setTel(String tel)
   {
        this.telephone=tel;
   }

     
}
