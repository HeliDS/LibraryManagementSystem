/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_forms;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import my_classes.DB;
import my_classes.Func_Class;
import my_classes.Member;


/**
 *
 * @author Helili
 */
public class DeleteBookForm extends javax.swing.JFrame {
 my_classes.Book Book  = new my_classes.Book();
 my_classes.Func_Class func = new my_classes.Func_Class();
 my_classes.Member member = new my_classes.Member();  
 //my_classes.Func_Class func = new my_classes.Func_Class();
 my_classes.Genre genre = new my_classes.Genre();
 HashMap<String, Integer> genresMap = genre.getGenresMap();
 
    String imagePath = null;
 
    /**
     * Creates new form MembersListForm
     */
    public DeleteBookForm() {
        initComponents();
        
        
        //to center the form
    this.setLocationRelativeTo(null);
    
    
    //to display image in the top
       my_classes.Func_Class func = new my_classes.Func_Class();
       func.displayImage(70, 90, "/my_images/bookk.png", jLabel_FormTitle);//to display image in the top
       
      //to populate jcombobox with genres
      
      
      
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jButton_Cancel = new javax.swing.JButton();
        jButton_Remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel_FormTitle.setBackground(new java.awt.Color(204, 102, 0));
        jLabel_FormTitle.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("      Remove Book");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm_.setBackground(new java.awt.Color(204, 102, 0));
        jLabel_CloseForm_.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_CloseForm_.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CloseForm_.setText("    X");
        jLabel_CloseForm_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm_.setOpaque(true);
        jLabel_CloseForm_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseForm_MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Enter the book ID:");

        jTextField_ID.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jButton_Cancel.setBackground(new java.awt.Color(255, 153, 0));
        jButton_Cancel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton_Cancel.setText("Cancel");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        jButton_Remove.setBackground(new java.awt.Color(255, 153, 0));
        jButton_Remove.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton_Remove.setText("Remove Book");
        jButton_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jButton_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RemoveActionPerformed
        // to add a new book
             Integer id = Integer.parseInt(jTextField_ID.getText());
            
            //to show confirmation message before deleting
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Book?","Confirmation Box",JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION)
            {
            Book.removeBook(id);
            }
            else
            {
            System.out.println("Cancel");
            }
            
        /*System.out.println("path1=" + path);
        my_classes.Book book = new my_classes.Book();
        String isbn = null;
        String name = null;
        String publisher = null;
        String description = null;
        String author_name = null;
        Integer genre_id = null;
        String genre_name = null;
        Integer author_id = null;
        Integer quantity = null;
        java.util.Date dateofrecieved = null;
        java.sql.Date datePrepared = null;
        Double price = null;

        try {
            //to get values
            isbn= jTextField_ID.getText();

            name = jTextField_Name.getText();
            publisher = jTextField_Publisher.getText();
            description = jTextArea_Description.getText();

            author_name = jTextField_Author.getText();
            String query2 ="SELECT id FROM `author` WHERE concat(firstName,\" \", lastName)LIKE '"+ author_name+"'";
            PreparedStatement ps2 = DB.getConnection().prepareStatement(query2);
            //            System.out.println("ps2= "+ps2);
            ResultSet rs2 = ps2.executeQuery();

            while(rs2.next())
            {
                author_id = rs2.getInt("id");
            }

            //             System.out.println("rs2= " +author_id);

            //            System.out.println("t5");
            genre_name =   (String) jComboBox_Genre.getSelectedItem();
            String query ="SELECT id FROM `book_genres` WHERE name='"+genre_name+"'";
            PreparedStatement ps = DB.getConnection().prepareStatement(query);
            // System.out.println("ps= " +ps);
            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                genre_id = rs.getInt("id");
            }
            //            System.out.println("rs= " +genre_id);

            quantity = Integer.parseInt(jSpinner_Quantity.getValue().toString());

            price = Double.parseDouble(jTextField_Price.getText());

            dateofrecieved = jDateChooser_DateOFReceieved.getDate();
            datePrepared = new java.sql.Date(dateofrecieved.getTime());

            //            System.out.println("dateofrecieved= "+dateofrecieved);
            System.out.println("sqlStartDate= "+datePrepared);

        } catch (Exception e) {
            System.out.println("e= "+e);
        }

        if(isbn.isEmpty())
        {
            jLabel_EmptyISBN.setVisible(true);
        }
        else if (book.isISBNexists(isbn))
        {
            JOptionPane.showMessageDialog(null,"This ISBN already exists", "Wrong ISBN", 2);
        }

        else if(quantity == null)
        {System.out.println("t1");
            jLabel_EmptyQuantity.setVisible(true);
        }
        else if(price == null)
        {
            jLabel_EmptyPrice.setVisible(true);

        }
        else if(dateofrecieved == null)
        {
            jLabel_EmptyDateofRecieved.setVisible(true);
            System.out.println("date work");
        }
        else //if the textfields are not empty
        {
            byte[] img = null;

            imagePath = path;

            System.out.println("imagePath=" + imagePath);
            System.out.println("path=" + path);

            if(imagePath != null)
            {
                System.out.println("t2=" +imagePath);
                try {

                    Path path = Paths.get(imagePath);
                    img = Files.readAllBytes(path);
                    System.out.println("t1");
                    Book.addBook(isbn, name, author_id, genre_id, quantity,  publisher, price, datePrepared, description, img);
                    System.out.println("t2");
                } catch (IOException ex) {
                    Logger.getLogger(DeleteBookForm.class.getName()).log(Level.SEVERE, null, ex);

                }

            }else
            {
                JOptionPane.showMessageDialog(null, "Select a Cover for this Book", "No Cover Selected",2);
            }

        }*/
    }//GEN-LAST:event_jButton_RemoveActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        // to close the window
        this.dispose();

    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseForm_MouseClicked
        // TO close the form
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseForm_MouseClicked

    
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
            java.util.logging.Logger.getLogger(DeleteBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Remove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_ID;
    // End of variables declaration//GEN-END:variables

//    private static class func {
//
//        private static String selectImage() {
////            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            
//                ImageIcon imgIco = new ImageIcon(getClass().getResource(imagePath)); //to get the image
//
//            Image image = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH); //to make the image fit the jLabel
//
//            label.setIcon(new ImageIcon(image)); //to set the image into the jLabel
//        }
//
//        private static void displayImage(int i, int i0, Object object, String path, JLabel jLabel_Image) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        public func() {
//        }
//    }
}
