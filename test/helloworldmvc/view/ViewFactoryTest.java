/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex Hurtado
 */
public class ViewFactoryTest {
    ViewFactory vf = new ViewFactory();
    View v = vf.getView();
    
    @Test
    public void testGetView() {
        assertNotNull(v);
    }
    
}
