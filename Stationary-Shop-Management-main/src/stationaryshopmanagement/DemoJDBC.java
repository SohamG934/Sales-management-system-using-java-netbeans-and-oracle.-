/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stationaryshopmanagement;
import java.sql.*;

/**
 *
 * @author HP
 */
public class DemoJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws SQLException {
        // TODO code application logic here
        Connection conn;
        Statement stmt;
        ResultSet rs;
        //load the driver
        System.out.println(" Registering Driver........");
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        System.out.println(" Driver registered");
        
        
        //connect to database
        System.out.println(" Connecting Database ");
        conn=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-CR6FLS09:1521:orcl", "scott", "admin");
        System.out.println(" Database connected");
        stmt=conn.createStatement();
        //create table customer
       // System.out.println(" creating table Products........");
       // stmt.executeUpdate("create table Products"+ "(P_name varchar(20), P_id number(4) constraint p_id_pk primary key , Rate number(6,2), Qty number(3), Tax number(4,2), Total number(7,2))");
       // System.out.println(" Table Products created");
        /*System.out.println(" creating table Customers........");
       stmt.executeUpdate("create table Customers"+ "(C_name varchar(20), C_id number(4) constraint c_id_pk primary key , Address varchar(50), M_no number(10))");
       System.out.println(" Table customers created"); */
       /* System.out.println(" creating table Orders........");
       stmt.executeUpdate("create table Orders"+ "(O_id number(4) constraint o_id_pk primary key, C_id number(4) constraint c_id_fk references Customers(C_id),O_Date date)");
       System.out.println(" Table Orders created"); */
      /* System.out.println(" creating table OrderDetails........");
       stmt.executeUpdate("create table OrderDetails"+ "(O_id number(4) constraint o_id_fk references Orders(O_id), P_id number(4) constraint p_id_fk references Products(P_id),P_name varchar(20),Rate number(6,2), Qty number(3), Tax number(4,2), Total number(7,2))");
       System.out.println(" Table OrderDetails created"); */
        stmt.close();
        conn.close();
        
        
    }
    
}
