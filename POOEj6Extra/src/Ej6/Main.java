/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej6;

/**
 *
 * @author Pablo
 */
import java.util.*;
public class Main {
public static void main(String[] args) {
    
  Empleado emp1 = new Empleado("Juan", 31, 50000);
        Empleado emp2 = new Empleado("Pedro", 29, 50000);

        emp1.calcularAumento();
        emp2.calcularAumento();

        System.out.println("El nuevo sueldo de " + emp1.getNombre() + " es de : $ " + emp1.getSalario());
        System.out.println("El nuevo sueldo de " + emp2.getNombre() + " es de : $ " + emp2.getSalario());

}

}
