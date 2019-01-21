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
public class Item extends Management{
    String Title;
    String Subject;
    String Author;
    String Status;
    int NumberOfCopies;
    String username;
    
    public Item()
    {
        this.Title=null;
        this.Subject=null;
    }
    public Item(String T,String a,String S,int n,String Stat,String User)
    {
        this.Title=T;
        this.Author=a;
        this.Subject=S;
        this.NumberOfCopies=n;
        this.Status=Stat;
        this.username=User;
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
    
    public void setTitle(String title)
    {
        this.Title=title;
    }
     public void setAuthor(String author)
    {
        this.Author=author;
    }
    public void setSubject(String subject)
    {
        this.Subject=subject;
    }
    public void setStatus(String st){
        this.Status=st;
    }
    public void setNumberOfCopies(int Number)
    {
        this.NumberOfCopies=Number;
    }
}
