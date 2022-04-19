/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author GaMerJ16
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
    double C1, C2, C3, Union, Meses = 0;

    //Input
    C1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del capital de Pedro: "));
    C2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del capital Juan: "));
    C3 = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del capital para iniciar el negocio: "));

    //Processing
    Union = C1 + C2;

    while (Union < C3) {
      Meses = Meses +1 ;
      C1 = (double) (C1 + (C1 * 0.03));
      C2 = (double) (C2 + (C2 * 0.04));
      Union = C1 + C2;

    }

    //Output
    JOptionPane.showMessageDialog(null, "En " + Meses + " meses, uniendo los 2 capitales de Pedro y Juan, se puede hacer el negocio que desean.");

    //End
    System.exit(0);
    }
    
}
