
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author danie
 */
public class conexion {
    
    Connection con ;
    
    public conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practica2bdd", "root", "root");
            
        }catch(Exception e){
            System.err.println("No jala" + e);
        }
    }
    
    public Connection getConnection(){
        
        return con;
    }
}
