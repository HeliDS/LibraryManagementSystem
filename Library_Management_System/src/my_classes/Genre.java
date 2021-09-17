/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Helili
 */
public class Genre {
    
    private int id;
    private String name;
    private String rack;
    
    //constructors
    public Genre(){};
    
    public Genre(int _id, String _name, String _rack)
    {
      this.id = _id;
      this.name = _name;
      this.rack = _rack;
    }
     
    //getters and setters
    public void setId(int _id) {
        this.id = _id;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public void setRack(String rack) {
        this.rack = rack;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRack() {
        return rack;
    }
    
    //functions
    
    my_classes.Func_Class func = new Func_Class();
    
    //to insert a new genre function
    public void addGenre(String _name, String _rack)
    {
        String insertQuery = "INSERT INTO `book_genres`(`name`,`rack`) VALUES (?,?)";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1, _name);
            ps.setString(2, _rack);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Genre Added", "add genre", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Genre Not Added", "add genre", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
  
    //to edit genre by id function
    public void editGenre(int _id, String _name, String _rack)
    {
        String editQuery = "UPDATE `book_genres` SET `id`=?,`name`= ?, `rack`=? WHERE `id`= ?";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            ps.setInt(1, _id);
            ps.setString(2, _name);
            ps.setString(3,_rack);
            ps.setInt(4, _id);

            
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Genre Edited", "edit genre", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Genre Not Edited", "edit genre", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
    }
    
    //to remove genre by id function
    public void removeGenre(int _id)
    {
        String editQuery = "DELETE FROM `book_genres` WHERE `id`= ?";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            ps.setInt(1, _id);
            
            
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Genre Deleted", "delete genre", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Genre Not Deleted", "delete genre", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
   //function to populate an arrayList with genres
    public ArrayList<Genre> genreList()
    {
        ArrayList<Genre> gList = new ArrayList<>();
        
        
       
          
        try {
            ResultSet rs;
            rs = func.getData("SELECT * FROM `book_genres`");
            
            Genre genre;
            
            while(rs.next())
            {
                genre = new Genre(rs.getInt("id"), rs.getString("name"),rs.getString("rack"));
                gList.add(genre);
            }    
            
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return gList;
    }
    
    //to create a function to return a hashmap
    //string is the key
    //integer is the value
    public HashMap<String, Integer> getGenresMap()
    {
        HashMap<String, Integer> map =new HashMap<>();
     try {
            ResultSet rs;
            rs = func.getData("SELECT * FROM `book_genres`");
            
            Genre genre;
            
            while(rs.next())
            {
                genre = new Genre(rs.getInt("id"), rs.getString("name"), rs.getString("rack"));
                map.put(genre.getName(), genre.getId());
            }    
            
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     return map;
    }
    
   //to create a function to get genre by id
    public Genre getGenreById(Integer id)
    {
    ResultSet rs = func.getData("SELECT * FROM `book_genres` where id = "+id);
            
            Genre genre = null;
            
        try {
            while(rs.next())
           
            {
                genre = new Genre(rs.getInt("id"), rs.getString("name"), rs.getString("rack"));
                
            }  
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
            return genre;
    } 
    
}
