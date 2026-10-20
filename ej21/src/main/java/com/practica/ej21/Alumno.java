package com.practica.ej21;

public class Alumno extends Persona {

    public Alumno() {
        super(); // llama a Persona(): nombre = "Sin nombre", edad = 0
        System.out.println("Se crea Alumno...");
    }

    @Override
    public String toString() {
        return "Un alumno llamado: " + nombre;
    }
}
