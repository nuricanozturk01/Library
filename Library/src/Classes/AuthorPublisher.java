package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author msi
 */
public class AuthorPublisher 
{
     private int authotID;
    private int publisherID;

    public AuthorPublisher(int authotID, int publisherID) {
        this.authotID = authotID;
        this.publisherID = publisherID;
    }

    public int getAuthotID() {
        return authotID;
    }

    public void setAuthotID(int authotID) {
        this.authotID = authotID;
    }

    public int getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(int publisherID) {
        this.publisherID = publisherID;
    }
    
}
