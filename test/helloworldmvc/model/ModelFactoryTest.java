/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex Hurtado
 */
public class ModelFactoryTest {
    
   ModelFactory mf = new ModelFactory();
   Model m = mf.getModel();

    @Test
    public void testGetModel() {
        assertNotNull(m);
    }
    
}
