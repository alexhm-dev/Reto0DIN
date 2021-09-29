/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.view;

import java.util.ResourceBundle;

/**
 *
 * @author Alex Hurtado
 */
public class ViewFactory {
    private final String PROPERTIES = "helloworldmvc.start";
    private final String TXT_VIEW = "TXT";
    private final String SWING_VIEW = "SWING";
    private final String JAVAFX_VIEW = "JAVAFX";
    private final String viewType = ResourceBundle.getBundle(PROPERTIES).getString("VIEW_TYPE");
    
    public View getView(){
        View view = null;
        if(viewType.equalsIgnoreCase(TXT_VIEW)){
            view = new ViewImpTXT();
        }
        if(viewType.equalsIgnoreCase(SWING_VIEW)){
            view = new ViewImpSwing();
        }
        if(viewType.equalsIgnoreCase(JAVAFX_VIEW)){
            view = new ViewImpFX();
        }
        return view;
    }    
}
