package Ej4;
//*Crea una clase "Cocina" que tenga una lista de objetos "Receta". 
//Luego, crea métodos para agregar nuevas recetas a la lista, 
//para buscar una receta por nombre y para obtener la lista de recetas 
//que se pueden preparar con los ingredientes disponibles en la cocina.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cocina {
    public Cocina() {

    }
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int num;
    String nombreReceta;
    private List<String> receta = new ArrayList<String>();

    public void cargarReceta() {
        System.out.println("Ingrese nombre de la receta");
        receta.add(leer.nextLine());
        System.out.println("Ingrese la cantidad de ingredientes");
        num = leer.nextInt();
        leer.nextLine(); // Consumir salto de línea
        System.out.println("Ingrese los ingredientes");
        for (int i = 0; i < num ; i++) {
            receta.add(leer.nextLine());
        }
        System.out.println(receta);

    }

    public void buscarRecetaNombre() {
        System.out.println("Ingrese el nombre de la receta a buscar");
        nombreReceta = leer.nextLine();
        for (int i = 0; i < receta.size(); i++) {
 if (receta.get(i).equals(nombreReceta)) {
     System.out.println(receta.get(i));
}
System.out.println("No se encontró la receta");

        }
}
    
   public List<String> buscarRecetasPorIngredientes(List<String> ingredientes) {
    List<String> recetasDisponibles = new ArrayList<String>();
    for (String receta : receta) {
        boolean disponible = true;
        for (String ingrediente : ingredientes) {
            if (!receta.contains(ingrediente)) {
                disponible = false;
                break;
            }
        }
        if (disponible) {
            recetasDisponibles.add(receta);
        }
    }
    return recetasDisponibles;
}

}


