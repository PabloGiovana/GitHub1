package Servicios;

import Entidades.Cafetera;
import java.util.*;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
 public Cafetera crearCafetera(){
     Cafetera cafetera1 = new Cafetera(100, 0);
        System.out.println(cafetera1.getCapacidadMáxima());
        System.out.println(cafetera1.getCantidadActual());
     return cafetera1;

 }

    public int llenarCafetera(Cafetera cafetera1) {
        cafetera1.setCantidadActual(cafetera1.getCapacidadMáxima());
        System.out.println(cafetera1.getCapacidadMáxima());
        System.out.println(cafetera1.getCantidadActual());
        return cafetera1.getCantidadActual();
    }
//Método para servir taza

    public int servirTaza(Cafetera cafetera1) {
        System.out.println("Ingrese el tamaño de la taza a llenar");
        int tamTaza = leer.nextInt();
        //Servir taza

        if (tamTaza < cafetera1.getCantidadActual()) {
            int restoCafetera = cafetera1.getCantidadActual() - tamTaza;
            cafetera1.setCantidadActual(restoCafetera);
            System.out.println("Se llenó la taza, en la cafetera queda" + restoCafetera);
        }
        //Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
        //El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
        if (tamTaza > cafetera1.getCantidadActual()) {
            int tazaLlena = cafetera1.getCantidadActual();
            cafetera1.setCantidadActual(0);
            System.out.println("No se llenó la taza \n y quedó en ml " + tazaLlena);
        }
        return cafetera1.getCantidadActual();
    }
    //Método vaciarCafetera(): pone la cantidad de café actual en cero. 

    public void vaciarCafetera(Cafetera cafetera1) {
        cafetera1.setCantidadActual(0);
        System.out.println("Se vacío la cafetera");
    }

//Método agregarCafe(int): se le pide al usuario una cantidad de café
//el método lo recibe y se añade a la cafetera la cantidad de café indicada.
    public int agregarCafe(Cafetera cafetera1) {
        System.out.println("¿Cuánto café desea ingresar?");
        int cantCafe = leer.nextInt();

        int capMax = cafetera1.getCapacidadMáxima();
        int capAct = cafetera1.getCantidadActual();
        int resta = capMax - capAct;

        while (cafetera1.getCapacidadMáxima() < cantCafe) {
            System.out.println("Lo que esta ingresando supera la capacidad máxima de la cafetera");
            System.out.println("Usted puede ingresar " + resta);
            cantCafe = leer.nextInt();
        }
        cafetera1.setCantidadActual(cafetera1.getCantidadActual() + cantCafe);
        System.out.println(+cafetera1.getCantidadActual());
        return cafetera1.getCantidadActual();
    }

}
