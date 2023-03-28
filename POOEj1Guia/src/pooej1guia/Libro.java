/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1guia;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Libro {

    Scanner scanner = new Scanner(System.in);


      public Libro(int isbn, String titulo, String autor, int numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;

    }

    public Libro() {

    }

    int isbn;
    String titulo;
    String autor;
    int numPag;

   public void cargarLibro() {
        System.out.println("Ingrese ISBN");
        setIsbn(scanner.nextInt());
        System.out.println("Ingrese título del libro");
        setTitulo(scanner.next());
        System.out.println("Ingrese autor del libro");
        setAutor(scanner.next());
        System.out.println("Ingrese el número de páginas del libro");
        setNumPag(scanner.nextInt());
    }
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {

        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }


     public void mostrarLibro() {
        System.out.println("El libro " + titulo + " del autor " + autor + " que tiene " + numPag + " páginas y su ISBN es " + isbn);
    }

}
