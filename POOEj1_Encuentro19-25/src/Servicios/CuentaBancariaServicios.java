

package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;



public class CuentaBancariaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//Método para crear cuenta pidiéndole los datos al usuario.

 public CuentaBancaria crearCuenta(){
     CuentaBancaria c1 = new CuentaBancaria();
     
     System.out.print("Ingrese su número de cuenta: ");
      c1.setNumeroCuenta(leer.nextInt());
      System.out.print("Ingrese su DNI: ");
      c1.setDniCliente(leer.nextLong());
     c1.setSaldoActual(100000);
      return c1;
 }
    //Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual
public double ingresar(CuentaBancaria c1){
    System.out.println("¿Cuánto dinero desea ingresar?");
    double dineroIngreso = leer.nextDouble();
    c1.setSaldoActual(c1.getSaldoActual() + dineroIngreso);
    return c1.getSaldoActual();
}
     
 //Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
 //Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
 
public double retirar(CuentaBancaria c1){
System.out.println("¿Cuánto dinero desea retirar?");
double dineroRetiro = leer.nextDouble();
if (dineroRetiro > c1.getSaldoActual()) {
c1.setSaldoActual(0.0); // establecer saldo en cero si el dinero a retirar es mayor que el saldo actual
} else {
c1.setSaldoActual(c1.getSaldoActual() - dineroRetiro);
}
return c1.getSaldoActual();
}
 
//Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
public double extraccionRapida(CuentaBancaria c1) {
    double limiteExtraccion = c1.getSaldoActual() * 0.2;
    System.out.println("Ingrese la cantidad a retirar (máximo " + limiteExtraccion + "):");
    double cantidadARetirar = leer.nextDouble();
    if (cantidadARetirar <= limiteExtraccion) {
       c1.setSaldoActual(c1.getSaldoActual() - cantidadARetirar);;
        System.out.println("Retiro exitoso. Saldo actual: " + c1.getSaldoActual());
    } else {
        System.out.println("La cantidad a retirar excede el límite permitido.");
    }
    return c1.getSaldoActual();
}

//Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
public double consultarSaldo(CuentaBancaria c1) {
    System.out.println("Saldo disponible: " + c1.getSaldoActual());
    return c1.getSaldoActual();
}

//Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
public void consultarDatos(CuentaBancaria c1) {
    System.out.println("Número de cuenta: " + c1.getNumeroCuenta());
    System.out.println("DNI del cliente: " + c1.getDniCliente());
    System.out.println("Saldo actual: " + c1.getSaldoActual());
}
    
    
    
    
    
}
     
     

 
 


