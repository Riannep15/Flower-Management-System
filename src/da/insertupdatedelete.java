package da;
import java.sql.*;
import javax.swing.JOptionPane;
import Backend.ConnectSQL;
/**
 *
 * @author Rianne
 */
public class insertupdatedelete {
    Connection con;

    public static void setData(String Query,String msg)
    {
        
        Connection con=null;
        Statement st=null;
        try
        {
            con=ConnectSQL.createC();
            st=con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null,msg);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e,"Message",JOptionPane.ERROR_MESSAGE);
        }
      
}
}  
    