/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreria.ateneo;

import java.util.ArrayList;

/**
 *
 * @author Near
 */
public class Catalogo {
   private ArrayList<Libro> catalogo;

    public Catalogo() {
        this.catalogo = new ArrayList<Libro>();
    }
 
    //Agregar libros
    public void agregaLibros(Libro libro){
        this.catalogo.add(libro);
        System.out.println("Libro agregado");
    }
    
    //Mostrar libros
    public void mostrarCatalogo(){
        for (Libro libro : catalogo) {
            libro.mostrarInfo();
            System.out.println("");
        }
    }
    
   public void eliminarLibro(String isbn){
       for (Libro libro : catalogo) {
           if (libro.getIsbn().equalsIgnoreCase(isbn)) {
               catalogo.remove(libro);
               break;
           }
       }
   }
   
   public void buscarLibroApellido(String apellido){
       for (Libro libro : catalogo) {
           if (libro.getAutor().getApellido().equalsIgnoreCase(apellido)) {
               libro.mostrarInfo();
               break;
           }
       }
   }
   
}
