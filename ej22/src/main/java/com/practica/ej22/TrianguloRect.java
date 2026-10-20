package com.practica.ej22;

import java.util.Locale;

public class TrianguloRect extends FiguraRecta {

    // new TrianguloRect(3, 4) debe dar "alto: 3, ancho: 4", por eso el alto va primero
    public TrianguloRect(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return alto * ancho / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(alto * alto + ancho * ancho);
        return alto + ancho + hipotenusa;
    }

    @Override
    public String imprimeFigura() {
        // Locale.US asegura el punto decimal (6.00) aunque la computadora esté en español
        return super.imprimeFigura() + System.lineSeparator()
                + String.format(Locale.US,
                "Se imprime un Triangulo con alto: %d, ancho: %d, area: %.2f, perimetro: %.2f",
                alto, ancho, calcularArea(), calcularPerimetro());
    }
}
