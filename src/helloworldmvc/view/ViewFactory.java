/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.view;

import java.util.ResourceBundle;

/**
 * This class constructs the diferent implementations of the View
 * @author Alex Hurtado
 */
public class ViewFactory {
    private final String PROPERTIES = "helloworldmvc.start";
    private final String TXT_VIEW = "TXT";
    private final String SWING_VIEW = "SWING";
    private final String JAVAFX_VIEW = "JAVAFX";
    private final String VIEW = ResourceBundle.getBundle(PROPERTIES).getString("VIEW_TYPE");
    /**
     * This method returns a View corresponding to the value of the VIEW_TYPE constant
     * @return View
     */
    public View getView(){
        View view = null;
        if(VIEW.equalsIgnoreCase(TXT_VIEW)){
            view = new ViewImpTXT();
        }
        if(VIEW.equalsIgnoreCase(SWING_VIEW)){
            view = new ViewImpSwing();
        }
        if(VIEW.equalsIgnoreCase(JAVAFX_VIEW)){
            view = new ViewImpFX();
        }
        return view;
    }    
}
