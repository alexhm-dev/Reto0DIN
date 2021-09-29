/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.view;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 *
 * @author Alex Hurtado
 */
public class ViewImpFX extends Application implements View{
    private String[] args;
    @Override
    public void showGreeting(String greeting) {
        args = new String[1];
        args[0] = greeting;
        launch(args);
    }

    @Override
    public void start(Stage s) throws Exception {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initStyle(StageStyle.UTILITY);
        alert.setTitle("Greeting");
        alert.setHeaderText(null);
        alert.setContentText(getParameters().getRaw().get(0));
        alert.showAndWait();
    }
}
