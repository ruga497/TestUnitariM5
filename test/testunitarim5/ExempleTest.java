package testunitarim5;

import java.util.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExempleTest {

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

 

}
