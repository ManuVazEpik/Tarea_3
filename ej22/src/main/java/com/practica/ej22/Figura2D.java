package com.practica.ej22;

/**
 * CLASE ABSTRACTA que implementa la interfaz. No define calcularArea() ni
 * calcularPerimetro(): esa obligación pasa a las subclases concretas.
 */
public abstract class Figura2D implements FiguraPlana {

    protected String imprimeFigura() {
        return "Se imprime una FiguraPlana...";
    }
}
