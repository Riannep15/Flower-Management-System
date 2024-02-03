package da;

import java.sql.*;
import javax.swing.JOptionPane;
import Backend.ConnectSQL;
/**
 *
 * @author Rianne
 */
public class tables {
    public static void main(String[]args)
    {
        Connection con=null;
        Statement st=null;
        try{
            con=ConnectSQL.createC();
            st=con.createStatement();
            st.executeUpdate("create Table users(name varchar(200),email varchar(200),password varchar(50),securityQuestion varchar(100),answer varchar(200),status varchar(200)");
            JOptionPane.showMessageDialog(null,"Table created successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            
            
        }
        finally
        {
            try
            {
            con.close();
            st.close();
            }
            catch(Exception e)
            {}
    }
}
}