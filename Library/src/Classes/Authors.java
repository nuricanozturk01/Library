package Classes;


public class Authors 
{
    private int authorID;
    private String name;
    private String surname;
    private char gender;
    private String country;
    private String birthdate;

    public Authors(int authorID, String name, String surname, char gender, String country, String birthdate) 
    {
        this.authorID = authorID;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.country = country;
        this.birthdate = birthdate;
    }
    public Authors(int authorID, String name, String surname,  String country, String birthdate) 
    {
        this.authorID = authorID;
        this.name = name;
        this.surname = surname;
       
        this.country = country;
        this.birthdate = birthdate;
    }
    public Authors (String name , String surname)
    {
         this.name = name;
        this.surname = surname;
        this.country = country;
    }
    public Authors (String name , String surname , String country)
    {
         this.name = name;
        this.surname = surname;
    }
    public int getAuthorID() {
        return authorID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public char getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public String getBirthdate() {
        return birthdate;
    }
    
    
    
}
