/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_classes;

import java.awt.Color;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author Helili
 */
public class Func_Class {
    
   public void displayImage(int width,int height, String imagePath,JLabel label) //to create function to display the image in jLabel
    {
        
        ImageIcon imgIco = new ImageIcon(getClass().getResource(imagePath)); //to get the image
        
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
    
}
