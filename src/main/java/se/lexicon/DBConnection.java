package se.lexicon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

     // todo: define db connection
    private static  final String User ="root";
    private static final String pass = "1234";
    private static final String URL = "jdbc:mysql://localhost:3306/world";
    public static Connection getConnection()throws DBConnectionException{
        try {
            return DriverManager.getConnection(URL, User, pass);
        } catch (SQLException e) {
            throw new DBConnectionException("Connecton faild");
        }


    }

}
