/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_classes;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Helili
 */
public class Func_Class {
    
   public void displayImage(int width, int height, String imagePath, JLabel label) //to create function to display the image in jLabel
    {
        ImageIcon imgIco = new ImageIcon(getClass().getResource(imagePath)); //to get the image
        Image image = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH); //to make the image fit the jLabel
        label.setIcon(new ImageIcon(image)); //to set the image into the jLabel
        
        
    }
   public void displayImageUsingArray(int width, int height, byte[] image, JLabel label)
    {
        ImageIcon imgIco = new ImageIcon(image); 
        Image image2 = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(image2));
    }
   
   public void chooseImage (int width, int height, String imagePath, JLabel label)
   {
     ImageIcon imgIco = new ImageIcon(imagePath);  
     Image image = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH); //to make the image fit the jLabel
     label.setIcon(new ImageIcon(image)); //to set the image into the jLabel
   }
   
   //to create a function to customize the jtable
   public void customTable (JTable table)
   {
   //to customize the jtable
       table.setSelectionBackground(new Color(0, 0, 102));
       table.setSelectionForeground(Color.white);
       table.setRowHeight(30);
       table.setShowGrid(false);
       table.setShowHorizontalLines(true);
       table.setGridColor(Color.gray);
       
   }   
   
   //to create a function to customize the jtable Header
   public void customTableHeader(JTable table, Color back_Color, Integer fontSize)
   {
       table.getTableHeader().setBackground(Color.blue);
       table.getTableHeader().setForeground(Color.black);
       table.getTableHeader().setOpaque(false);
   }        
   
   
   //to create a function to select image
   //the function will return the image path
   public String selectImage()
   {
   // to select picture fromthe computer
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Profile Picture");
        
        fileChooser.setCurrentDirectory(new File("C:\\images"));
        
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Image", ".png", ".jpg", ".jpeg");
        fileChooser.addChoosableFileFilter(extensionFilter);
        
        int fileState = fileChooser.showSaveDialog(null);
        String path = "";
        
        if(fileState == JFileChooser.APPROVE_OPTION)
        {
             path = fileChooser.getSelectedFile().getAbsolutePath();
                        
        }
        return path;  
   }        
   
   //to create a function to return a resultset
   //this may help to reduce the code when populating the arraylist
   public ResultSet getData(String query)
   {
        PreparedStatement ps;
        ResultSet rs = null;
        
        
        try {
            ps = DB.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
   }   
   
   //to create a function to count the number of data
   public int countData(String tableName)
   {
       int total = 0;
       ResultSet rs;
       Statement st;
       
       try {
           st = DB.getConnection().createStatement();
           rs = st.executeQuery("SELECT COUNT(*) as total FROM `"+tableName+"`");
            if(rs.next())
            {
                total = rs.getInt("total");
            }
       } catch (SQLException ex) {
           Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
       }
       return total;
   }

   /* void displayImage(int width, int height, byte[] image, String name, JLabel jLabel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
   
  
   
}
