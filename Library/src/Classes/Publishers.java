package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author msi
 */
public class Publishers 
{
     private int publisherID;
    private String name;
    private String address;

    public Publishers(int publisherID, String name, String address) {
        this.publisherID = publisherID;
        this.name = name;
        this.address = address;
    }
    
       public Publishers(String name, String address) {
     
        this.name = name;
        this.address = address;
    }


    public int getPublisherID() {
        return publisherID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    
    
    
}
