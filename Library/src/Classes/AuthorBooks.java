package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author msi
 */
public class AuthorBooks 
{
    private int authotID;
    private int bookID;

    public AuthorBooks(int authotID, int bookID) {
        this.authotID = authotID;
        this.bookID = bookID;
    }

    public int getAuthotID() {
        return authotID;
    }

    public void setAuthotID(int authotID) {
        this.authotID = authotID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
    
    
}
