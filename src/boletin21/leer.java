/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author ricky_000
 */
public class leer {
    
    ArrayList<String> palabras = new ArrayList<>();

    PrintWriter ficher;
    FileWriter fich;

    public void escribirFichero(String nomFich) {
        int cont = 0;
        try {
            for (int i = 0; i < palabras.size(); i++) {
                cont += 1;
                ficher = new PrintWriter(new FileWriter(nomFich, true));
                ficher.println(cont + ": " + palabras.get(i));
            }
        } catch (IOException ex) {
            System.out.println("erro1" + ex.getMessage());
        } finally {
            ficher.close();
        }

    }

    public ArrayList añadirPalabra(String palabr) {
        palabras.add(palabr);
        return palabras;
    }
}
