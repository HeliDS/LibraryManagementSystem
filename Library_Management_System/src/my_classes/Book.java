/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_classes;

import java.awt.Image;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Helili
 */
public class Book {
    
    private Integer id;
    private String isbn;
    private String name;
    private Integer author_id;
    private Integer genre_id;
    private Integer quantity;
    private String publisher;
    private double price;
    private Date dateofrecieved;
    private String description;
    private byte[] cover;
    
    public Book() {}
    
    public Book(Integer _id, String _isbn,String _name, Integer _author_id,Integer _genre_id,Integer _quantity,String _publisher,double _price,Date _dateofrecieved,String _description,byte[] _cover)
    {
        this.id = _id;
        this.isbn = _isbn;
        this.name = _name;
        this.author_id = _author_id;
        this.genre_id = _genre_id;
        this.quantity= _quantity;
        this.publisher = _publisher;
        this.price = _price;
        this.dateofrecieved = _dateofrecieved;
        this.description = _description;
        this.cover =  _cover;  
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public void setGenre_id(Integer genre_id) {
        this.genre_id = genre_id;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDateofrecieved(Date dateofrecieved) {
        this.dateofrecieved = dateofrecieved;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

    public Integer getId() {
        return id;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public Integer getGenre_id() {
        return genre_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getPrice() {
        return price;
    }

    public Date getDateofrecieved() {
        return dateofrecieved;
    }

    public String getDescription() {
        return description;
    }

    public byte[] getCover() {
        return cover;
    }
    
    Func_Class func = new Func_Class();
    
     //to insert a new book function
    public void addBook(String _isbn,String _name, Integer _author_id, Integer _genre_id, Integer _quantity, String _publisher, double _price, Date _dateofrecieved, String _description, byte[] _cover)
    {
        String insertQuery = "INSERT INTO `books`(`isbn`, `name`, `author_id`, `genre_id`,`quantity`, `publisher`, `price`, `dateofrecieved`, `description`, `cover_image`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1, _isbn);
            ps.setString(2, _name);
            ps.setInt(3, _author_id);
            ps.setInt(4, _genre_id);
            ps.setInt(5, _quantity);
            ps.setString(6, _publisher);
            ps.setDouble(7, _price);
            ps.setDate(8, (java.sql.Date) _dateofrecieved);
            ps.setString(9, _description);
            ps.setBytes(10, _cover);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Book Added", "add Book", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Book Not Added", "add Book", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    } 

     //to edit selected book info
    public void editBook(int _id,String _name, Integer _author_id, Integer _genre_id, Integer _quantity, String _publisher, double _price, Date _dateofrecieved, String _description, byte[] _cover)
    {
        String updateQuery;
        PreparedStatement ps;
        
        try{
        
        if(_cover != null) //if want to update the book image
        {
            updateQuery = "UPDATE `books` SET `name`=?,`author_id`=?,`genre_id`=?,`quantity`=?,`publisher`=?,`price`=?,`dateofrecieved`=?,`description`=?,`cover_image`=? WHERE `id`=?";

             ps = DB.getConnection().prepareStatement(updateQuery);
            
            //ps.setString(1, _isbn);
            ps.setString(1, _name);
            ps.setInt(2, _author_id);
            ps.setInt(3, _genre_id);
            ps.setInt(4, _quantity);
            ps.setString(5, _publisher);
            ps.setDouble(6, _price);
            ps.setDate(7, (java.sql.Date) _dateofrecieved);
            ps.setString(8, _description);
            ps.setBytes(9, _cover);
            ps.setInt(10, _id);
        } 
        else 
        {
             updateQuery = "UPDATE `books` SET `name`=?,`author_id`=?,`genre_id`=?,`quantity`=?,`publisher`=?,`price`=?,`dateofrecieved`=?,`description`=? WHERE `id`=?";
            
            ps = DB.getConnection().prepareStatement(updateQuery);
             //ps.setString(1, _isbn);
            ps.setString(1, _name);
            ps.setInt(2, _author_id);
            ps.setInt(3, _genre_id);
            ps.setInt(4, _quantity);
            ps.setString(5, _publisher);
            ps.setDouble(6, _price);
            ps.setDate(7, (java.sql.Date) _dateofrecieved);
            ps.setString(8, _description);
           // ps.setBytes(9, _cover);
            ps.setInt(10, _id);
        }
        
       
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Book Edited", "edit Book", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Book Not Edited", "edit Book", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    //to create a function to check if the isbn already exists
    public boolean isISBNexists(String _isbn)
    {
        String query = "SELECT * FROM `books` WHERE `isbn` = '"+_isbn+"'";
        
        ResultSet rs = func.getData(query);
        try {
            if(rs.next()){
                return true;
            }
            else
            {
                return false;
            }
        } catch (SQLException ex) 
        {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public Book searchBookbyID_ISBN(int _id, String _isbn)
    {
        String query = "SELECT * FROM `books` WHERE `id` = "+_id+" or `isbn` = '"+_isbn+"'";
        ResultSet rs = func.getData(query);
        Book book = null;
       
        try {
            if(rs.next())
            {
               book = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getDouble(8), rs.getDate(9), rs.getString(10), rs.getBytes(11));
            }
            else
            {
               return null; 
            }
        } catch (SQLException ex) 
        {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return book;
}

    public void removeBook(Integer id) {
        String removeQuery = "DELETE FROM `books` WHERE `id`= ?";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            
             ps.setInt(1, id);
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Book Deleted", "remove Book", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Book Not Deleted", "remove Book", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //function to populate an arrayList with books
    public ArrayList<Book> booksList(String query)
    {
        ArrayList<Book> bList = new ArrayList<>();
        
        
        
       
        try {
            if (query.equals("")) //if the user enter empty string make this the default select
            {
                query = "SELECT * FROM `books`";
            }
            
            ResultSet rs = func.getData(query);
            
            Book book;
            
            while(rs.next())
           
            {
                book = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getDouble(8), rs.getDate(9), rs.getString(10), rs.getBytes(11));
                bList.add(book);
            }    
            
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return bList;
}
//to get book by id
     public Book getBookById(Integer _id) throws SQLException
             
             {
                 //query to get the book by the id
                 String query = "SELECT * FROM `books` WHERE `id`= " +_id;
                 ResultSet rs = func.getData(query);
                 if(rs.next())
                 {
                     //return the book
                   return new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getDouble(8), rs.getDate(9), rs.getString(10), rs.getBytes(11));
                           
                 }
                 else{
                     return null;
                 }
             }    
    
   public void setQuantity_Minus_One(int _book_id, int _quantity)
   {
       String updatequantityQuery;
        PreparedStatement ps;
        
        try{
        
            updatequantityQuery = "UPDATE `books` SET `quantity`=? WHERE `id`=?";

            ps = DB.getConnection().prepareStatement(updatequantityQuery);
            ps.setInt(1, _quantity);
            ps.setInt(2, _book_id);
        
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "This Book is set to Lost -> The Quantity = Quantity - 1", "edit Book Quantity", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Book Quantity Not Edited", "edit Book Quantity", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   //create a function to display the latest 5 books
  //for that, pass an array of jlabels as a parameter
  public void displayBooksCover(JLabel[] labels_tab)
   {
       ResultSet rs;
       Statement st;
       
       try {
           st = DB.getConnection().createStatement();
           rs = st.executeQuery("SELECT `cover_image` FROM `books` LIMIT 5");
           byte[] image;
           int i = 0;//to populate the labels_tab items with image
           while(rs.next())
            {
              image = rs.getBytes("cover_image");
                
                
                
       func.displayImageUsingArray(labels_tab[i].getWidth(), labels_tab[i].getHeight(), image, labels_tab[i]);
              i++;        
            }
       } catch (SQLException ex) {
           Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
       }
      
   }
   }
   

