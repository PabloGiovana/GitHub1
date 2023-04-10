

package Ej5;


import java.util.*;
public class Cuenta {
    Scanner scanner = new Scanner(System.in);

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
   private  double saldo;
   private  String titular;
    public void retirar_dinero(){
        
        System.out.println("Ingrese la cantidad de dinero a retirar");
        double cantDinero = scanner.nextDouble();
        double saldoTotal = saldo-cantDinero;
                if ((saldo-cantDinero) < 0) {
            System.out.println("Su saldo es insuficiente");
        }else{
                    System.out.println("Su saldo restante es "+saldoTotal);
                }
        setSaldo(saldoTotal);


        
    }
    

}
