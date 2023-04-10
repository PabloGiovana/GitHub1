

package Ej4;

import java.util.*;
public class Main {
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    Cocina miCocina = new Cocina();
    // Cargar recetas
    miCocina.cargarReceta();
    // Buscar receta por nombre
 System.out.println("Ingrese los ingredientes separados por comas: ");
String[] ingredientesArray = leer.nextLine().split(",");
List<String> ingredientes = Arrays.asList(ingredientesArray);
List<String> recetasDisponibles = miCocina.buscarRecetasPorIngredientes(ingredientes);
System.out.println("Recetas disponibles: " + recetasDisponibles);
}
}

