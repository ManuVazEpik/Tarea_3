package com.practica.ej22;

/** Método main de la práctica (SOUT = System.out.println), sin modificar su lógica. */
public class Test {

    public static void main(String[] args) {
        Figura2D f = new TrianguloRect(3, 4);
        System.out.println(f.imprimeFigura());
        f = new Circulo(3);
        System.out.println(f.imprimeFigura());
    }
}
