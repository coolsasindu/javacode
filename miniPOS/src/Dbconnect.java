
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wow
 */
public class Dbconnect {
    
    public static Connection connection(){
    
    
    Connection cn =null ;
    
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
          //  cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tbinfo","root","");
            
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/posmini","root","");
            
            
            
        } catch (ClassNotFoundException | SQLException e) {
            
            
        }
    
    

         return cn;
        
   
    
    }    
        
        
        
        
        
        
        
        
        
}
