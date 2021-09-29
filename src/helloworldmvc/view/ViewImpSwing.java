/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex Hurtado
 */
public class ViewImpSwing implements View{

    @Override
    public void showGreeting(String greeting) {
        JOptionPane.showMessageDialog(null, greeting);
    }
    
}
