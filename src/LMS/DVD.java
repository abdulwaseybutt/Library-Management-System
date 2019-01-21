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
public class DVD extends Item{
    public DVD()
    {
       super();
    }
     
    public DVD(String Title,String author,String Subject,int Number,String Stat,String User)
    {
        super(Title,author,Subject,Number,Stat,User);
    }
    
    public String getTitle()
    {
        return this.Title;
    }
    public String getAuthor()
    {
        return this.Author;
    }
    public String getSubject()
    {
        return this.Subject;
    }
    public int getCopies()
    {
        return this.NumberOfCopies;
    }
}
