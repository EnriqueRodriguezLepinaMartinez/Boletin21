/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import javax.swing.JOptionPane;

/**
 *
 * @author ricky_000
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String texto;

        leer dat = new leer();

        for (int i = 0; i < 99; i++) {
            texto = JOptionPane.showInputDialog("Introduce palabra o exit para salir");
            if (texto.equals("exit")) {
                break;
            }
            dat.añadirPalabra(texto);
        }
        dat.escribirFichero("fichero.txt");

    }

    
}
