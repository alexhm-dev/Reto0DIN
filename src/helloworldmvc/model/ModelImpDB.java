/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex Hurtado
 */
public class ModelImpDB implements Model {
    private final String PROPERTIES = "helloworldmvc.start";
    //private final String DB_DRIVER = ResourceBundle.getBundle(PROPERTIES).getString("DRIVER");
    private final String DB_URL = ResourceBundle.getBundle(PROPERTIES).getString("URL");
    private final String USER = ResourceBundle.getBundle(PROPERTIES).getString("DBUSER");
    private final String PASS = ResourceBundle.getBundle(PROPERTIES).getString("DBPASS");
    private final String QUERY = "SELECT greeting FROM greetings WHERE type = 1";

    @Override
    public String getGreeting() {
        String greeting = "";
        try
        {
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
            while(rs.next()){
               greeting=rs.getString(1);
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(ModelImpDB.class.getName()).log(Level.SEVERE, null, ex);

        }
        return greeting;
    }

}
