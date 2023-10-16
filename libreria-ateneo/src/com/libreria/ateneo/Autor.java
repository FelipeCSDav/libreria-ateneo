/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreria.ateneo;

/**
 *
 * @author Near
 */
public class Autor {
    private String nombre, apellido, nacionalidad;

    public Autor() {
    }

    public Autor(String nombre, String apellido, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + '}';
    }
    
    public void imprimirInfo(){
        System.out.println("Nombre: "+this.nombre + "\nApellido: "+this.apellido + "\nNacionalidad: "+this.nacionalidad);
    }
}
