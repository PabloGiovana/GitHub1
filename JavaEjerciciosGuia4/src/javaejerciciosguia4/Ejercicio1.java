/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerciciosguia4;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1, num2, opt;
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("Elija cual operación desea realizar");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multi");
        System.out.println("4: Division");
        opt = leer.nextInt();
        switch (opt) {
            case 1:
                int retorno = suma(num1, num2);
                System.out.println("La suma es "+retorno);
                break;
            case 2:
                retorno = resta(num1, num2);
                System.out.println("La resta es "+retorno);
                break;
            case 3:
                retorno = multi(num1, num2);
                System.out.println("La multiplicacion es "+retorno);
                break;
            case 4:
                retorno = div(num1, num2);
                System.out.println("La division es "+retorno);
                break;

        }

    }

    public static int suma(int num1, int num2) {
        int suma = num1 + num2;
        return suma;

    }

    public static int resta(int num1, int num2) {
        int resta = num1 - num2;
        return resta;

    }

    public static int multi(int num1, int num2) {
        int multi = num1 * num2;
        return multi;

    }

    public static int div(int num1, int num2) {
        int div = num1 / num2;
        return div;

    }

}
