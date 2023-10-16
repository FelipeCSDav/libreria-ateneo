/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreria.ateneo;

/**
 *
 * @author Near
 */
public class Libro {
//Atributos
    private String titulo,isbn;
    private int precio;
    private Autor autor;
    
//Constructores
    public Libro() {
    }
    public Libro(String titulo, Autor autor, String isbn, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //CUSTOMERS
    public void mostrarInfo(){
        System.out.println("Titulo: "+this.titulo + "\nAutor: "+this.autor + "\nISBN: "+this.isbn + "\nPrecio: $"+this.precio);
    }
    
    public double calcularIva(){
        double IVA= 0.19;
        return this.precio * IVA;
    }
    
    
}
