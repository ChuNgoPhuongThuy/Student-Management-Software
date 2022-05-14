/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author lan
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQL  {
    public static Connection getConnection(){
        final String URL = "jdbc:mysql://localhost:3306/quanlyhocsinh";
        final String USER = "root";
        final String PASSWORD = "";
        try{
//            Class.forName("com.mysql.jdbc.Driver");
        	System.out.println("connect successfully!");
            return DriverManager.getConnection(URL,USER,PASSWORD);
//        }catch(ClassNotFoundException e){
//            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    } 
}
