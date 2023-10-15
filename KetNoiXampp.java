/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AUGUST
 */
public class KetNoiXampp {
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://locolhost:3306/mydatabase";
        var user ="root";
        var password = " ";
        try( Connection conn = DiverManager.getConnection(url, user , password))
        {
            System.out.println("ket noi MySQL thanh cong !");
            System.out.println(conn.getCatalog());
        }
        catch(SQLException ex)
        {
            Logger.getLogger(KetNoiXampp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
