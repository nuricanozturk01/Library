
package Util;

import Classes.Authors;
import Classes.Books;
import Classes.People;
import Classes.Publishers;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.management.ObjectName;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class Utility 
{
  
   
    public static ResultSet result;
    
    
    private static final String publishersQuery = "SELECT * FROM Publishers";
    private static final String booksQuery = "SELECT * FROM Books";
    private static final String peoplesQuery = "SELECT * FROM People";
    private static final String authorsQuery = "SELECT * FROM Authors";
    
  
    
    
    
    public static void showMessage(String msg , String title , int code)
    {
      
        
        switch(code)
        {
            case 0:
                code = JOptionPane.ERROR_MESSAGE;
                break;
            case 1:
                code = JOptionPane.INFORMATION_MESSAGE;
                break;
            case 2:
                code = JOptionPane.PLAIN_MESSAGE;
                break;
            case 3:
                code = JOptionPane.WARNING_MESSAGE;
                break;
                
        }
        
        JOptionPane.showMessageDialog(null, msg, title, code);
        
    }
    
    
    
    
    
    
    public static boolean isValid(String str)
    {
        if (str.isBlank() || str.isEmpty() || str == null )
        {
            JOptionPane.showMessageDialog(null, "You have to Enter the Necessary Values", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
       
        return true;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    public static ArrayList<Publishers> getPublishers(Connection connection , Statement statement) throws SQLException
    {
        
        result = statement.executeQuery(publishersQuery);
             
        ArrayList<Publishers> pub = new ArrayList<>();
        
        while (result.next())
        {
            pub.add
            (
                    new Publishers(result.getInt("publisherID") , result.getString("name") , result.getString("address") )
            );
        }
        
        result.close();
        
        return pub;
    }
    
    
    public static  boolean isCollision(String str , ArrayList<Books> books)
    {
       
        
        for (int i = 0; i < books.size() ; ++i)
        {
       
            if (str.equals(books.get(i).getISBN()))
                return true;
        }
        return false;
    }
     public static boolean isValidISBN(String isbn, ArrayList<Books> books) 
     {
         if (isbn.length() != 13)
             return false;
         
         
         if (isCollision(isbn,books))
             return false;

         else return true;
     }
    
    
    
    
    
    
    
    public static ArrayList<Books> getBooks(Connection connection , Statement statement) throws SQLException
    {
        result = statement.executeQuery(booksQuery);
             
        ArrayList<Books> books = new ArrayList<>();
        
        while (result.next())
        {
            books.add
            (
                    new Books
                    (
                        result.getInt("bookID"), result.getString("ISBN") , result.getString("title"),
                        result.getString("category") , result.getInt("page")
                    )
            );
        }
        
        result.close(); 
        
        return books;
    }
    
    public static boolean isValidGender(String c)
    {
        if ("F".equals(c) || "M".equals(c))
            return true;
        return false;
    }
    
    
    public static boolean isValidDate(String strDate)
   {
	
	if (strDate.trim().equals(""))
	{
	    return true;
	}
	
	else
	{
	  
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-mm-dd");
	    sdfrmt.setLenient(false);
	
	    try
	    {
	        java.util.Date javaDate = sdfrmt.parse(strDate); 
	     
	    }
	  
	    catch (ParseException e)
	    {
	        
	        return false;
	    }
	
	    return true;
	}
   }
    
    
    
    
    
    
    
    public static ArrayList<Authors> getAuthors(Connection connection , Statement statement) throws SQLException
    {
        result = statement.executeQuery(authorsQuery);
             
        ArrayList<Authors> authors = new ArrayList<>();
        
        while (result.next())
        {
            authors.add
            (
                    new Authors
                    (       
                            result.getInt("authorID"), result.getString("name") , result.getString("surname"),
                            result.getString("gender").charAt(0),result.getString("country") , result.getString("birthdate")
                    )
            );
        }
        
        result.close();  
        
        return authors;
    }
    
    
    
    
    
    
    
    
    
    
    public static ArrayList<People> getPeople(Connection connection , Statement statement) throws SQLException
    {
        result = statement.executeQuery(peoplesQuery);
             
        ArrayList<People> people = new ArrayList<>();
        
        while (result.next())
        {
            people.add
            (
                new People(
                    result.getInt("peopleID"), result.getString("name") , result.getString("surname"),
                    result.getString("birthdate")
                          )
            );
        }
        
        result.close(); 
        
        return people;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // COMBO BOX AREA
    
    
    
     public static void showBookBox(Connection connection , Statement statement , JComboBox<String> boxBook)
    {
         ArrayList<Books> books;
            
        try
        {
            
            books = Utility.getBooks(connection , statement);
            
            String[] arr = new String[books.size() ];
            
            for (int i = 0 ; i < books.size() ; ++i)
                arr[i] = books.get(i).getTitle();
            
            boxBook.setModel(new DefaultComboBoxModel<String>(arr));
            
        } 
        catch (SQLException ex) 
        {
            System.err.println("CONNECTION FAIL ! \n" + ex.getMessage());
        }
    }
    
     
     
     
     
     
     
    public static void showPublisherBox(Connection connection , Statement statement , JComboBox<String> boxName)
    {
         ArrayList<Publishers> pub;
            
        try 
        {
            
            pub = Utility.getPublishers(connection , statement);
            String[] arr = new String[pub.size() ];
            
            for (int i = 0 ; i < pub.size() ; ++i)
                arr[i] = pub.get(i).getName();
            
            boxName.setModel(new DefaultComboBoxModel<String>(arr));
        } 
        catch (SQLException ex) 
        {
            System.err.println("CONNECTION FAIL ! \n" + ex.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void showAuthorBox(Connection connection , Statement statement , JComboBox<String> boxName)
    {
         ArrayList<Authors> author;
            
        try 
        {
            
            author = Utility.getAuthors(connection , statement);
            String[] arr = new String[author.size() ];
            
            for (int i = 0 ; i < author.size() ; ++i)
                arr[i] = author.get(i).getName();
            
            boxName.setModel(new DefaultComboBoxModel<String>(arr));
        } 
        catch (SQLException ex) 
        {
            System.err.println("ERROR");
        }
    }

    public static void showYearBox(Connection connection , Statement statement , JComboBox<String> boxName)
    {
        String[] arr = new String[80];
            
         int j = 0;
         for (int i = 1960 ; i < 2040 ; ++i )
            arr[j++] = Integer.toString(i);
        boxName.setModel(new DefaultComboBoxModel<String>(arr));
       
    }
    
    
    
    
    
    
    
    
    
    
    
    public static void showPeopleBox(Connection connection , Statement statement , JComboBox<String> boxName)
    {
         ArrayList<People> people;
            
        try 
        {
            
            people = Utility.getPeople(connection , statement);
            String[] arr = new String[people.size() ];
            
            for (int i = 0 ; i < people.size() ; ++i)
                arr[i] = people.get(i).getName();
            
            boxName.setModel(new DefaultComboBoxModel<String>(arr));
        } 
        catch (SQLException ex) {
            System.err.println("ERROR");
        }
    }

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
