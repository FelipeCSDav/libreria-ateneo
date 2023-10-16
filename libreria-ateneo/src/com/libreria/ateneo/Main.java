/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreria.ateneo;

/**
 *
 * @author Near
 */
public class Main {
    public static void main(String[] args) {
        Autor mc = new Autor("Miguel", "Cervantes", "Caribeño");
        Autor jk = new Autor ("JK", "Rowling", "Britanica");
        Autor gm = new Autor("Gabriel", "Prado", "Peruano");
        Libro harry = new Libro("HarryPotter", jk, "1234", 50000);
        Libro cien = new Libro("Cien agnos", gm, "5468", 35000);
        Libro quijote = new Libro("Don quijote", mc, "4644", 15000);
        Catalogo cat = new Catalogo();
        
        //Agregar Libros
        cat.agregaLibros(harry);
        cat.agregaLibros(cien);
        cat.agregaLibros(quijote);
        System.out.println("");
        //Mostrar coleccion de libros
        cat.mostrarCatalogo();
        System.out.println("----------------------------------------------");
        //Eliminar libro
        cat.eliminarLibro("4644");
        //Volvemos a mostrar catalogo con el libro eliminado
        cat.mostrarCatalogo();
        //Buscar libro por apellido
        cat.buscarLibroApellido("Rowling");
        
    }
}
