package staff_service_main;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author asusgeforce
 */
public class StaffConnection {
    public static Connection connect(){
        
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/staff_service_db?useSSL=false","root","");
            
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
}
