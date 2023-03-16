/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_.ejercicios_java_intro.p3_.subprogramas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicios_Java_IntroP3_Subprogramas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner(System.in);
        String frase;
        System.out.println("ingresar frase:");
        frase = ingresar.next();
        System.out.println(vocalesRemplazadas( frase)); 
        ingresar.close();
    }
    public static String vocalesRemplazadas(String frase) {
        String fraseRemplazada = "";
        String arroba = "@";
        String numeral= "#";
        String peso = "$";
        String porcentaje = "%";
        String asterisco = "*";
        
        
        for (int i = 0; i < frase.length(); i++)
        {
            System.out.println(frase.substring(i, i+1));
            String letra = frase.substring(i, i+1);
            switch (frase.substring(i, i+1))
            {
                /**/
                case "a":
                    System.out.println("entro en la a");
                    fraseRemplazada = fraseRemplazada.concat(arroba) ;
                    break;
                    
                case "e":
                    System.out.println("entro en la e");
                    fraseRemplazada = fraseRemplazada.concat(numeral); 
                    break;
                case "i":
                    System.out.println("entro en la i");
                    fraseRemplazada = fraseRemplazada.concat(peso) ; 
                    break;
                case "o":
                    System.out.println("entro en la o");
                    fraseRemplazada = fraseRemplazada.concat(porcentaje); 
                    break;
                case "u":
                    System.out.println("entro en la u");
                    fraseRemplazada = fraseRemplazada.concat(asterisco); 
                    break;
                default:
                    System.out.println("ingreso a defaulta");
                    fraseRemplazada = fraseRemplazada.concat(letra);  
                    break;
            } 
        }
        return fraseRemplazada;
    }
}
