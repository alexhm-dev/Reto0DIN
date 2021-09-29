/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import java.util.ResourceBundle;

/**
 *
 * @author Alex Hurtado
 */
public class ModelFactory {
    private final String PROPERTIES = "helloworldmvc.start";
    private final String TXT_MODEL = "FILE";
    private final String DB_MODEL = "DB";
    private final String modelType = ResourceBundle.getBundle(PROPERTIES).getString("MODEL_TYPE");
    
    public Model getModel(){
        Model model = null;
        if(modelType.equalsIgnoreCase(TXT_MODEL)){
            model = new ModelImpFile();
        }
        if(modelType.equalsIgnoreCase(DB_MODEL)){
            model = new ModelImpDB();
        }
       
        return model;
    }
}
