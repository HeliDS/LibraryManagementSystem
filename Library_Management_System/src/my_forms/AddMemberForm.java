/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_forms;

import my_classes.Member;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import my_classes.Func_Class;

/**
 *
 * @author Helili
 */
public final class AddMemberForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageGenresForm
     */
    
    //to create a member object
    my_classes.Member Member  = new my_classes.Member();
    my_classes.Func_Class func = new my_classes.Func_Class();
    
    //to create a variable to store the profile picture path
    String imagePath = null;
    
    
    public AddMemberForm() {
        initComponents();
        
        //to center the form
       this.setLocationRelativeTo(null);
       
       //to display image in the top
       
       func.displayImage(90, 70, "/my_images/addmember.png", jLabel_FormTitle);//to display image in the top
       
       //to customize the jtable
      //func.customTable(jTable_Authors_);
       
       
       //to customize the jtable header row
       /*jTable_Authors_.getTableHeader().setBackground(Color.blue);
       jTable_Authors_.getTableHeader().setForeground(Color.black);
       jTable_Authors_.getTableHeader().setOpaque(false);*/
       
       
       //to hide the jlabel "empty name message"
       jLabel_EmptyFirstName_.setVisible(false);
       jLabel_EmptyLastName_.setVisible(false);
       jLabel_EmptyPhone.setVisible(false);
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
        jTextField_FirstName = new javax.swing.JTextField();
        jButton_Add_ = new javax.swing.JButton();
        jLabel_EmptyFirstName_ = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jLabel_EmptyLastName_ = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel_EmptyPhone = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox_Gender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel_ImagePath = new javax.swing.JLabel();
        jButton_SelectProfilePicture_ = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField_Address = new javax.swing.JTextField();
        jLabel_Password = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel_Username1 = new javax.swing.JLabel();
        jPasswordField_1 = new javax.swing.JPasswordField();
        jLabel_RetypePass = new javax.swing.JLabel();
        jPasswordField_2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel_FormTitle.setBackground(new java.awt.Color(0, 0, 102));
        jLabel_FormTitle.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("   Add Member");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm_.setBackground(new java.awt.Color(0, 0, 102));
        jLabel_CloseForm_.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_CloseForm_.setForeground(new java.awt.Color(255, 255, 255));
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

        jTextField_FirstName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FirstNameActionPerformed(evt);
            }
        });

        jButton_Add_.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Add_.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton_Add_.setText("Add New Member");
        jButton_Add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ActionPerformed(evt);
            }
        });

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
        jLabel4.setText("Phone Number:");

        jTextField_Phone.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PhoneActionPerformed(evt);
            }
        });
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Email:");

        jLabel_EmptyPhone.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_EmptyPhone.setText("*enter the phone number");
        jLabel_EmptyPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyPhoneMouseClicked(evt);
            }
        });

        jTextField_Email.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EmailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Profile Picture:");

        jComboBox_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBox_Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_GenderActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Gender:");

        jLabel_ImagePath.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_ImagePath.setForeground(new java.awt.Color(0, 0, 102));
        jLabel_ImagePath.setText("Choose Profile Picture..");

        jButton_SelectProfilePicture_.setText("select profile");
        jButton_SelectProfilePicture_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SelectProfilePicture_ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Address");

        jTextField_Address.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AddressActionPerformed(evt);
            }
        });

        jLabel_Password.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_Password.setText("Password:");

        jTextField_Username.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });

        jLabel_Username1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_Username1.setText("Username:");

        jPasswordField_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_1ActionPerformed(evt);
            }
        });

        jLabel_RetypePass.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_RetypePass.setText("Retype password:");

        jPasswordField_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_SelectProfilePicture_)
                            .addComponent(jLabel_ImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(jButton_Add_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_EmptyFirstName_)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_EmptyLastName_)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_EmptyPhone))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPasswordField_1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_Username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPasswordField_2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_RetypePass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Username1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_ImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jButton_SelectProfilePicture_)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_Username1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_EmptyFirstName_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField_1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTextField_LastName)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_EmptyLastName_)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_RetypePass, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField_2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_EmptyPhone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Add_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void jButton_Add_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ActionPerformed
        // TO add a new Member
        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String address = jTextField_Address.getText();
        String phone = jTextField_Phone.getText();
        String email = jTextField_Email.getText();
        String gender = jComboBox_Gender.getSelectedItem().toString();
        String username = jTextField_Username.getText();
        String password_1 = String.valueOf(jPasswordField_1.getPassword());
        String password_2 = String.valueOf(jPasswordField_2.getPassword());
        
        //String about = jTextArea_About.getText();
        
        //check if the textfields are empty
        if(fname.trim().isEmpty())
        {
          jLabel_EmptyFirstName_.setVisible(true);
        }
        else if(lname.trim().isEmpty())
        {
            jLabel_EmptyLastName_.setVisible(true);
        }
        else if(phone.trim().isEmpty())
        {
            jLabel_EmptyPhone.setVisible(true);
        }
        else if(username.trim().isEmpty()){
            
        }
        else if(password_1.trim().isEmpty()){
            
        }
        else if(!password_1.equals(password_2)) //check the password_1 doesn't equal the password_2
        {
            
            JOptionPane.showMessageDialog(null, "Retype the correct password", "password error", 0);

        }
        else if(Member.checkUsernameExists(0, username))
        {
            JOptionPane.showMessageDialog(null, "This Username already exists Try Another one", "Username Error", 0);
        }
        else //if the textfields are not empty
        {
            byte[] img = null;
            System.out.println("t1=" + imagePath);
         
            imagePath = path;
            if(imagePath != null)
            {
                System.out.println("t2=" +imagePath); 
                try {
                    
                    Path path = Paths.get(imagePath);
                    img = Files.readAllBytes(path);
                    Member.addMember(fname, lname, address, phone, email, gender,img,username,password_1);
                    
                } catch (IOException ex) {
                    Logger.getLogger(AddMemberForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }else
            {
                JOptionPane.showMessageDialog(null, "Select a Profile Picture for this Member", "No Picture Selected",2);
            }    
            
        }
           
       
    }//GEN-LAST:event_jButton_Add_ActionPerformed
  
    
    private void jLabel_EmptyFirstName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyFirstName_MouseClicked
        // TO hide this jlabel on click
        jLabel_EmptyFirstName_.setVisible(false);
        
    }//GEN-LAST:event_jLabel_EmptyFirstName_MouseClicked

    private void jTextField_LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LastNameActionPerformed
        jLabel_EmptyLastName_.setVisible(false);
    }//GEN-LAST:event_jTextField_LastNameActionPerformed

    private void jTextField_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PhoneActionPerformed

    private void jLabel_EmptyLastName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyLastName_MouseClicked
        jLabel_EmptyLastName_.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyLastName_MouseClicked

    private void jLabel_EmptyPhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyPhoneMouseClicked
        jLabel_EmptyPhone.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyPhoneMouseClicked

    private void jTextField_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EmailActionPerformed

    private void jTextField_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AddressActionPerformed

    String path=null;
    private void jButton_SelectProfilePicture_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SelectProfilePicture_ActionPerformed
        // to select picture fromthe computer
     
        
           /* String path = func2.selectImage();
            jLabel_ImagePath.setText(path);
            imagePath = path*/
            
            
       Func_Class func2 = new Func_Class(); 
       
        
            path = func2.selectImage();

            jLabel_ImagePath.setText(path);
               // imagePath = path;

            //to display the image
            func2.chooseImage(110, 110, path, jLabel_ImagePath);    
                   
    }//GEN-LAST:event_jButton_SelectProfilePicture_ActionPerformed

    private void jTextField_PhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyPressed
        
    }//GEN-LAST:event_jTextField_PhoneKeyPressed

    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        //allow only numbers on phone jtextfields
        if(!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PhoneKeyTyped

    private void jComboBox_GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_GenderActionPerformed

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed

    private void jPasswordField_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_1ActionPerformed

    private void jPasswordField_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_2ActionPerformed


    
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
            java.util.logging.Logger.getLogger(AddMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMemberForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_;
    private javax.swing.JButton jButton_SelectProfilePicture_;
    private javax.swing.JComboBox<String> jComboBox_Gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_EmptyFirstName_;
    private javax.swing.JLabel jLabel_EmptyLastName_;
    private javax.swing.JLabel jLabel_EmptyPhone;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_ImagePath;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_RetypePass;
    private javax.swing.JLabel jLabel_Username1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_1;
    private javax.swing.JPasswordField jPasswordField_2;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_LastName;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}