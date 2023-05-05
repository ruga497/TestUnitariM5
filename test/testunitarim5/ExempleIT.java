/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testunitarim5;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ruben
 */
public class ExempleIT {
    
    public ExempleIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    Exemple exemple = new Exemple();
   
    @Test
    public void testMetodeFerran() {
        String prova1 = "Llista completa";
        LinkedList<String> result1 = exemple.metodeFerran(prova1);
        assertEquals(10, result1.size());

        String prova2 = "Llista meitat";
        LinkedList<String> result2 = exemple.metodeFerran(prova2);
        assertEquals(5, result2.size());
    }
    
    @Test
    public void testmetodeRuben() {
        int[] numeros = {1, 2, 3, 4, 5};
        int resultadoEsperado = 15;
        int resultadoObtenido = Exemple.metodeRuben(numeros);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
}
