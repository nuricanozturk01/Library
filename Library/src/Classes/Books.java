package Classes;

public class Books 
{
    public int bookID;
    public String ISBN;
    public String title;
    public String category;
    public int page;

    public Books(int bookID, String ISBN, String title, String category, int page) 
    {
        this.bookID = bookID;
        this.ISBN = ISBN;
        this.title = title;
        this.category = category;
        this.page = page;
    }
    public Books(String ISBN, String title, String category, int page) 
    {
      
        this.ISBN = ISBN;
        this.title = title;
        this.category = category;
        this.page = page;
    }
    public Books( String title) 
    {
        
        this.title = title;
        
    }
    public int getBookID() 
    {
        return bookID;
    }

    public String getISBN() 
    {
        return ISBN;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getCategory() 
    {
        return category;
    }

    public int getPage() 
    {
        return page;
    }
    
    public String toString()
    {
        return getBookID() + " : " + getISBN() + " " + getTitle() + "  " + getCategory() + "  " + getPage()+ "\n";
    }
    
}
