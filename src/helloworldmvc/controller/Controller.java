/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.controller;

import helloworldmvc.model.Model;
import helloworldmvc.view.View;

/**
 *
 * @author Alex Hurtado
 */
public class Controller {
    public void run(Model model, View view){
       view.showGreeting(model.getGreeting());
    }
}
