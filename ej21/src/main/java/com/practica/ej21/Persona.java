package com.practica.ej21;

/** Clase base. Sus atributos son protected para que Alumno y Profesor los usen directamente. */
public class Persona {

    protected String nombre;
    protected int edad;

    public Persona() {
        nombre = "Sin nombre";
        edad = 0;
    }
}
