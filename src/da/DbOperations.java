/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da;
import java.sql.*;
import Backend.ConnectSQL;
import javax.swing.JOptionPane;

/**
 *
 * @author Rianne
 */
public class DbOperations {
  public static void setDataOrDelete(String Query,String msg)
  {
      try
      {
          Connection con=ConnectSQL.createC();
           Statement st=con.createStatement();
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
