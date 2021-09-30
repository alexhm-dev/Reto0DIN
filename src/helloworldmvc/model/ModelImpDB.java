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
 * This class is the implementation of the Model that retrieves the greeting from a data base.
 * @author Alex Hurtado
 */
public class ModelImpDB implements Model {
    private final String PROPERTIES = "helloworldmvc.start";
    private final String DB_URL = ResourceBundle.getBundle(PROPERTIES).getString("URL");
    private final String USER = ResourceBundle.getBundle(PROPERTIES).getString("DBUSER");
    private final String PASS = ResourceBundle.getBundle(PROPERTIES).getString("DBPASS");
    private final String QUERY = "SELECT greeting FROM greetings WHERE type = 1";

    /**
     * This method returns a string that contains the greeting retrieved from a data base.
     * @return string String with the greeting read from the db.
     */
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
