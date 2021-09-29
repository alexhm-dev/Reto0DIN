/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc;

import helloworldmvc.controller.Controller;
import helloworldmvc.model.ModelFactory;
import helloworldmvc.view.ViewFactory;

/**
 *
 * @author Alex Hurtado
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controller controller = new Controller();
        ModelFactory model = new ModelFactory();
        ViewFactory view = new ViewFactory();
        controller.run(model.getModel(), view.getView());
    }
    
}
