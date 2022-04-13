package Classes;

import java.sql.*;
public class DBConnector 
{
    private final String userName;
    private final String password;
    private final String host;

    public DBConnector(String userName, String password, String host) 
    {
        this.userName = userName;
        this.password = password;
        this.host = host;
    }
    
    public Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(host , userName , password);
    }
    
}
