package com.mparrastia.interfaz;

import com.mparrastia.estructuras.Frase;
import com.mparrastia.frases.GestorFraseDelDia;

public class Main {
    public static void main(String[] args) {
        GestorFraseDelDia gestorFraseDelDia = new GestorFraseDelDia();
        Frase fraseDelDia = gestorFraseDelDia.obtenerfraseDelDia();
        System.out.println("Frase del dia: " + fraseDelDia.getFrase() + " por " + fraseDelDia.getAutor());

    }
}
