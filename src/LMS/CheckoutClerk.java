/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author abdul
 */
public class CheckoutClerk extends Borrower{

    /**
     * Creates new form CheckoutClerk
     */
    public CheckoutClerk() {
        super();
    }
    
    public void initializeCheckoutClerk(){
        super.initializeBorrower();
        check = new javax.swing.JLabel();
        OutItemName_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Outbname_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        EnterCheckout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        InItemName_field = new javax.swing.JTextField();
        Inbname_field = new javax.swing.JTextField();
        EnterCheckin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RenewItemname_field = new javax.swing.JTextField();
        Renewbname_field = new javax.swing.JTextField();
        EnterRenew = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        View = new javax.swing.JMenu();
        personalProfile_menuItem = new javax.swing.JMenuItem();
        borrowed_menuItem = new javax.swing.JMenuItem();
        borrowerProfile_menuItem = new javax.swing.JMenuItem();
        Add = new javax.swing.JMenu();
        newBorrower_menuItem = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        editInfo_menuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        check.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check.setText("CheckOut an Item:");

        OutItemName_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutItemName_fieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Item Name: ");

        Outbname_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Outbname_fieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Borrower Name: ");

        EnterCheckout.setText("Enter");
        EnterCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterCheckoutActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CheckIn an Item: ");

        jLabel4.setText("Enter Item Name: ");

        jLabel5.setText("Enter Borrower Name: ");

        EnterCheckin.setText("Enter");
         EnterCheckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterCheckinActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Renew an Item:");

        jLabel7.setText("Enter Item Name: ");

        jLabel8.setText("Enter Borrower Name: ");

        RenewItemname_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenewItemname_fieldActionPerformed(evt);
            }
        });

        EnterRenew.setText("Enter");
          EnterRenew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterRenewActionPerformed(evt);
            }
        });

        View.setText("View");

        personalProfile_menuItem.setText("Personal Profile");
        personalProfile_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalProfile_menuItemActionPerformed(evt);
            }
        });
        View.add(personalProfile_menuItem);

        borrowed_menuItem.setText("List of items currently borrowed by ...");
        borrowed_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowed_menuItemActionPerformed(evt);
            }
        });
        View.add(borrowed_menuItem);

        borrowerProfile_menuItem.setText("Profile of a Borrower");
        borrowerProfile_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowerProfile_menuItemActionPerformed(evt);
            }
        });
        View.add(borrowerProfile_menuItem);

        jMenuBar1.add(View);

        Add.setText("Add");

        newBorrower_menuItem.setText("New Borrower");
        newBorrower_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBorrower_menuItemActionPerformed(evt);
            }
        });
        Add.add(newBorrower_menuItem);

        jMenuBar1.add(Add);

        Edit.setText("Edit");

        editInfo_menuItem.setText("A borrower's personal info");
        editInfo_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editInfo_menuItemActionPerformed(evt);
            }
        });
        Edit.add(editInfo_menuItem);

        jMenuBar1.add(Edit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EnterCheckout)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(29, 29, 29)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(OutItemName_field)
                                    .addComponent(Outbname_field)
                                    .addComponent(InItemName_field)
                                    .addComponent(Inbname_field, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                            .addComponent(EnterCheckin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Renewbname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RenewItemname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnterRenew))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OutItemName_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(RenewItemname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Outbname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Renewbname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnterRenew)
                    .addComponent(EnterCheckout))
                .addGap(32, 32, 32)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(InItemName_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Inbname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EnterCheckin)
                .addContainerGap(38, Short.MAX_VALUE))
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

        check = new javax.swing.JLabel();
        OutItemName_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Outbname_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        EnterCheckout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        InItemName_field = new javax.swing.JTextField();
        Inbname_field = new javax.swing.JTextField();
        EnterCheckin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RenewItemname_field = new javax.swing.JTextField();
        Renewbname_field = new javax.swing.JTextField();
        EnterRenew = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        View = new javax.swing.JMenu();
        personalProfile_menuItem = new javax.swing.JMenuItem();
        borrowed_menuItem = new javax.swing.JMenuItem();
        borrowerProfile_menuItem = new javax.swing.JMenuItem();
        Add = new javax.swing.JMenu();
        newBorrower_menuItem = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        editInfo_menuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        check.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check.setText("CheckOut an Item:");

        OutItemName_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutItemName_fieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Item Name: ");

        Outbname_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Outbname_fieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Borrower Name: ");

        EnterCheckout.setText("Enter");
        EnterCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterCheckoutActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CheckIn an Item: ");

        jLabel4.setText("Enter Item Name: ");

        jLabel5.setText("Enter Borrower Name: ");

        EnterCheckin.setText("Enter");
        EnterCheckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterCheckinActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Renew an Item:");

        jLabel7.setText("Enter Item Name: ");

        jLabel8.setText("Enter Borrower Name: ");

        RenewItemname_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenewItemname_fieldActionPerformed(evt);
            }
        });

        EnterRenew.setText("Enter");
        EnterRenew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterRenewActionPerformed(evt);
            }
        });

        View.setText("View");

        personalProfile_menuItem.setText("Personal Profile");
        personalProfile_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalProfile_menuItemActionPerformed(evt);
            }
        });
        View.add(personalProfile_menuItem);

        borrowed_menuItem.setText("List of items currently borrowed by ...");
        borrowed_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowed_menuItemActionPerformed(evt);
            }
        });
        View.add(borrowed_menuItem);

        borrowerProfile_menuItem.setText("Profile of a Borrower");
        borrowerProfile_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowerProfile_menuItemActionPerformed(evt);
            }
        });
        View.add(borrowerProfile_menuItem);

        jMenuBar1.add(View);

        Add.setText("Add");

        newBorrower_menuItem.setText("New Borrower");
        newBorrower_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBorrower_menuItemActionPerformed(evt);
            }
        });
        Add.add(newBorrower_menuItem);

        jMenuBar1.add(Add);

        Edit.setText("Edit");

        editInfo_menuItem.setText("A borrower's personal info");
        editInfo_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editInfo_menuItemActionPerformed(evt);
            }
        });
        Edit.add(editInfo_menuItem);

        jMenuBar1.add(Edit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EnterCheckout)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(29, 29, 29)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(OutItemName_field)
                                    .addComponent(Outbname_field)
                                    .addComponent(InItemName_field)
                                    .addComponent(Inbname_field, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                            .addComponent(EnterCheckin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Renewbname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RenewItemname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnterRenew))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OutItemName_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(RenewItemname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Outbname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Renewbname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnterRenew)
                    .addComponent(EnterCheckout))
                .addGap(32, 32, 32)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(InItemName_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Inbname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EnterCheckin)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personalProfile_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalProfile_menuItemActionPerformed
        // TODO add your handling code here:
       
        PersonalInfo info=new PersonalInfo(this);
        info.setVisible(true);
        info.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }//GEN-LAST:event_personalProfile_menuItemActionPerformed

    private void borrowed_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowed_menuItemActionPerformed
        // TODO add your handling code here:
        
        BorrowedBy bor=new BorrowedBy();
        bor.setVisible(true);
        bor.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        
    }//GEN-LAST:event_borrowed_menuItemActionPerformed

    private void borrowerProfile_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowerProfile_menuItemActionPerformed
        // TODO add your handling code here:
        
        BorrowerName bname= new BorrowerName();
        bname.setVisible(true);
        bname.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        
    }//GEN-LAST:event_borrowerProfile_menuItemActionPerformed

    private void OutItemName_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutItemName_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OutItemName_fieldActionPerformed

    private void Outbname_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Outbname_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Outbname_fieldActionPerformed

    private void RenewItemname_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenewItemname_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RenewItemname_fieldActionPerformed

    private void newBorrower_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBorrower_menuItemActionPerformed
        // TODO add your handling code here:
        
        AddNewBorrower temp= new AddNewBorrower();
        temp.setVisible(true);
        temp.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }//GEN-LAST:event_newBorrower_menuItemActionPerformed

    private void editInfo_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editInfo_menuItemActionPerformed
        // TODO add your handling code here:
        
        EditInfoName temp= new EditInfoName();
        temp.setVisible(true);
        temp.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }//GEN-LAST:event_editInfo_menuItemActionPerformed

    private void EnterCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterCheckoutActionPerformed
        // TODO add your handling code here:
        String ItemName=OutItemName_field.getText();
        String BorrowerName=Outbname_field.getText();
        if(ItemName.equals("") ||  BorrowerName.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Unsuccessfull! :(");
        }
        else
        {
            CheckOutItem(ItemName,BorrowerName);

        }    
        this.OutItemName_field.setText("");
        this.Outbname_field.setText("");
    }//GEN-LAST:event_EnterCheckoutActionPerformed

    private void EnterCheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterCheckinActionPerformed
        // TODO add your handling code here:
        String ItemName=InItemName_field.getText();
        String BorrowerName=Inbname_field.getText();
        if(ItemName.equals("") ||  BorrowerName.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Unsuccessfull! :(");
        }
        else
        {
            CheckInItem(ItemName,BorrowerName);
        }
        this.Inbname_field.setText("");
        this.InItemName_field.setText("");
    }//GEN-LAST:event_EnterCheckinActionPerformed

    private void EnterRenewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterRenewActionPerformed
        // TODO add your handling code here:
        String ItemName=RenewItemname_field.getText();
        String BorrowerName=Renewbname_field.getText();
        if(ItemName.equals("") ||  BorrowerName.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Unsuccessfull! :(");
        }
        else
        {
            RenewItem(ItemName,BorrowerName);
        }
        
        this.Renewbname_field.setText("");
        this.RenewItemname_field.setText("");
    }//GEN-LAST:event_EnterRenewActionPerformed

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
//            java.util.logging.Logger.getLogger(CheckoutClerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CheckoutClerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CheckoutClerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CheckoutClerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CheckoutClerk().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Add;
    private javax.swing.JMenu Edit;
    private javax.swing.JButton EnterCheckin;
    private javax.swing.JButton EnterCheckout;
    private javax.swing.JButton EnterRenew;
    private javax.swing.JTextField InItemName_field;
    private javax.swing.JTextField Inbname_field;
    private javax.swing.JTextField OutItemName_field;
    private javax.swing.JTextField Outbname_field;
    private javax.swing.JTextField RenewItemname_field;
    private javax.swing.JTextField Renewbname_field;
    private javax.swing.JMenu View;
    private javax.swing.JMenuItem borrowed_menuItem;
    private javax.swing.JMenuItem borrowerProfile_menuItem;
    private javax.swing.JLabel check;
    private javax.swing.JMenuItem editInfo_menuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem newBorrower_menuItem;
    private javax.swing.JMenuItem personalProfile_menuItem;
    // End of variables declaration//GEN-END:variables

    public CheckoutClerk(String nam,String pass,String tel,String add,String Em)
    {
        super(nam,pass,tel,add,Em);
    }
    public void CheckOutItem(String ItemName,String UserName)
    {
        int count=0;
        int counter=0;
        int i=0;
        int check=0;
        int main=0;
        ItemName=ItemName.replaceAll("\\s","");
        UserName=UserName.replaceAll("\\s","");
  
       super.Users=super.renewUser();
       super.Items=super.renewItem();
       super.loan=super.renewLoan();
       
        for(i =0;i<super.Items.size();i++)
        {
            //Outbname_field.setText(Integer.toString(super.Items.size()));     
            if(super.Items.get(i).getTitle().equals(ItemName))
            {
                counter=i;
                count++;
                
            }
        }
//        if(super.Items.get(counter).Status.equals("Hold"))
//        {
//            if(super.Items.get(counter).getCopies()==0)
//            {
//                JOptionPane.showMessageDialog(this, "On Hold to someone else :(");
//                super.renewDataLoan(super.loan);
//                super.renewDataItem(super.Items);
//                return;
//            }          
//        }
        for(i =0;i<super.Users.size();i++)
        {
            if(super.Users.get(i).getName().equals(UserName))
            { 
                count++;
            }
        }
        if(super.loan.size()>0)
        {
            for(i =0;i<super.loan.size();i++)
            {
                if(super.loan.get(i).Title.equals(ItemName))
                { 
                    main=i;
                    check=1;
                }
            }

            if(super.loan.get(main).UserName.equals(UserName))
            {
                check++;

            }
        }
         if(super.Items.get(counter).Status.equals("Hold"))
         {
             if(super.Items.get(counter).username.equals(UserName))
             {
                  super.Items.get(counter).Status="Available";
                  super.Items.get(counter).username="1";
             }
             else
             {
                 JOptionPane.showMessageDialog(this, "On Hold to someone else");
                 super.renewDataLoan(super.loan);
                 super.renewDataItem(super.Items);
                 return;
             }
        }
        if(super.Items.get(counter).getCopies()==0)
        {
            if(super.Items.get(counter).Status.equals("Hold"))
            {
                 JOptionPane.showMessageDialog(this, "On Hold to someone else");
                 super.renewDataLoan(super.loan);
                 super.renewDataItem(super.Items);
                 return;
            }
            
            if(super.Items.get(counter).username.equals("1"))
            {
                JOptionPane.showMessageDialog(this, "On Hold");
                  super.Items.get(counter).username=UserName;
                  super.Items.get(counter).Status="Hold";
                   super.renewDataLoan(super.loan);
                    super.renewDataItem(super.Items);
                    return;
            }
          
        }
        if(super.Items.get(counter).getCopies()>0)
        {
            count++;
            super.Items.get(counter).NumberOfCopies--;
  
        }
        
        if(count==3 && check <2)
        {
            JOptionPane.showMessageDialog(this, "Success!"); 
            Loan temp=new Loan(ItemName,UserName);
            super.loan.add(temp);
            super.renewDataLoan(super.loan);
            super.renewDataItem(super.Items);
            return;
        }
        if(check==2)
        {
            JOptionPane.showMessageDialog(this, "Already Issued :(");
            return;
        }
        JOptionPane.showMessageDialog(this, "Unsuccessfull! :(");
    }
    public void RenewItem(String ItemName,String UserName)
    {
        int count=0;
        int check=0;
       super.Users=super.renewUser();
       super.Items=super.renewItem();
       super.loan=super.renewLoan();
       ItemName=ItemName.replaceAll("\\s","");
       UserName=UserName.replaceAll("\\s","");
        for(int i =0;i<super.loan.size();i++)
        {
            if(super.loan.get(i).Title.equals(ItemName))
            { 
                count=i;
                check=1;
            }
        }
        if(super.loan.get(count).UserName.equals(UserName))
        {
           
            check++;
        }
        if(check==2)
        {
            JOptionPane.showMessageDialog(this, "Success!"); 
            super.loan.get(count).RenewDate();
            super.renewDataLoan(super.loan);
            return;
        }
        JOptionPane.showMessageDialog(this, "Unsuccessfull! :(");
    }
     
    public void CheckInItem(String ItemName,String UserName)
    {
        int count=0;
        int check=0;
       super.Users=super.renewUser();
       super.Items=super.renewItem();
       super.loan=super.renewLoan();
       ItemName=ItemName.replaceAll("\\s","");
      UserName=UserName.replaceAll("\\s","");
        for(int i =0;i<super.loan.size();i++)
        {
            if(super.loan.get(i).Title.equals(ItemName))
            { 
                count=i;
                check=1;
            }
        }
        if(super.loan.get(count).UserName.equals(UserName))
        {
           
            check++;
        }
        
        if(check==2)
        {
            for(int i =0;i<super.Items.size();i++)
            {
                if(super.Items.get(i).Title.equals(ItemName))
                {
                    super.Items.get(i).NumberOfCopies++;
                    if(super.Items.get(i).NumberOfCopies>=2)
                    {
                        super.Items.get(i).Status="Available";
                        super.Items.get(i).username="1";
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "Success!"); 
            super.loan.remove(count);
            super.renewDataLoan(super.loan);
            super.renewDataItem(super.Items);
            return;
        }
        JOptionPane.showMessageDialog(this, "Hello Unsuccessfull! :(");
    }
   public ArrayList<Item> SearchTitle(String title)
   {
       return super.SearchTitle(title);
   }
   public ArrayList<Item> SearchAuthor(String author)
   {
       return super.SearchAuthor(author);
   }
   public ArrayList<Item> SearchSubject(String Subject)
   {
         return super.SearchSubject(Subject);
   }
   public ArrayList<String> currentlyBorrowed(String name)
   {
     return super.currentlyBorrowed(name);
   }

}
