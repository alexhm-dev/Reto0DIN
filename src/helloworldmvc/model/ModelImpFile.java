/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import java.util.ResourceBundle;

/**
 * This class is the implementation of Model that reads the greeting from a file.
 * @author Alex Hurtado
 */
public class ModelImpFile implements Model{
    private final String PROPERTIES = "helloworldmvc.start";
    private final String GREETING = "GREETING";
    /**
     * 
     * @return string Sring with the greeting read from a file.
     */
    @Override
    public String getGreeting() {
       return ResourceBundle.getBundle(PROPERTIES).getString(GREETING);
    }
}
