/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campusportal;
import java.sql.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mithunlal
 */
public class Connectivity {
    Connection con;
    Statement st;
    ResultSet rs;
    public void connect()
{
    try{
            Class.forName("oracle.jdbc.OracleDriver");
            String servername="localhost";
            String port="1521";
            String sid="orcl";
            String username="system";
            String pass="mithun";
            String url="jdbc:oracle:thin:@"+servername+":"+port+":"+sid;
            con=DriverManager.getConnection(url,username,pass);
            System.out.println("ok");
            st=con.createStatement();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Caught"+e.getMessage());
        }
        catch(SQLException e)
        {
            System.out.println("Caught"+e.getMessage());
        } 




}
}
class Main
{
public static void main(String[] args){
    
    
}

}