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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Helili
 */
public class Users {
  
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private String contact;
    private String username;
    private String password;
    private String userType; //admin or simple user

   
    
    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

     public String getUserType() {
        return userType;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }
     
     
    
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    
    
    public Users() {
    }

    public Users(int _id, String _firstname, String _lastname, String _email, String _address, String _contact, String _username, String _password, String _user_type) {
        this.id = _id;
        this.firstname = _firstname;
        this.lastname = _lastname;
        this.email = _email;
        this.address = _address;
        this.contact = _contact;
        this.username = _username;
        this.password = _password;
        this.userType = _user_type;
    }
    
    my_classes.Func_Class func = new Func_Class();
    
    //to insert a new user function
    public void addUser(String _fname, String _lname, String _email, String _address, String _contact, String _username, String _password, String _user_type)
    {
        String insertQuery = "INSERT INTO `employee`(`firstName`, `lastName`, `email address`, `address`, `contact no` , `username`, `password`, `user_type`) VALUES (?,?,?,?,?,?,?,?)";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _email);
            ps.setString(4, _address);
            ps.setString(5, _contact);
            ps.setString(6, _username);
            ps.setString(7, _password);
            ps.setString(8, _user_type);
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "User Added", "add User", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User Not Added", "add User", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //to create a function to check if the username already exists
    public boolean checkUsernameExists(int _id, String _username)
    {
    ResultSet rs = func.getData("SELECT * FROM `employee` WHERE `username` = '"+ _username +"' and id <> " + _id);
    boolean exists = false;        
           
            
        try {
           if(rs.next())
           
            {
               exists = true;
                
            }  
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
         return exists;
    }
 
    
    //to edit user by id function
    public void editUser(int _id, String _fname, String _lname, String _email, String _address, String _contact, String _username, String _password, String _user_type)
    {
        String editQuery = "UPDATE `employee` SET `firstName`= ?,`lastName`= ?,`email address`=?,`address`=?,`contact no`=?,`username`= ?,`password`= ?, `user_type` =? WHERE `id`=?";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
             
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _email);
            ps.setString(4, _address);
            ps.setString(5, _contact);
            ps.setString(6, _username);
            ps.setString(7, _password);
            ps.setString(8, _user_type);
            ps.setInt(9, _id);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "User Edited", "edit user", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User Not Edited", "edit user", 2);
            }
            
        } catch (SQLException ex) {
            
            if(_contact.length()>10){
                JOptionPane.showMessageDialog(null, "Enter a valid Contact Number (should contain less than 10 numbers)", "Invalid Contact Number", 0);
            }else{
                Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage() , "Error from DB Side", 0);
            }
            

        } 
    }
   
     //to remove user  
      public void removeUser(int _id)
    {
        String removeQuery = "DELETE FROM `employee` WHERE `id`= ?";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            
             ps.setInt(1, _id);
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "User Deleted", "remove", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User Not Deleted", "remove", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //function to populate an arrayList with users
    public ArrayList<Users> usersList()
    {
        ArrayList<Users> uList = new ArrayList<>();
        
        
        
       
        try {
            
            //don't show the owner data
            ResultSet rs = func.getData("SELECT * FROM `employee`where user_type <> 'owner'");
            
            Users user;
            
            while(rs.next())
           
            {
                //`id`, `firstName`, `lastName`, `username`,`password`,`user_type`
                user = new Users(rs.getInt("id"), rs.getString("firstName"),rs.getString("lastName"),rs.getString("email address"),rs.getString("address"),rs.getString("contact no"),rs.getString("username"),rs.getString("password"), rs.getString("user_type"));
                uList.add(user);
            } 
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return uList;
    }
    
    //create a function to allow the user to login
    public Users tryLogin(String _username, String _password)
    {
       
        ResultSet rs = func.getData("SELECT * FROM `employee` where username = '"+_username+"' and password = '"+_password+"'");
            
            Users user = null;
            
        try {
            while(rs.next())
           
            {
                user = new Users(rs.getInt("id"), rs.getString("firstName"),rs.getString("lastName"),rs.getString("email address"),rs.getString("address"),rs.getString("contact no"),rs.getString("username"),rs.getString("password"),rs.getString("user_type"));
                
            }  
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        return user;
    
    }
}


