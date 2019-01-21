/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Loan {
    
    String Title;
    String UserName;
    Date IssueDate;
    Date ReturnDate;
    
    public Loan(String Title,String UserName)
    {
        this.Title=Title;
        this.UserName=UserName;
        Date date=new Date();
        this.IssueDate=date;
        this.ReturnDate= caldate();
    }
    public Date caldate()
    {
        long ltime=this.IssueDate.getTime()+7*24*60*60*1000;
        Date day=new Date(ltime);
        return day;
    }
    public void RenewDate()
    {
        long ltime=this.ReturnDate.getTime()+7*24*60*60*1000;
        Date day=new Date(ltime);
        this.ReturnDate=day;
    }
    public String getTitle()
    {
        return this.Title;
    }
    public String getUserName()
    {
        return this.UserName;
    }
    public Date getIssueDate()
    {
        return this.IssueDate;
    }
    public Date getReturnDate()
    {
        return this.ReturnDate;
    }
    
}
