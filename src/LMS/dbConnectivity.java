/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS;

import LMS.Book;
import LMS.Borrower;
import LMS.CheckoutClerk;
import LMS.DVD;
import LMS.Item;
import LMS.Libranian;
import LMS.Loan;
import LMS.User;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class dbConnectivity extends javax.swing.JFrame{
    Connection con;
    Statement stmt;
    
    dbConnectivity() //cons
    {
        try
        {
             String s = "jdbc:sqlserver://ABDULWASEY\\ABDULWASEYBUTT:1433;databaseName=Library";
             con=DriverManager.getConnection(s,"abdulwaseybutt","123456789");
             stmt = con.createStatement(); 
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    public ArrayList<User> renewUser()
    {
        ArrayList<User> temp=new ArrayList<>();
        String Name;
        String Usertype;
        String PassWord;
        String Phone;
        String Email;
        String Address;
        try
        {
           ResultSet rs=stmt.executeQuery("select * from Users");
             while(rs.next())
             {
                Name=rs.getString(1);
                Usertype=rs.getString(2);
                PassWord=rs.getString(3);
                Phone=rs.getString(4);
                Address=rs.getString(5);
                Email=rs.getString(6);
                if(Usertype.equals("Borrower"))
                {
                    User count=new Borrower(Name,PassWord,Phone,Address,Email);
                    temp.add(count);
                }
                if(Usertype.equals("Librarian"))
                {
                    User count=new Libranian(Name,PassWord,Phone,Address,Email);
                    temp.add(count);
                }
                if(Usertype.equals("CheckoutClerk"))
                {
                    User count=new CheckoutClerk(Name,PassWord,Phone,Address,Email);
                    temp.add(count);
                } 
             }
             return temp;
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return temp;
    }

    public ArrayList<Loan> renewLoan()
    {
        ArrayList<Loan> temp=new ArrayList<>();
        String Title;
        String UserName;
        String IssueDate;
        String ReturnDate;
        try
        {
           ResultSet rs=stmt.executeQuery("select * from Loans");
             while(rs.next())
             {
                Title=rs.getString(1);
                UserName=rs.getString(2);
                IssueDate=rs.getString(3);
                ReturnDate=rs.getString(4);
                Loan count=new Loan(Title,UserName);
                temp.add(count);
             }
             return temp;
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return temp;
    }
    public ArrayList<Item> renewItem()
    {
        ArrayList<Item> temp=new ArrayList<>();
        String Title;
        String ItemType;
        String Author;
        String Subjects;
        int Number;
        String Status;
        String username;
        try
        {
           ResultSet rs=stmt.executeQuery("select * from Items");
             while(rs.next())
             {
                Title=rs.getString(1);
                ItemType=rs.getString(2);
                Author=rs.getString(3);
                Subjects=rs.getString(4);
                Number=rs.getInt(5);
                Status=rs.getString(6);
                username=rs.getString(7);
                
                if(ItemType.equals("Book"))
                {
                    Item count=new Book(Title,Author,Subjects,Number,Status,username);
                    temp.add(count);
                }
                if(ItemType.equals("DVD"))
                {
                    Item count=new DVD(Title,Author,Subjects,Number,Status,username);
                     temp.add(count);
                }
                
             }
             return temp;
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
         return temp;
    }
    public void renewDataUser(ArrayList<User> temp)
    {
            try
            {
                 stmt.executeUpdate("truncate table Users");

            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
            
        for (int i = 0; i < temp.size(); i++) {
            String name=temp.get(i).getName();
            String phone=temp.get(i).getTelelphone();
            String address=temp.get(i).getAddress();
            String email=temp.get(i).getEmail();
            String pass=temp.get(i).getPassword();
            name=name.replaceAll("\\s","");
            phone=phone.replaceAll("\\s","");
            address=address.replaceAll("\\s","");
            pass=pass.replaceAll("\\s","");
            email=email.replaceAll("\\s","");
            email=email.replaceAll("[^a-zA-Z0-9]", "");
            name=name.replaceAll("[^a-zA-Z0-9]","");
            phone=phone.replaceAll("[^a-zA-Z0-9]","");
            address=address.replaceAll("[^a-zA-Z0-9]","");
            pass=pass.replaceAll("[^a-zA-Z0-9]","");
            try
            {
                if(name.equals("AamirRaheem") && pass.equals("1234"))
                {
                
                stmt.executeUpdate("exec addUser "+name+","+"Librarian"+","+pass+","+phone+","+address+","+email);
                }
                else if(name.equals("FarwaBatool") && pass.equals("1234"))
                {              
                    stmt.executeUpdate("exec addUser "+name+","+"CheckoutClerk"+","+pass+","+phone+","+address+","+email);
                }
                else
                    stmt.executeUpdate("exec addUser "+name+","+"Borrower"+","+pass+","+phone+","+address+","+email);
                    

            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
    }
    public void renewDataItem(ArrayList<Item> temp)
    {
            try
            {
                
                 stmt.executeUpdate("truncate table Items");

            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
         
        for (int i = 0; i < temp.size(); i++) {
            String Title=temp.get(i).Title;
            String AuthorName=temp.get(i).Author;
            String SubjectName=temp.get(i).Subject;
            int NumberOfCopies=temp.get(i).NumberOfCopies;
            String ItemType=temp.get(i).getClass().toString();
            String lastWord = ItemType.substring(ItemType.lastIndexOf(".")+1);
            String Status=temp.get(i).Status;
            String username=temp.get(i).username;
            
            Title=Title.replaceAll("\\s","");
            AuthorName=AuthorName.replaceAll("\\s","");
            SubjectName=SubjectName.replaceAll("\\s","");
            //Status=Status.replaceAll("\\s","");
            //username=username.replaceAll("\\s","");
            
             Title=Title.replaceAll("[^a-zA-Z0-9]", "");
            AuthorName=AuthorName.replaceAll("[^a-zA-Z0-9]", "");
            SubjectName=SubjectName.replaceAll("[^a-zA-Z0-9]", "");
            //Status=Status.replaceAll("[^a-zA-Z0-9]", "");
           // username=username.replaceAll("[^a-zA-Z0-9]", "");
            
            System.out.println(Title);
            try
            {
                 
                stmt.executeUpdate("exec addItem "+Title+" , "+lastWord+","+AuthorName+","+SubjectName+","+NumberOfCopies+","+Status+","+username);
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
    }
    public void renewDataLoan(ArrayList<Loan> temp)
    {
            try
            {
                
               stmt.executeUpdate("truncate table loans");

            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        for (int i = 0; i < temp.size(); i++)
        {
            String title=temp.get(i).getTitle();
            String userName=temp.get(i).getUserName();
            Date issueDate=temp.get(i).getIssueDate();
            Date returndate=temp.get(i).getReturnDate();
            String idate=issueDate.toString();
            String rdate=returndate.toString();
            idate=idate.substring(0, 11);
            rdate=rdate.substring(0,11);
            idate=idate.replaceAll("\\s","");
            rdate=rdate.replaceAll("\\s","");
            
            idate=idate.replaceAll("[^a-zA-Z0-9]", "");
            rdate=rdate.replaceAll("[^a-zA-Z0-9]", "");
            
            try
            {
                  
                  stmt.executeUpdate("exec checkout "+title+","+userName+","+idate+","+rdate);
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
    }
//    public void addItem(Item item)
//    {
//        String Title=item.Title;
//        String AuthorName=item.Author;
//        String SubjectName=item.Subject;
//        int NumberOfCopies=item.NumberOfCopies;
//        String ItemType=item.getClass().toString();
//        String lastWord = ItemType.substring(ItemType.lastIndexOf(".")+1);
//        Title=Title.replaceAll("\\s","");
//        AuthorName=AuthorName.replaceAll("\\s","");
//        SubjectName=SubjectName.replaceAll("\\s","");
//        System.out.println(Title);
//        try
//        {
//            stmt.executeUpdate("exec addItem "+Title+" , "+lastWord+","+AuthorName+","+SubjectName+","+NumberOfCopies);
//        }
//        catch(SQLException e)
//        {
//            System.out.println(e);
//        }
//    }

//    public void addUser(User borrower)
//    {
//        String name=borrower.getName();
//        String phone=borrower.getTelelphone();
//        String address=borrower.getAddress();
//        String email=borrower.getEmail();
//        String pass=borrower.getPassword();
//        name=name.replaceAll("\\s","");
//        phone=phone.replaceAll("\\s","");
//        address=address.replaceAll("\\s","");
//        pass=pass.replaceAll("\\s","");
//        email=email.replaceAll("\\s","");
//        
//        email=email.replaceAll("[^a-zA-Z0-9]", "");
//        name=name.replaceAll("[^a-zA-Z0-9]","");
//        phone=phone.replaceAll("[^a-zA-Z0-9]","");
//        address=address.replaceAll("[^a-zA-Z0-9]","");
//        pass=pass.replaceAll("[^a-zA-Z0-9]","");
//        try
//        {
//            stmt.executeUpdate("exec addUser "+name+","+"Borrower"+","+pass+","+phone+","+address+","+email);
//             
//        }
//        catch(SQLException e)
//        {
//            System.out.println(e);
//        }
//        
//    }
    public boolean checkLogin(String name,String Pass)
    {
        name=name.replaceAll("\\s","");
        try
        {
             ResultSet rs=stmt.executeQuery("exec checkLogin "+name);
            rs.next();
            if(rs.getString(3).equals(Pass))
            {
                return true;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return false;
                
    }
//    public void addLoan(Loan temp)
//    {
//        String title=temp.getTitle();
//        String userName=temp.getUserName();
//        Date issueDate=temp.getIssueDate();
//        Date returndate=temp.getReturnDate();
//        String idate=issueDate.toString();
//        String rdate=returndate.toString();
//        idate=idate.substring(0, 11);
//        rdate=rdate.substring(0,11);
//        idate=idate.replaceAll("\\s","");
//        rdate=rdate.replaceAll("\\s","");
//        try
//        {
//              stmt.executeUpdate("exec checkout "+title+","+userName+","+idate+","+rdate);
//        }
//        catch(SQLException e)
//        {
//            System.out.println(e);
//        }   
//    }
}