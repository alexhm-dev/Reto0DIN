/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import java.util.ResourceBundle;

/**
 * This class constructs the diferent implementations of the Model
 * @author Alex Hurtado
 */
public class ModelFactory {
    private final String PROPERTIES = "helloworldmvc.start";
    private final String TXT_MODEL = "FILE";
    private final String DB_MODEL = "DB";
    private final String MODEL = ResourceBundle.getBundle(PROPERTIES).getString("MODEL_TYPE");
    
    /**
     * This method returns a Model corresponding to the value of the MODEL_TYPE constant
     * @return Model
     */
    public Model getModel(){
        Model model = null;
        if(MODEL.equalsIgnoreCase(TXT_MODEL)){
            model = new ModelImpFile();
        }
        if(MODEL.equalsIgnoreCase(DB_MODEL)){
            model = new ModelImpDB();
        }
       
        return model;
    }
}
