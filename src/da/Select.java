
package da;
import Backend.ConnectSQL;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Rianne
 */
public class Select {
      public static  ResultSet getData(String query){
        try
        {
           Connection  con=ConnectSQL.createC();
          Statement  st=con.createStatement();
          ResultSet rs=st.executeQuery(query);
          return rs;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e,"Message",JOptionPane.ERROR_MESSAGE);
          
        
        return null;
    }
}
}
    