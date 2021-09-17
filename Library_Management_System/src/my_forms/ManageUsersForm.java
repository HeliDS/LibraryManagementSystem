/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_forms;

import my_classes.Author;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Helili
 */
public final class ManageUsersForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageGenresForm
     */
    my_classes.Users user  = new my_classes.Users();
    
    
    public ManageUsersForm() {
        initComponents();
        
        //to center the form
       this.setLocationRelativeTo(null);
       
       //to display image in the top
       my_classes.Func_Class func = new my_classes.Func_Class();
       func.displayImage(70, 70, "/my_images/users.png", jLabel_FormTitle);//to display image in the top
       
       //to customize the jtable
      func.customTable(jTable_Users_);
       
       
       //to customize the jtable header row
       jTable_Users_.getTableHeader().setBackground(Color.blue);
       jTable_Users_.getTableHeader().setForeground(Color.black);
       jTable_Users_.getTableHeader().setOpaque(false);
       
       
       //to hide the jlabel "empty name message"
       jLabel_EmptyFirstName_.setForeground(Color.white);
       jLabel_EmptyLastName_.setForeground(Color.white);
       jLabel_EmptyuserName_.setForeground(Color.white);
       jLabel_Emptypassword_.setForeground(Color.white);
       //populate Jtable With users
       populateJtableWithUsers();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_FirstName = new javax.swing.JTextField();
        jTextField_ID = new javax.swing.JTextField();
        jButton_Edit_ = new javax.swing.JButton();
        jButton_Delete_ = new javax.swing.JButton();
        jButton_Add_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Users_ = new javax.swing.JTable();
        jLabel_EmptyFirstName_ = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jLabel_EmptyLastName_ = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField_1 = new javax.swing.JPasswordField();
        jPasswordField_2 = new javax.swing.JPasswordField();
        jLabel_EmptyuserName_ = new javax.swing.JLabel();
        jLabel_Emptypassword_ = new javax.swing.JLabel();
        jCheckBox_setOwner = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel_FormTitle.setBackground(new java.awt.Color(51, 0, 153));
        jLabel_FormTitle.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(204, 204, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Manage Users");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm_.setBackground(new java.awt.Color(51, 0, 153));
        jLabel_CloseForm_.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_CloseForm_.setForeground(new java.awt.Color(204, 204, 255));
        jLabel_CloseForm_.setText("   X");
        jLabel_CloseForm_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm_.setOpaque(true);
        jLabel_CloseForm_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseForm_MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("First Name:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("ID:");

        jTextField_FirstName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FirstNameActionPerformed(evt);
            }
        });

        jTextField_ID.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField_ID.setEnabled(false);

        jButton_Edit_.setBackground(new java.awt.Color(102, 153, 255));
        jButton_Edit_.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton_Edit_.setText("Edit");
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
            }
        });

        jButton_Delete_.setBackground(new java.awt.Color(153, 153, 153));
        jButton_Delete_.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton_Delete_.setText("Delete");
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });

        jButton_Add_.setBackground(new java.awt.Color(0, 153, 153));
        jButton_Add_.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton_Add_.setText("Add");
        jButton_Add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ActionPerformed(evt);
            }
        });

        jTable_Users_.setBackground(new java.awt.Color(255, 204, 51));
        jTable_Users_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Users_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Users_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Users_);

        jLabel_EmptyFirstName_.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_EmptyFirstName_.setText("*enter the first name");
        jLabel_EmptyFirstName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyFirstName_MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Last Name:");

        jTextField_LastName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField_LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LastNameActionPerformed(evt);
            }
        });

        jLabel_EmptyLastName_.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_EmptyLastName_.setText("*enter the last name");
        jLabel_EmptyLastName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyLastName_MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Username:");

        jTextField_Username.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Password:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Retype Password:");

        jPasswordField_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_1ActionPerformed(evt);
            }
        });

        jPasswordField_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_2ActionPerformed(evt);
            }
        });

        jLabel_EmptyuserName_.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_EmptyuserName_.setText("*enter the username");
        jLabel_EmptyuserName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyuserName_MouseClicked(evt);
            }
        });

        jLabel_Emptypassword_.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_Emptypassword_.setText("*enter the password");
        jLabel_Emptypassword_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Emptypassword_MouseClicked(evt);
            }
        });

        jCheckBox_setOwner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox_setOwner.setText("Make this User an Owner");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_EmptyFirstName_)
                                    .addComponent(jLabel_EmptyLastName_)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jButton_Add_, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel_EmptyuserName_)
                                .addComponent(jPasswordField_1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_Emptypassword_))
                            .addComponent(jCheckBox_setOwner))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyFirstName_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyLastName_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel_EmptyuserName_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel_Emptypassword_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox_setOwner)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Add_, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseForm_MouseClicked
        // TO close the form
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseForm_MouseClicked

    private void jTextField_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FirstNameActionPerformed

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ActionPerformed
        // edit user info
       
        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String username = jTextField_Username.getText();
        String password_1 = String.valueOf(jPasswordField_1.getPassword());
        String password_2 = String.valueOf(jPasswordField_2.getPassword());
        String userType = "user";
        
        if(jCheckBox_setOwner.isSelected()){userType = "admin";}
        //check if the textfields are empty
        if(fname.trim().isEmpty()) //check the first name
        {
          jLabel_EmptyFirstName_.setForeground(Color.red);
        }
        else if(lname.trim().isEmpty()) //check the last name
        {
            jLabel_EmptyLastName_.setForeground(Color.red);
        } 
        else if(username.trim().isEmpty())//check the password
        {
            //jLabel_EmptyuserName_.setVisible(true);
            jLabel_EmptyuserName_.setForeground(Color.red); //check the username
        }    
        else if(password_1.trim().isEmpty())
        {
            //jLabel_Emptypassword_.setVisible(true);
            jLabel_Emptypassword_.setForeground(Color.red);

        }   
        else if(!password_1.equals(password_2)) //check the password_1 doesn't equal the password_2
        {
            
            JOptionPane.showMessageDialog(null, "Retype the correct password", "password error", 0);

        }  
               

        else       //if the textfields are not empty
        {
           try
           {
               //we need to check if this username already exists
               int id= Integer.parseInt(jTextField_ID.getText());
               if(user.checkUsernameExists(id, username))
        {
            JOptionPane.showMessageDialog(null, "This Username already exists Try Another one", "Username Error", 0);
        } 
           else
               {
                 user.editUser(id,fname, lname, username, password_1,userType);
               
                //refresh the Jtable users
                populateJtableWithUsers();
                
                  //to clear text from the textfields
                jTextField_ID.setText("");
                jTextField_FirstName.setText("");
                jTextField_LastName.setText("");
                jTextField_Username.setText("");
                jPasswordField_1.setText("");
                jPasswordField_2.setText("");
                jCheckBox_setOwner.setSelected(false);
                
                //hide jlabels
                hideLabels(); 
                
               }
                
           }
           catch(NumberFormatException ex)
           {
                JOptionPane.showMessageDialog(null, "Select the User you want to Edit from the Table", "No ID selected", 0);
           }
           
           
        //to refresh Jtable with Genres
       // populateJtableWithAuthors();
        }
        
    }//GEN-LAST:event_jButton_Edit_ActionPerformed

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed
        // TO delete the selected author
       try 
       
       {
        int id = Integer.parseInt(jTextField_ID.getText());
        
        //show confirmation message before removing the user
        int confirm = JOptionPane.showConfirmDialog(null,"Are you sure you want to Delete this Author?", "Confirmation Box",JOptionPane.YES_NO_OPTION);
         
         if (confirm == JOptionPane.YES_OPTION)
            {
             user.removeUser(id);
            }
      
        //refresh the Jtable users
        populateJtableWithUsers();
        
        //to clear text from the textfields
        jTextField_ID.setText("");
        jTextField_FirstName.setText("");
        jTextField_LastName.setText("");
        jTextField_Username.setText("");
        jPasswordField_1.setText("");
        jPasswordField_2.setText("");
        jCheckBox_setOwner.setSelected(false);
        
        //hide jlabels
        hideLabels();
        
        }
       catch (NumberFormatException ex) 
        {
            JOptionPane.showMessageDialog(null, "Invalid User ID - " + ex.getMessage(),"error", 0);  
        }
       
        
    }//GEN-LAST:event_jButton_Delete_ActionPerformed

    private void jButton_Add_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ActionPerformed
        // TO add a new Admin type user
        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String username = jTextField_Username.getText();
        String password_1 = String.valueOf(jPasswordField_1.getPassword());
        String password_2 = String.valueOf(jPasswordField_2.getPassword());
        String userType = "admin";
        
        //to make user an owner
        if(jCheckBox_setOwner.isSelected()){userType = "owner";}
        //check if the textfields are empty
        if(fname.trim().isEmpty()) //check the first name
        {
          jLabel_EmptyFirstName_.setForeground(Color.red);
        }
        else if(lname.trim().isEmpty()) //check the last name
        {
            jLabel_EmptyLastName_.setForeground(Color.red);
        } 
        else if(username.trim().isEmpty())//check the password
        {
            //jLabel_EmptyuserName_.setVisible(true);
            jLabel_EmptyuserName_.setForeground(Color.red); //check the username
        }    
        else if(password_1.trim().isEmpty())
        {
            //jLabel_Emptypassword_.setVisible(true);
            jLabel_Emptypassword_.setForeground(Color.red);

        }   
        else if(!password_1.equals(password_2)) //check the password_1 doesn't equal the password_2
        {
            
            JOptionPane.showMessageDialog(null, "Retype the correct password", "password error", 0);

        }  
        //we need to check if this username already exists
        else if(user.checkUsernameExists(0, username))
        {
            JOptionPane.showMessageDialog(null, "This Username already exists Try Another one", "Username Error", 0);
        }        

        else       //if the textfields are not empty
        {
           
           user.addUser(fname, lname, username, password_1,userType);
           
            //refresh the Jtable users
            populateJtableWithUsers();
            
              //to clear text from the textfields
            jTextField_ID.setText("");
            jTextField_FirstName.setText("");
            jTextField_LastName.setText("");
            jTextField_Username.setText("");
            jPasswordField_1.setText("");
            jPasswordField_2.setText("");
            jCheckBox_setOwner.setSelected(false);
            
            //hide jlabels
            hideLabels();
        }
    }//GEN-LAST:event_jButton_Add_ActionPerformed

    private void jTable_Users_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Users_MouseClicked
        // TO display the selected author
        
        //To get the selected row index
        int index = jTable_Users_.getSelectedRow();
        
        //to get values
        String id = jTable_Users_.getValueAt(index, 0).toString();
        String firstName = jTable_Users_.getValueAt(index, 1).toString();
        String lastName = jTable_Users_.getValueAt(index, 2).toString();
        String username = jTable_Users_.getValueAt(index, 3).toString();
        String password = jTable_Users_.getValueAt(index, 4).toString();
        String userType = jTable_Users_.getValueAt(index, 5).toString();
        
        //to show data in textfields
        jTextField_ID.setText(id);
        jTextField_FirstName.setText(firstName);
        jTextField_LastName.setText(lastName);
        jTextField_Username.setText(username);
        jPasswordField_1.setText(password);
        jPasswordField_2.setText(password);
        
        if(userType.equals("admin"))   
        {
            jCheckBox_setOwner.setSelected(true);
        }
        else
        {
            jCheckBox_setOwner.setSelected(false);
        }
    }//GEN-LAST:event_jTable_Users_MouseClicked

    
    private void jLabel_EmptyFirstName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyFirstName_MouseClicked
        // TO hide this jlabel on click
        jLabel_EmptyFirstName_.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_EmptyFirstName_MouseClicked

    private void jTextField_LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LastNameActionPerformed

    private void jLabel_EmptyLastName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyLastName_MouseClicked
        jLabel_EmptyLastName_.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_EmptyLastName_MouseClicked

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed

    private void jPasswordField_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_1ActionPerformed

    private void jPasswordField_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_2ActionPerformed

    private void jLabel_EmptyuserName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyuserName_MouseClicked
         jLabel_EmptyuserName_.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_EmptyuserName_MouseClicked

    private void jLabel_Emptypassword_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Emptypassword_MouseClicked
         jLabel_Emptypassword_.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_Emptypassword_MouseClicked

    
    //create a method to hide all jlabels (red messages)
    public void hideLabels()
    {
        jLabel_EmptyFirstName_.setForeground(Color.white);
        jLabel_EmptyLastName_.setForeground(Color.white); 
        jLabel_Emptypassword_.setForeground(Color.white);
        jLabel_EmptyuserName_.setForeground(Color.white);
    }
    
    
//to create a function to populate the jtable with authors
    public void populateJtableWithUsers()
    {
        
        ArrayList<my_classes.Users> usersList = user.usersList();
        
        //jtable columns
        String[] colNames = {"ID", "First Name", "Last Name", "Username", "Password", "Type"} ; 
        
        //rows
        Object[][] rows = new Object[usersList.size()][colNames.length];
        
        
        for(int i = 0; i < usersList.size(); i++)
        {
            rows [i] [0] = usersList.get (i) .getId();
            rows [i] [1] = usersList.get (i).getFirstname();
            rows [i] [2] = usersList.get (i).getLastname();
            rows [i] [3] = usersList.get (i).getUsername();
            rows [i] [4] = usersList.get (i).getPassword();
            rows [i] [5] = usersList.get (i).getUserType();
        }    
        
        DefaultTableModel model = new DefaultTableModel (rows, colNames);
        jTable_Users_.setModel(model);
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUsersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JCheckBox jCheckBox_setOwner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_EmptyFirstName_;
    private javax.swing.JLabel jLabel_EmptyLastName_;
    private javax.swing.JLabel jLabel_Emptypassword_;
    private javax.swing.JLabel jLabel_EmptyuserName_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_1;
    private javax.swing.JPasswordField jPasswordField_2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Users_;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_LastName;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
