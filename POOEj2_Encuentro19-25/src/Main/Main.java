package Main;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        CafeteraServicio cafServ = new CafeteraServicio();
        Cafetera cafetera1 = cafServ.crearCafetera();
        int opcion = 0;
        while (opcion != 5) {

            System.out.println("-----MENU-----");
            System.out.println("1 Llenar cafetera");
            System.out.println("2 Servir taza");
            System.out.println("3 Agregar café");
            System.out.println("4 Vaciar cafetera");
            System.out.println("5 Salir");
            System.out.println("----------------");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Llenando cafetera");
                    cafServ.llenarCafetera(cafetera1);
                    break;
                case 2:
                    System.out.println("Sirviendo taza");
                    cafServ.servirTaza(cafetera1);
                    break;
                case 3:
                    System.out.println("Agregando café");
                    cafServ.agregarCafe(cafetera1);
                    break;
                case 4:
                    System.out.println("Vaciando cafetera");
                    cafServ.vaciarCafetera(cafetera1);
                    break;
                case 5:
                    System.out.println("Saliendo del programa");

            }

        }

    }
}
