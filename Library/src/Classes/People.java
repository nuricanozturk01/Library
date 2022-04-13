/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author msi
 */
public class People 
{
        private int peopleID;
        private String name;
        private String surname;
        private String birthdate;

    public People(int peopleID, String name, String surname, String birthdate)
    {
        this.peopleID = peopleID;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public int getPeopleID() {
        return peopleID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthdate() {
        return birthdate;
    }
    
        
        
}
