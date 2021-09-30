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
public class ModelImpDBTest {
    final String GREETING = "Hello World from DB!";
    ModelImpDB mid = new ModelImpDB();

    @Test
    public void testGetGreeting() {
        assertEquals(GREETING, mid.getGreeting());
    }
    
}
