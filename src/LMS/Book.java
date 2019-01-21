/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS;

/**
 *
 * @author Lenovo
 */
public class Book extends Item{
    public Book()
    {
       super();
    }
    public Book(String Title,String Author,String Subject,int Number,String Stat,String User)
    {
        super(Title,Author,Subject,Number,Stat,User);
    }
   
}
