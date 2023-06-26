package com.mparrastia.frases;

import com.mparrastia.estructuras.Frase;
import com.mparrastia.utils.GeneradorDeFrasesAleatorias;

public class GestorFraseDelDia {

    private Frase fraseDelDia;

    public Frase obtenerfraseDelDia() {
        if (fraseDelDia == null) {
           fraseDelDia = GeneradorDeFrasesAleatorias.obtenerFraseAleatoria();
        }
        return fraseDelDia;
    }
}
