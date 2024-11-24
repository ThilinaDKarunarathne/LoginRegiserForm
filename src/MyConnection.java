/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TOSHIBA
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    
     public static Connection getConnection(){
         
         Connection con = null;
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost/java_login_register", "root", "");
        } catch (Exception ex) {
            System.out.println (ex.getMessage());
        }
         return con;
     
     }
     
    
}
