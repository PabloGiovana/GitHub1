
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class java2 {

    /**
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String nombre;
    System.out.println("Ingrese su nombre");
    nombre = leer.nextLine();
    System.out.println("Su nombre es " +nombre);      
    }   
}
