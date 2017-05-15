/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BasisData;
import java.sql.*;
/**
 *
 * @author Ferdy
 */
public class basisData {
    public Connection database () throws SQLException
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/esagama","root","");
            return con;
        }
        catch(SQLException se)
        {
            System.out.println("No Connection");
            return null;
        }
        catch (Exception ex)
         {
             System.out.println("Couldn't open database");
            return null;
        }
    }
}
