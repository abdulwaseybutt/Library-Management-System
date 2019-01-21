package LMS;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdul
 */
public class Borrower extends User{

    /**
     * Creates new form Borrower
     */
    public Borrower() {
        super();
      //  Item b= new Book("song","RR. Martin","Fantasy",1);
       // super.Items.add(b);
        //initComponents();
    }
    public void initializeBorrower(){
        jPanel1 = new javax.swing.JPanel();
        search = new javax.swing.JTextField();
        search_by = new javax.swing.JComboBox<>();
        search_button = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        View_menuItem = new javax.swing.JMenu();
        profile_menuItem = new javax.swing.JMenuItem();
        borrowed_menuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        search.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        search.setToolTipText("search for Books/Author/Subject");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        search_by.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Title", "Author", "Subject" }));

        search_button.setText("Search");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(search_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(search_button))
        );

        View_menuItem.setText("View");
        View_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_menuItemActionPerformed(evt);
            }
        });

        profile_menuItem.setText("Profile");
        profile_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_menuItemActionPerformed(evt);
            }
        });
        View_menuItem.add(profile_menuItem);

        borrowed_menuItem.setText("List of items currently borrowed");
        borrowed_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowed_menuItemActionPerformed(evt);
            }
        });
        View_menuItem.add(borrowed_menuItem);

        menuBar.add(View_menuItem);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 407, Short.MAX_VALUE))
        );

        pack();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        search = new javax.swing.JTextField();
        search_by = new javax.swing.JComboBox<>();
        search_button = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        View_menuItem = new javax.swing.JMenu();
        profile_menuItem = new javax.swing.JMenuItem();
        borrowed_menuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        search.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        search.setToolTipText("search for Books/Author/Subject");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        search_by.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Title", "Author", "Subject" }));

        search_button.setText("Search");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(search_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(search_button))
        );

        View_menuItem.setText("View");
        View_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_menuItemActionPerformed(evt);
            }
        });

        profile_menuItem.setText("Profile");
        profile_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_menuItemActionPerformed(evt);
            }
        });
        View_menuItem.add(profile_menuItem);

        borrowed_menuItem.setText("List of items currently borrowed");
        borrowed_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowed_menuItemActionPerformed(evt);
            }
        });
        View_menuItem.add(borrowed_menuItem);

        menuBar.add(View_menuItem);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 407, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        // TODO add your handling code here:
        String searchby=(String)this.search_by.getSelectedItem().toString();
        String searchfor=this.search.getText().toString();
        int sf=this.search_by.getSelectedIndex();
        
        //SEARCH FOR "searchfor" IN SYSTEM USING "searchby"
        
        ArrayList<Item> temp= new ArrayList<>();                //SEARCH RESULTS STORED IN HERE
        if (searchby.equals("Author")) {
            temp=this.SearchAuthor(searchfor);   
            SearchResults res= new SearchResults(temp);  //OPEN NEW WINDOW WITH RESULTS
            res.setVisible(true);
            res.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        }
        else if (searchby.equals("Subject")) {
            temp=this.SearchSubject(searchfor);
            SearchResults res= new SearchResults(temp);  //OPEN NEW WINDOW WITH RESULTS
            res.setVisible(true);
            res.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        }
        else if(searchby.equals("Title")){
           
            temp=this.SearchTitle(searchfor);
            SearchResults res= new SearchResults(temp);  //OPEN NEW WINDOW WITH RESULTS
            res.setVisible(true);
            res.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        }
        
        
       
    }//GEN-LAST:event_search_buttonActionPerformed

    private void profile_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_menuItemActionPerformed
        // TODO add your handling code here:
        PersonalInfo info=new PersonalInfo(this);
        info.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        info.setVisible(true);    
    }//GEN-LAST:event_profile_menuItemActionPerformed

    private void View_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_menuItemActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_View_menuItemActionPerformed

    private void borrowed_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowed_menuItemActionPerformed
        // TODO add your handling code here:
        BorrowedItems temp= new BorrowedItems(this);
        temp.setVisible(true);
        temp.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        
        
    }//GEN-LAST:event_borrowed_menuItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu View_menuItem;
    private javax.swing.JMenuItem borrowed_menuItem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem profile_menuItem;
    private javax.swing.JTextField search;
    private javax.swing.JButton search_button;
    private javax.swing.JComboBox<String> search_by;
    // End of variables declaration//GEN-END:variables

    public  Borrower(String nam,String i,String tel,String add,String Em)
    {
        super(nam,i,tel,add,Em);
    }
    public ArrayList<Item> SearchTitle(String title)
   {
       super.Users=super.renewUser();
       super.Items=super.renewItem();
       super.loan=super.renewLoan();
       ArrayList<Item> temp=new ArrayList<Item>();
       for(int i=0;i<super.Items.size();i++)
       {
           if(super.Items.get(i).Title.contains(title))
           {
               temp.add(super.Items.get(i));
           }
       }
       return temp;
   }
   public ArrayList<Item> SearchAuthor(String author)
   {
       super.Users=super.renewUser();
       super.Items=super.renewItem();
       super.loan=super.renewLoan();
       ArrayList<Item> temp=new ArrayList<Item>();
       for(int i=0;i<super.Items.size();i++)
       {
           if(super.Items.get(i).Author.contains(author))
           {
               temp.add(super.Items.get(i));
           }
       }
       return temp;
   }
   public ArrayList<Item> SearchSubject(String Subject)
   {
       super.Users=super.renewUser();
       super.Items=super.renewItem();
       super.loan=super.renewLoan();
       ArrayList<Item> temp=new ArrayList<Item>();
       for(int i=0;i<super.Items.size();i++)
       {
           if(super.Items.get(i).Subject.contains(Subject))
           {
               temp.add(super.Items.get(i));
           }
       }
       return temp;
   }

   public ArrayList<String> currentlyBorrowed(String name)
    {
        super.Users=super.renewUser();
        super.Items=super.renewItem();
        super.loan=super.renewLoan(); 
        ArrayList<String> temp=new ArrayList<>();
        for (int i = 0; i<super.loan.size(); i++)
        {
           if(super.loan.get(i).UserName.equals(name))
           {
               temp.add(super.loan.get(i).Title);
           }
        }
        //temp.add("A song of ice and fire");
        return temp;
    }
 
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Borrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Borrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Borrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Borrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        Borrower temp=new Borrower();
//        temp.setVisible(true);
//    }
//    
}
