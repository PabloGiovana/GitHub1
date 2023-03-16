/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaencuentro9.pkg11;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class JavaEncuentro911Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] equipo = new String[10];
       Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre de los compañeros");
            equipo[i] = leer.nextLine();
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("[" + equipo[i] + "]");
        }
        System.out.println("");
    }
    
}
