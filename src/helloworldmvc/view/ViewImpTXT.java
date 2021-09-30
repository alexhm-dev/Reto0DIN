/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.view;

/**
 * This class is the implementation of the View that shows a greeting in the terminal.
 * @author Alex Hurtado
 */
public class ViewImpTXT implements View{
    
    /**
     * This method shows the greeting passed as argument in the console.
     * @param greeting 
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
    
}
