/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej1;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Cancion nuevaCancion = new Cancion();

    System.out.print("Ingrese el título de la canción: ");
    String titulo = scanner.nextLine();
    nuevaCancion.setTitulo(titulo);

    System.out.print("Ingrese el autor de la canción: ");
    String autor = scanner.nextLine();
    nuevaCancion.setAutor(autor);

    System.out.println("La canción " + nuevaCancion.getTitulo() + " del artista " + nuevaCancion.getAutor() + " esta cargada");
}

}
