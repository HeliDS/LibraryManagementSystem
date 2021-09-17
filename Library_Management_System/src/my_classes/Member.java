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
public class Member {
    
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    private String gender;
    private byte[] picture;
    private String username;
    private String password;
    private String userType;

    private Member(int id, String firstName, String lastName, String address, String phone, String email, String gender, byte[] picture, String username, String password) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.id = id;
        this.firstName = firstName;
        this.lastName =lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.picture  = picture;
        this.username = username;
        this.password = password;
    }
    
    private Member(int id, String firstName, String lastName, String username, String password, String userType) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.id = id;
        this.firstName = firstName;
        this.lastName =lastName;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    

    public Member() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
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
    

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public byte[] getPicture() {
        return picture;
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
    

    
    my_classes.Func_Class func = new Func_Class();
    
    //functions
    //to insert a new member function
    public void addMember(String _fname, String _lname, String _address, String _phone, String _email, String _gender, byte[] _picture, String _username, String _password)
    {
        String insertQuery = "INSERT INTO `members`(`firstName`, `lastName`, `address`, `phone`, `email`, `gender`, `picture`,`username`,`password`) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _address);
            ps.setString(4, _phone);
            ps.setString(5, _email);
            ps.setString(6, _gender);
            ps.setBytes(7, _picture);
            ps.setString(8,_username);
            ps.setString(9,_password);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Member Added", "add Member", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Member Not Added", "add Member", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    } 
    
    
    //to edit member 
    public void editMember(Integer _id, String _fname, String _lname, String _address, String _phone, String _email, String _gender, byte[] _picture)
    {
        String editQuery = "UPDATE `members` SET `firstName`=?,`lastName`=?,`address`=?,`phone`=?,`email`=?,`gender`=?,`picture`=? WHERE `id`=?";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
             
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _address);
            ps.setString(4, _phone);
            ps.setString(5, _email);
            ps.setString(6, _gender);
            ps.setBytes(7, _picture);
            ps.setInt(8, _id);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Member Edited", "edit Member", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Member Not Edited", "edit Member", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
    }
   
   //to edit member 
    public void editMember( String _fname, String _lname, String _address, String _phone, String _email, String _gender, byte[] _picture, String _username, String _password)
    {
        String editQuery = "UPDATE `members` SET `firstName`=?,`lastName`=?,`address`=?,`phone`=?,`email`=?,`gender`=?,`picture`=?,`username`=?,`password`=? WHERE `username`=?";
//        where username = '"+_username+"' and password = '"+_password+"'
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
             
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _address);
            ps.setString(4, _phone);
            ps.setString(5, _email);
            ps.setString(6, _gender);
            ps.setBytes(7, _picture);
            ps.setString(8, _username);
            ps.setString(9, _password);
            ps.setString(10, _username);
//             ps.setString(11, _password);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Member Edited", "edit Member", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Member Not Edited", "edit Member", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
    }  
    
     //to remove member  
      public void removeMember(Integer _id, String _fname, String _lname, String _address, String _phone, String _email, String _gender, byte[] _picture)
    {
        String removeQuery = "DELETE FROM `members` WHERE `id`= ?";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            
             ps.setInt(1, _id);
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Member Deleted", "remove Member", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Member Not Deleted", "remove Member", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
      
      //to get member by id
     public Member getMemberById(Integer _id) throws SQLException
             {
                 
                 Func_Class func = new Func_Class();
                 String query = "SELECT * FROM `members` WHERE `id`= " +_id;
                 ResultSet rs = func.getData(query);
                 if(rs.next())
                 {
                   return new Member(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getBytes(8), rs.getString(9), rs.getString(10));
                           
                 }
                 else{
                     return null;
                 }
             }

    public void removeMember(Integer id) {
        String removeQuery = "DELETE FROM `members` WHERE `id`= ?";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            
             ps.setInt(1, id);
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Member Deleted", "remove Member", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Member Not Deleted", "remove Member", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editMember(int id, String fname, String lname, String address, String phone, String email, String gender) {
    String editQuery = "UPDATE `members` SET `firstName`= ? ,`lastName`= ? ,`address`= ?,`phone`= ?,`email`=?,`gender`=?  WHERE `id`=?";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
             
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, address);
            ps.setString(4, phone);
            ps.setString(5, email);
            ps.setString(6, gender);
            ps.setInt(7, id);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Member Edited", "edit member", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Member Not Edited", "edit member", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    
    //function to populate an arrayList with members
    public ArrayList<Member> membersList(String query)
    {
        ArrayList<Member> mList = new ArrayList<>(); //mList = reference
        
        my_classes.Func_Class func = new Func_Class();
        
       
        try {
            
            if (query.equals("")) //if the user enter empty string make this the default select
            {
                query = "SELECT * FROM `members`";
            }
            
            ResultSet rs = func.getData(query);
            
            Member member;
            
            while(rs.next())
           
            {
                member = new Member(rs.getInt("id"), rs.getString("firstName"),rs.getString("lastName"),rs.getString("address"),rs.getString("phone"),rs.getString("email"),rs.getString("gender"),rs.getBytes("picture"),rs.getString("username"),rs.getString("password"));
                mList.add(member);
            }    
            
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mList;
    }
    
    //to create a function to check if the username already exists
    public boolean checkUsernameExists(int _id, String _username)
    {
    ResultSet rs = func.getData("SELECT * FROM `members` WHERE `username` = '"+ _username +"' and id <> " + _id);
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
    
    //create a function to allow the user to login
    public Member tryLogin(String _username, String _password)
    {
       
        ResultSet rs = func.getData("SELECT * FROM `members` where username = '"+_username+"' and password = '"+_password+"'");
            
            Member member = null;
            
        try {
            while(rs.next())
           
            {
                member = new Member(rs.getInt("id"), rs.getString("firstName"),rs.getString("lastName"),rs.getString("username"),rs.getString("password"), "user");
                System.out.println("try mem = "+member.getUserType());
            }  
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return member;
    
    }
}