package testunitarim5;

import java.util.LinkedList;

public class Exemple {

    public LinkedList metodeFerran(String prova) {

        LinkedList<String> llista = new LinkedList<String>();

        if (prova.equals("Llista completa")) {
            for (int i = 0; i < 10; i++) {
                llista.add("Numero" + i);
            }
        } else if (prova.equals("Llista meitat")) {
            for (int i = 0; i < 5; i++) {
                llista.add("Numero" + i);
            }
        }
            return llista;
        }

    }
