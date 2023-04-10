
package Main;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicios;


public class Main {
public static void main(String[] args) {
 
    CuentaBancariaServicios cuentaX = new CuentaBancariaServicios();
    CuentaBancaria primerCuenta = cuentaX.crearCuenta();
    cuentaX.ingresar(primerCuenta);
    cuentaX.retirar(primerCuenta);
    cuentaX.extraccionRapida(primerCuenta);
    cuentaX.consultarDatos(primerCuenta);
    cuentaX.consultarSaldo(primerCuenta);

   
 
    
}

}
