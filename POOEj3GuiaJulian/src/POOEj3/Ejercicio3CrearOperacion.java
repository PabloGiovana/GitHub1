package POOEj3;

//Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
//A) Método constructor con todos los atributos pasados por parámetro.
//B) Método constructor sin los atributos pasados por parámetro.
//C) Métodos get y set.
//D) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
//E) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//F) Método restar(): calcular la resta de los números y devolver el resultado al main
//G) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, 
//el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
//H) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0
//y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

import POOEj3.Ejercicio3Operacion;
import java.util.Scanner;

public class Ejercicio3CrearOperacion {

    public static void main(String[] args) {
        Ejercicio3Operacion o1 = new Ejercicio3Operacion();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        o1.setNum1(leer.nextInt());
        o1.setNum2(leer.nextInt());
        System.out.println(o1);
    }

}
